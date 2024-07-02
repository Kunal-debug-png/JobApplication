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
    public List<String> reviews() {
        return null;
    }

    //2
    @PostMapping("/{companyId}/reviews")
    public void addReview(@PathVariable Long companyId){

    }
    //3
    @GetMapping("/{companyId}/reviews/{reviewId}")
    public String getReview(@PathVariable Long companyId,@PathVariable Long reviewId){
        return null;
    }
    //4
    @PutMapping("/{companyId}/reviews/{reviewId}")
    public String updateReview(@PathVariable Long companyId,@PathVariable Long reviewId){
        return null;
    }

    @DeleteMapping("/{companyId}/reviews/{reviewId}")
    public String reviewById(){
        return null;
    }
}
