package com.hcl.reviewservice.repositories;

import com.hcl.reviewservice.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Review findReviewById(Integer id);
    List<Review> findAll();
    void deleteById(Integer id);
    void deleteAll();
}
