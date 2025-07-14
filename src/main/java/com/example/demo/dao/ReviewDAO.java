package com.example.demo.dao;

import com.example.demo.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ReviewDAO extends JpaRepository<Review, Long> {

    List<Review> findByFestivalNoOrderByReviewNoDesc(Long festivalNo);

}
