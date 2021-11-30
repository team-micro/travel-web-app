package com.hcl.recommendservice.controller;

import com.hcl.recommendservice.exception.RecommendationNotFoundException;
import com.hcl.recommendservice.model.Recommendation;
import com.hcl.recommendservice.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
public class RecommendationController {

    @Autowired
    RecommendationRepository recommendationRepository;

    //Get all recommendations
    @GetMapping("/recommendations")
    public List<Recommendation> getAllRecommendations() { return recommendationRepository.findAll();}

    //Get single recommendation by Id
    @GetMapping("/recommendations/{id}")
    public Recommendation getRecommendationById(@PathVariable(value = "id") Long recommendationId)
        throws RecommendationNotFoundException {
        return recommendationRepository.findById(recommendationId)
                .orElseThrow(() -> new RecommendationNotFoundException(recommendationId));
    }

    //Create a recommendation
    @PostMapping("/recommendations")
    public Recommendation createRecommendation(@Valid @RequestBody Recommendation recommendation) {
        return recommendationRepository.save(recommendation);
    }

    //Update recommendation
    @PutMapping("/recommendations/{id}")
    public Recommendation updateRecommendationContent(@PathVariable(value = "id") Long recommendationId,
                                                      @Valid @RequestBody Recommendation recDetails) throws RecommendationNotFoundException {
        Recommendation recommendation = recommendationRepository.findById(recommendationId)
                .orElseThrow(() -> new RecommendationNotFoundException(recommendationId));

        recommendation.setDestId(recDetails.getDestId());
        recommendation.setContent(recDetails.getContent());
        recommendation.setRate(recDetails.getRate());

        Recommendation updatedRecommendation = recommendationRepository.save(recommendation);

        return updatedRecommendation;

    }

    //Delete a recommendation
    @DeleteMapping("/recommendations/{id}")
    public ResponseEntity<?> deleteRecommendation(@PathVariable(value = "id") Long recommendationId) throws RecommendationNotFoundException {
        Recommendation recommendation = recommendationRepository.findById(recommendationId)
                .orElseThrow(() -> new RecommendationNotFoundException(recommendationId));
        recommendationRepository.delete(recommendation);

        return ResponseEntity.ok().build();
    }


}
