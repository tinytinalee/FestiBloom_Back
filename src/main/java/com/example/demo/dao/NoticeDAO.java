package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Notice;
import com.example.demo.entity.Qna;

public interface NoticeDAO extends JpaRepository<Notice, Integer> {

	List<Notice> findByFestivalNoOrderByNoticeNoDesc(int festivalNo);
}
