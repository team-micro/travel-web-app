package com.hcl.springboot.controller.http;

import com.hcl.springboot.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface POST {
    public ResponseEntity<User> createUser(@RequestBody User user);

}
