package com.hcl.springboot.controller.http;

import com.hcl.springboot.model.Review;
import com.hcl.springboot.model.User;
import org.codehaus.jettison.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface GET {
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String userId);
    public ResponseEntity<List<Review>> getUserAllReviews(@PathVariable("user_id") Integer user_id) throws JSONException;
    public ResponseEntity<User> getUserById(@PathVariable("user_id") int user_id) throws JSONException;
}
