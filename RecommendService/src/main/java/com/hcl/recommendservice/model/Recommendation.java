package com.hcl.recommendservice.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "recommendations")
@Data
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
