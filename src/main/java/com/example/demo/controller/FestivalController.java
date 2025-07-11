package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dao.FestivalDAO;
import com.example.demo.entity.Festival;
import com.example.demo.service.FestivalService;

@RestController
@RequestMapping("/festival")
@CrossOrigin
public class FestivalController {
	

    @Autowired
    private FestivalService service;

    //전체 페스티벌 목록 조회
    @GetMapping
    public List<Festival> list() {
        return service.getAllFestivals();
    }


    //단일 페스티벌 상세 조회 (날씨용 등)
    @GetMapping("/{festivalNo}")
    public Festival getFestival(@PathVariable int festivalNo) {
        return service.getFestival(festivalNo);
    }

}
