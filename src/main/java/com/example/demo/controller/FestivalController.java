package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.FestivalDAO;
import com.example.demo.entity.Festival;

@RestController
@RequestMapping("/festival")
@CrossOrigin()
public class FestivalController {
	@Autowired
	FestivalDAO dao;
	
	@GetMapping()
	public List<Festival> list(){
		return dao.findAll();
	}
}
