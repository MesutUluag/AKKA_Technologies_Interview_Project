package com.klt.web.controller;

import com.klt.Entity.Client;
import com.klt.Services.ClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * IndexController
 *
 * @author Mauro Improta
 */
@Controller
public class IndexController {
    private static final Logger LOGGER = LogManager.getLogger(IndexController.class);

    @Value("${form.title}")
    private String formTitle;

    @Autowired
    private ClientService clientService;

    /**
     * the index page
     *
     * @return ModelAndView for index page.
     */
    @GetMapping({"/", "/index"})
    public String index(Map<String, Object> model) {
        model.put("formName", formTitle);

        return "index";
    }


    /**
     * the index page
     *
     * @return ModelAndView for index page.
     */
    @PostMapping({"/", "/index"})
    public String submitForm(@RequestParam("firstName") String firstName,
                             @RequestParam("lastName") String lastName,
                             @RequestParam("age") String age,
                             Map<String, Object> model) {
        LOGGER.debug("submit first name {} last name {}", firstName, lastName, age);

        if((firstName.length() != 0) && (lastName.length() != 0) && (age.length()!=0)){
            Client client = new Client();
            client.setFirstName(firstName);
            client.setLastName(lastName);
            client.setAge(Integer.parseInt(age));
            clientService.addClient(client);
            model.put("clients", clientService.getClientList());
            return "clientsTable";
        } else{
            model.put("errorMessage", "Please fill all the empty fields");
            return "index";
        }
    }

//    @GetMapping({"/", "/clients"})
//    public String clients(Map<String, Object> model) {
//        model.put("clients", clientService.getClientList());
//        return "clientsTable";
//    }
}
