package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.BoothItems;


public interface BoothItemsDAO extends JpaRepository<BoothItems, Integer> {

    List<BoothItems> findByFestivalNo(int festivalNo);

}
