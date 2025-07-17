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

import com.example.demo.entity.Qna;
import com.example.demo.service.QnaService;

@RestController
@RequestMapping("/qna")
@CrossOrigin
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	//QnA 작성
    @PostMapping("/write")
    public Qna writeQna(@RequestBody Qna qna) {
        return qnaService.writeQna(qna);
    }

    //QnA 목록
    @GetMapping("/list/{festivalNo}")
    public List<Qna> getQnaList(@PathVariable("festivalNo") int festivalNo) {
    	System.out.println("hello");
        return qnaService.getQnaList(festivalNo);
    }

    //QnA 상세 조회
    @GetMapping("/detail/{qnaNo}")
    public Qna getQna(@PathVariable int qnaNo) {
        return qnaService.getQna(qnaNo);
    }

    //QnA 수정
    @PutMapping("/update/{qnaNo}")
    public Qna updateQna(@PathVariable int qnaNo, @RequestBody Qna qna) {
        qna.setQnaNo(qnaNo);
        return qnaService.updateQna(qna);
    }

    //QnA 삭제
    @DeleteMapping("/delete/{qnaNo}")
    public void deleteQna(@PathVariable int qnaNo) {
        qnaService.deleteQna(qnaNo);
    }

}
