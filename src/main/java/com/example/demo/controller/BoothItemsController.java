 package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dao.BoothItemsDAO;
import com.example.demo.entity.BoothItems;

@RestController
@RequestMapping("/booth-items")
@CrossOrigin
public class BoothItemsController {

    @Autowired
    private BoothItemsDAO dao;
    
    @GetMapping("/test")
    public String test() {
    	return "test";
    }
    
    //조회
    @GetMapping("/{festivalNo}")
    public List<BoothItems> getItemsByFestival(@PathVariable int festivalNo) {
        return dao.findByFestivalNo(festivalNo);
    }

    //등록
    @PostMapping
    public BoothItems createItem(@RequestBody BoothItems item) {
        return dao.save(item);
    }

    //수정
    @PutMapping("/{itemNo}")
    public BoothItems updateItem(@PathVariable int itemNo, @RequestBody BoothItems updatedItem) {
        updatedItem.setItem_no(itemNo);
        return dao.save(updatedItem);
    }

    //삭제
    @DeleteMapping("/{itemNo}")
    public void deleteItem(@PathVariable int itemNo) {
        dao.deleteById(itemNo);
    }
}
