package com.hcl.recommendservice.exception;

public class RecommendationNotFoundException extends Exception {
    private long recommendation_id;
    public RecommendationNotFoundException(long recommendation_id) {
        super(String.format("Recommendation not found with id: '%s'", recommendation_id));
    }
}
