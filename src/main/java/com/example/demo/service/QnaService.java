package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.QnaDAO;
import com.example.demo.entity.Qna;

@Service
public class QnaService {
	
	@Autowired
    private QnaDAO dao;

    // QnA 작성
    public Qna writeQna(Qna qna) {
        qna.setQnaCreated(new Date());
        return dao.save(qna);
    }

    // QnA 목록
    public List<Qna> getQnaList(int festivalNo) {
        return dao.findByFestivalNoOrderByQnaNoDesc(festivalNo);
    }

    // QnA 상세 조회
    public Qna getQna(int qnaNo) {
        return dao.findById(qnaNo).orElse(null);
    }

    // QnA 수정
    public Qna updateQna(Qna qna) {
        qna.setQnaUpdated(new Date());
        return dao.save(qna);
    }

    // QnA 삭제
    public void deleteQna(int qnaNo) {
        dao.deleteById(qnaNo);
    }
}
