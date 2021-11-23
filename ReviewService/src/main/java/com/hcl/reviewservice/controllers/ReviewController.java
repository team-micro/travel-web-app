package com.hcl.reviewservice.controllers;

import com.hcl.reviewservice.exceptions.ReviewIdNotFoundException;
import com.hcl.reviewservice.models.Review;
import com.hcl.reviewservice.repositories.ReviewRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/review")
public class ReviewController {
    Logger logger = LoggerFactory.getLogger(ReviewController.class);

    @Autowired
    private ReviewRepository reviewRepository;

    @RequestMapping("/")
    public String Index() {
        logger.trace("Home method accessed");
        return "Review Page";
    }

    @PostMapping("/add")
    public String addReview(@RequestParam int destId, @RequestParam String author,
                                   @RequestParam String subject, @RequestParam String content) {
        try {
            logger.trace("Add method accessed");
            Review review = new Review();
            review.setDestId(destId);
            review.setAuthor(author);
            review.setSubject(subject);
            review.setContent(content);
            reviewRepository.save(review);
            logger.trace("Successfully added " + review.getId() + "to database!");
            return "Review saved!";
        } catch (Exception e) {
            logger.trace("Failed to add review to database.");
            return "Couldn't add new review item, exception: " + e;
        }
    }

    @GetMapping("/all")
    public Iterable<Review> getAllReviews() {
        logger.trace("get-all method accessed");
        try {
            return reviewRepository.findAll();
        } catch (Exception e) {
            logger.error("Failed to get list of reviews, see exception log");
            throw e;
        }

    }

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable("id") int reviewId) throws ReviewIdNotFoundException {
        logger.trace("get-by-id method accessed");
        if (!reviewRepository.existsById(reviewId)) {
            logger.error("Could not find review by id");
            System.out.println("Couldn't find review with the ID provided.\n");
            return null;
        }

        logger.trace("Successfully found review #" + reviewId);
        return reviewRepository.findReviewById(reviewId);

    }

    @PostMapping("/update/{id}")
    public String updateReviewById(@PathVariable("id") int reviewId,
                                                 @RequestParam int destId, @RequestParam String author,
                                                 @RequestParam String subject, @RequestParam String content) {

        logger.trace("update-by-id method accessed");
        if (!reviewRepository.existsById(reviewId)) {
            logger.error("Could not find review by id");
            return "Couldn't find review with the ID provided.\n";
        }

        logger.trace("Successfully found review #" + reviewId);
        try {
            Review reviewToBeUpdated = reviewRepository.findReviewById(reviewId);
            reviewToBeUpdated.setDestId(destId);
            reviewToBeUpdated.setAuthor(author);
            reviewToBeUpdated.setSubject(subject);
            reviewToBeUpdated.setContent(content);
            reviewRepository.save(reviewToBeUpdated);
            logger.trace("Successfully updated review #" + reviewId);
            return "Updated review #" + reviewToBeUpdated.getId();
        } catch (Exception e) {
            logger.error("Failed to update review #" + reviewId + ", see exception log");
            return "Could not update review: " + e;
        }


    }
    @GetMapping("/delete/all")
    public String deleteAllReviews() {
        if (reviewRepository.findAll() == null) {
            logger.trace("Could not delete database, database is empty.");
            return "Review database is already empty!\n";
        }

        try {
            reviewRepository.deleteAll();
            return "All reviews have been deleted.\n";
        } catch (Exception e) {
            logger.error("Failed to delete database, see exception log");
            return "Failed to delete database: " + e;
        }

    }
    @GetMapping("/delete/{id}")
    public String deleteReviewById(@PathVariable("id") Integer reviewId) {
        if (!reviewRepository.existsById(reviewId)) {
            logger.error("Could not find review by id");
            return "Couldn't find review with the ID provided.\n";
        }

        try {
            reviewRepository.deleteById(reviewId);
            return "Successfully deleted review # " + reviewId;
        } catch (Exception e) {
            logger.error("Could not delete review #" + reviewId);
            return "Failed to delete review #" + reviewId + ", exception log: " + e;
        }

    }
}
