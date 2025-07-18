package com.example.demo.service;

import com.example.demo.dao.BoothItemsDAO;
import com.example.demo.entity.BoothItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoothItemsService {

    @Autowired
    private BoothItemsDAO boothItemsDAO;

    public List<BoothItems> findByFestival(int festivalNo) {
        return boothItemsDAO.findByFestivalNo(festivalNo);
    }

}

