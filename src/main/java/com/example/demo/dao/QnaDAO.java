package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Qna;

public interface QnaDAO extends JpaRepository<Qna, Integer> {

	List<Qna> findByFestivalNoOrderByQnaNoDesc(int festivalNo);
	
}
