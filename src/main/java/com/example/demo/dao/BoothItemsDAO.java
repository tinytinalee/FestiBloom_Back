package com.example.demo.dao;

import com.example.demo.entity.BoothItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoothItemsDAO extends JpaRepository<BoothItems, Integer> {
    List<BoothItems> findByFestivalNo(int festivalNo);
}
