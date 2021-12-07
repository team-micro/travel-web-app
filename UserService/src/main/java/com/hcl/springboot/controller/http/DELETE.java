package com.hcl.springboot.controller.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface DELETE {
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") int id);
    public ResponseEntity<HttpStatus> deleteAllUsers();
}
