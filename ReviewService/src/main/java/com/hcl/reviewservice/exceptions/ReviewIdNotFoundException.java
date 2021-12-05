package com.hcl.reviewservice.exceptions;

public class ReviewIdNotFoundException extends Exception {
    public ReviewIdNotFoundException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
