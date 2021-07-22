package com.klt.Services;

import com.klt.Entity.Client;
import com.klt.Respository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ClientService {


    @Autowired
    private ClientRepository clientRepository;

    public ClientService(){
//        clientList = new ArrayList<>();
    }

    @Transactional
    public void addClient(Client client){
        clientRepository.save(client);
    }

    @Transactional
    public void removeClient(Long id){
        Client client = clientRepository.findOne(id);
        clientRepository.delete(id);
    }

    @Transactional
    public List<Client> getClientList() {
        return Collections.unmodifiableList(clientRepository.findAll());
    }
}
