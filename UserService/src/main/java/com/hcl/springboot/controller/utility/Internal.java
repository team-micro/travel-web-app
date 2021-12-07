package com.hcl.springboot.controller.utility;

import com.hcl.springboot.model.Destination;
import com.hcl.springboot.model.Recommendation;
import com.hcl.springboot.model.Review;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Internal {
    Logger logger = LoggerFactory.getLogger(Internal.class);
    public boolean isValidPassword(String password) {
        logger.trace("Home method accessed");
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    /**
     * GET Method for interfacing with external services
     * and getting a string of a JSON Array
     *
     * @return String
     */
    public String getJSONArrayAt(String baseUri, int port, String resourceName, String extension) {
//        final String uri = String.format("http://localhost:%d//%s//%s", port, resourceName, extension);
        final String uri = String.format(baseUri, port, resourceName, extension);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
        logger.trace(String.valueOf(response));
        return String.valueOf(response.getBody());
    }

    /**
     * Method for ping a particular service at a specific port for testing
     *
     * @param port
     * @param resourceName
     * @return
     */
    private ResponseEntity<Object[]> pingHelper(Integer port, String resourceName) {
        logger.trace("GET Method called");
        try {
            // TODO: NOTE endpoint formatting is subject to change, this is for basic integration testing
            String uri = String.format("http://localhost:%d//%s", port, resourceName);
            System.out.println("Pinged: " + uri);
            RestTemplate restTemplate = new RestTemplate();
            JSONObject reviewsJson = new JSONObject();
//            ResponseEntity<List<? extends Object>> reviews = new ArrayList<>();
            Object result = new ArrayList<>();
            if (resourceName.contains("src/test/review")) {
                logger.trace("GET Method called");
//                restTemplate.get
//                JSONParser parser = new JSONParser();
                result = restTemplate.getForEntity(uri, Review[].class);
                logger.trace(result.toString());
            } else if (resourceName.contains("src/test/destination")) {
                logger.trace("GET Method called");

                result = (Destination) restTemplate.getForObject(uri, Destination.class);
            } else if (resourceName.contains("src/test/recommendation")) {
                logger.trace("GET Method called");

                result = (Recommendation) restTemplate.getForObject(uri, Recommendation.class);
            }

            if (result == null) {
                logger.trace("PUT update on existing user");


                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            } else {
                logger.trace("PUT update on existing user");
                // TODO: should be the following
                //  return new ResponseEntity<>(result, HttpStatus.OK);
                return new ResponseEntity<>(null, HttpStatus.OK);
            }
        } catch (Exception e) {
            logger.trace("PUT update on existing user");

            System.out.println(e);
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
