package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FestivalDAO;
import com.example.demo.entity.Festival;

@Service
public class FestivalService {

    @Autowired
    private FestivalDAO dao;

    public List<Festival> getAllFestivals() {
        return dao.findAll();
    }
    
    public Festival getFestival(int festivalNo) {
//        return dao.findByFestivalNo(festivalNo);
    	return dao.findById(festivalNo).get();
    }
}