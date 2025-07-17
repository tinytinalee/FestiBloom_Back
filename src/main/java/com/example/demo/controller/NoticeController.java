package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Notice;
import com.example.demo.service.NoticeService;

@RestController
@RequestMapping("/notice")
@CrossOrigin
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	//공지 작성
    @PostMapping("/write")
    public Notice writeNotice(@RequestBody Notice notice) {
        return noticeService.writeNotice(notice);
    }

    //공지 목록
    @GetMapping("/list/{festivalNo}")
    public List<Notice> getNoticeList(@PathVariable("festivalNo") int festivalNo) {
        return noticeService.getNoticeList(festivalNo);
    }

    //공지 상세 조회
    @GetMapping("/detail/{noticeNo}")
    public Notice getNotice(@PathVariable int noticeNo) {
        return noticeService.getNotice(noticeNo);
    }

    //공지 수정
    @PutMapping("/update/{noticeNo}")
    public Notice updateNotice(@PathVariable int noticeNo, @RequestBody Notice notice) {
        notice.setNoticeNo(noticeNo);
        return noticeService.updateNotice(notice);
    }

    //공지 삭제
    @DeleteMapping("/delete/{noticeNo}")
    public void deleteNotice(@PathVariable int noticeNo) {
        noticeService.deleteNotice(noticeNo);
    }

}
