package com.example.demo.service;

import com.example.demo.dao.ReviewDAO;
import com.example.demo.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewDAO dao;

    // 후기 작성
    public Review writeReview(Review review) {
        review.setReviewCreated(new Date());
        return dao.save(review);
    }

    // 후기 목록
    public List<Review> getReviewList(Long festivalNo) {
        return dao.findByFestivalNoOrderByReviewNoDesc(festivalNo);
    }

    // 후기 상세 조회
    public Review getReview(Long reviewNo) {
        return dao.findById(reviewNo).orElse(null);
    }

    // 후기 수정
    public Review updateReview(Review review) {
        review.setReviewUpdated(new Date());
        return dao.save(review);
    }

    // 후기 삭제
    public void deleteReview(Long reviewNo) {
        dao.deleteById(reviewNo);
    }
} 