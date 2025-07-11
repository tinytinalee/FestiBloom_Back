package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Festival;

public interface FestivalDAO extends JpaRepository<Festival, Integer> {
    Festival findByFestivalNo(int festivalNo);
}
