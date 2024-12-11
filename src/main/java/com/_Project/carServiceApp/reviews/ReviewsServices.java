package com._Project.carServiceApp.reviews;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewsServices {
    @Autowired
    private ReviewsRepository reviewsRepository;

    //Method for getting review by its id
    public Optional<Reviews> getReviewbyId(Integer reviewid){
        return reviewsRepository.findById(reviewid);
    }

    //get all reviews
    public List<Reviews> getAllReviews() {
        return reviewsRepository.findAll();
    }

    //creating a new review
    public void newReview(Reviews review){
        reviewsRepository.save(review);
    }

    //updating a current review
    public void updateReview(Integer reviewid, Reviews reviews) {
        reviewsRepository.save(reviews);
    }

    //saving review
    public void saveReview(Reviews reviews){
        reviewsRepository.save(reviews);
    }

    public void deletebyId(int reviewid){
        reviewsRepository.deleteById(reviewid);
    }
}
