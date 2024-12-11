package com._Project.carServiceApp.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reviews")
public class ReviewsController {
    @Autowired
    private ReviewsServices reviewsServices;

    @GetMapping("/{revid}")
    public String getReviewbyId(@PathVariable int revid, Model model){
        Reviews review = reviewsServices.getReviewbyId(revid).orElseThrow(() -> new RuntimeException("Review not found"));
        model.addAttribute("review", review);
        model.addAttribute("title", revid);
        return "review";
    }

    //CHANGES FOR MVC NEW
    @GetMapping("/new")
    public String createNewReview(Model model){
        model.addAttribute("review", new Reviews());
        return "customer-signup"; //NEED TO CHANGE THIS
    }
    //adding new Review
    @PostMapping("/new")
    public String newReview(Reviews reviews){
        reviewsServices.newReview(reviews);
        return "redirect:/customer"; //NEED TO CHANGE THIS
    }

    @GetMapping("/update/{reviewid}")
    public String updateReview(@PathVariable int reviewid, Model model){
        Reviews review = reviewsServices.getReviewbyId(reviewid).orElseThrow(() -> new RuntimeException("Could not find review"));
        model.addAttribute("review", review);
        return "customer-signup"; //NEED TO  CHANGE THIS
    }

    @PostMapping("/update")
    public String updateReview(Reviews reviews){
        reviewsServices.saveReview(reviews);
        return "redirect:/customer/profile/" + reviews.getRevid(); //NEED TO CHANGE THIS
    }

    //CHANGES FOR MVC DELETE
    @GetMapping("/delete/{reviewid}")
    public String deletebyReviewId(@PathVariable int reviewid){
        reviewsServices.deletebyId(reviewid);
        return "redirect:/customer"; //NEED TO CHANGE THIS
    }
}
