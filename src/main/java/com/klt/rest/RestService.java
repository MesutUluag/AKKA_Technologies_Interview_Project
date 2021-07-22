package com.klt.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.klt.Entity.Client;
import com.klt.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author Mauro Improta
 */
@Component
@Path("/")
public class RestService {

    @Autowired
    ClientService clientService;

    /**
     * testmap
     *
     * @return map containing fisch and suppe
     */
    @GET
    @Path("/testit")
    @Produces(APPLICATION_JSON_VALUE)
    public Map<String, String> getTestMap() {
        Map<String, String> returnMap = new HashMap<>();

        returnMap.put("fisch", "suppe");

        return returnMap;
    }

    @GET
    @Path("/age/{age}")
    @Produces(APPLICATION_JSON_VALUE)
    public String ageValidation(@PathParam("age") Integer age) {
        if (age < 18)
            return "too young";
        else if (age > 67)
            return "too old";
        else if (isPrime(age)){
            return "funny";
        } else {
            return "OK";
        }
    }

    @GET
    @Path("/clients")
    @Produces(APPLICATION_JSON_VALUE)
    public List<Client> getClients() {
        return clientService.getClientList();
    }

    boolean isPrime(Integer n){
        // Corner case
        if (n <= 1)
            return false;
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

}
