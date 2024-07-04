package com.kunal.firstjobapp.review;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/companies")
public class ReviewController {
    ReviewService reviewService;


    @GetMapping("/{companyId}/reviews")
    public List<Review> reviews(@PathVariable Long companyId) {
        return reviewService.reviews(companyId);
    }

    //2
    @PostMapping("/{companyId}/reviews")
    public void addReview(@PathVariable Long companyId,@RequestBody Review review){
        reviewService.addReview(companyId,review);
    }
    //3
    @GetMapping("/{companyId}/reviews/{reviewId}")
    public Review getReview(@PathVariable Long companyId, @PathVariable Long reviewId){
        return reviewService.getReviewById(companyId,reviewId);
    }
    //4
    @PutMapping("/{companyId}/reviews/{reviewId}")
    public String updateReview(@RequestBody Review review,@PathVariable Long companyId,@PathVariable Long reviewId){
        return reviewService.updateReview(review,companyId,reviewId);
    }

    @DeleteMapping("/{companyId}/reviews/{reviewId}")
    public void deleteReviewById(@PathVariable Long companyId,@PathVariable Long reviewId){
        reviewService.deleteReview(companyId,reviewId);
    }
}
