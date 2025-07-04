package com.example.demo.controller;

import com.example.demo.entity.Review;
import com.example.demo.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // 후기 작성
    @PostMapping("/write")
    public Review writeReview(@RequestBody Review review) {
        return reviewService.writeReview(review);
    }

    // 후기 목록
    @GetMapping("/list")
    public List<Review> getReviewList(@RequestParam("festivalNo") Long festivalNo) {
        return reviewService.getReviewList(festivalNo);
    }

    // 후기 상세 조회
    @GetMapping("/detail/{reviewNo}")
    public Review getReview(@PathVariable Long reviewNo) {
        return reviewService.getReview(reviewNo);
    }

    // 후기 수정
    @PutMapping("/update/{reviewNo}")
    public Review updateReview(@PathVariable Long reviewNo, @RequestBody Review review) {
        review.setReviewNo(reviewNo);
        return reviewService.updateReview(review);
    }

    // 후기 삭제
    @DeleteMapping("/delete/{reviewNo}")
    public void deleteReview(@PathVariable Long reviewNo) {
        reviewService.deleteReview(reviewNo);
    }
}