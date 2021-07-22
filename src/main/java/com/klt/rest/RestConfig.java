package com.klt.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/rest")
public class RestConfig extends ResourceConfig {
    public RestConfig() {
        registerEndpoints();
    }

    private void registerEndpoints() {
        register(RestService.class);
    }
}
