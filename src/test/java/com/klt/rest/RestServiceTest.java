package com.klt.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Map;

/**
 * tests a little bit RestService
 * @author Mauro Improta
 */
public class RestServiceTest {

    /**
     * testit
     */
    @Test
    public void restTestit() {
        RestService restService = new RestService();
        Map<String, String> testMap = restService.getTestMap();
        assertEquals("suppe", testMap.get("fisch"));
    }

    @Test
    public void ageValidation() {
        RestService restService = new RestService();
        String response = restService.ageValidation(13);
        assertEquals("too young", response);
        response = restService.ageValidation(68);
        assertEquals("too old", response);
        response = restService.ageValidation(23);
        assertEquals("funny", response);
        response = restService.ageValidation(20);
        assertEquals("OK", response);
    }


}
