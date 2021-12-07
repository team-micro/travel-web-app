package com.hcl.springboot.controller.http;

import com.hcl.springboot.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface UPDATE {
    public ResponseEntity<User> updateUser(@PathVariable("id") int id, @RequestBody User user);
}
