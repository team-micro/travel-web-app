package com.hcl.userservice.model;

import lombok.Data;

@Data
public class Review {
    long revId;
    String author, subject, content;


}
