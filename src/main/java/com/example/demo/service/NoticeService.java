package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NoticeDAO;
import com.example.demo.entity.Notice;

@Service
public class NoticeService {
	@Autowired
    private NoticeDAO dao;

    // 공지 작성
    public Notice writeNotice(Notice notice) {
        notice.setNoticeCreated(new Date());
        return dao.save(notice);
    }

    // 공지 목록
    public List<Notice> getNoticeList(int festivalNo) {
        return dao.findByFestivalNoOrderByNoticeNoDesc(festivalNo);
    }

    // 공지 상세 조회
    public Notice getNotice(int noticeNo) {
        return dao.findById(noticeNo).orElse(null);
    }

    // 공지 수정
    public Notice updateNotice(Notice notice) {
        notice.setNoticeUpdated(new Date());
        return dao.save(notice);
    }

    // 공지 삭제
    public void deleteNotice(int noticeNo) {
        dao.deleteById(noticeNo);
    }
}
