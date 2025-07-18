package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Cast;

public interface CastDAO extends JpaRepository<Cast, Integer> {
    List<Cast> findByFestivalNo(int festivalNo);

}