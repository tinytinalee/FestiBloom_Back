package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Festival;



@Repository
public interface FestivalDAO extends JpaRepository<Festival, Integer> {

//    Festival findByFestivalNo(int festival_no);
}
