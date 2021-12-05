package com.hcl.recommendservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "recommendations")
@Data
public class Recommendation {
    @Id
    @GeneratedValue
    private Long recommendationId;

    @NotBlank
    private Long destId;

    @NotBlank
    private String author;

    @NotBlank
    private int rate;

    @NotBlank
    private String content;
}
