package com.example.demo.controller;

import com.example.demo.dao.CastDAO;
import com.example.demo.entity.Cast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lineup")
@CrossOrigin
public class CastController {

    @Autowired
    private CastDAO dao;

    // 특정 페스티벌의 라인업 목록
    @GetMapping("/festival/{festivalNo}")
    public List<Cast> getByFestival(@PathVariable int festivalNo) {
        return dao.findByFestivalNo(festivalNo);
    }

    // 단건 조회 (수정용)
    @GetMapping("/{castNo}")
    public Cast getOne(@PathVariable int castNo) {
        return dao.findById(castNo).orElse(null);
    }

    // 등록
    @PostMapping
    public Cast insert(@RequestBody Cast cast) {
        return dao.save(cast);
    }

    // 수정
    @PutMapping("/{castNo}")
    public Cast update(@PathVariable int castNo, @RequestBody Cast cast) {
        cast.setCastNo(castNo);
        return dao.save(cast);
    }

    // 삭제
    @DeleteMapping("/{castNo}")
    public void delete(@PathVariable int castNo) {
        dao.deleteById(castNo);
    }
}
