package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Festival;



@Repository
public interface FestivalDAO extends JpaRepository<Festival, Integer> {

    Festival findByFestivalNo(int festivalNo);
    
    @Query("SELECT f FROM Festival f WHERE f.bMemId = :id")
    List<Festival> findMine(String id);

}