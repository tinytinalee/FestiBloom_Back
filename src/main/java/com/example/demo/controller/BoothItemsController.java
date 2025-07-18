package com.example.demo.controller;

import com.example.demo.entity.BoothItems;
import com.example.demo.service.BoothItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booth-items") // ✅ 이 경로 중요!
@CrossOrigin
public class BoothItemsController {

    @Autowired
    private BoothItemsService boothItemsService;

    @GetMapping("/{festivalNo}")
    public List<BoothItems> findByFestival(@PathVariable int festivalNo) {
        return boothItemsService.findByFestival(festivalNo);
    }

}