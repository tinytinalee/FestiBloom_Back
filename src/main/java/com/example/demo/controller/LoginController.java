package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BusinessMemberDAO;
import com.example.demo.dao.CustomerMemberDAO;
import com.example.demo.entity.BusinessMember;
import com.example.demo.entity.CustomerMember;
import com.example.demo.entity.LoginRequest;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {
	
	@Autowired
	private BusinessMemberDAO bDao;
	
	@Autowired
	private CustomerMemberDAO cDao;
	
	@PostMapping("/customer")
	public CustomerMember CustomerLogin(@RequestBody LoginRequest req) {		
	
		String id  = req.getId();
	    String pwd = req.getPwd();
	    System.out.println("아이디: " + id);
	    System.out.println("비번: " + pwd);
	    if (cDao.existsByIdAndPwd(id, pwd)) {
	        CustomerMember m = new CustomerMember();
	        m.setCMemId(id);
	        m.setCMemName(cDao.findNameById(id));
	        System.out.println("고객 로그인 성공함");
	        return m;
	    } else {
	    	System.out.println("고객 로그인 실패함");
	        return null;
	    }
//		System.out.println("아이디: " + id);
//		System.out.println("비번: " + pwd);
//		if(cDao.existsByIdAndPwd(id, pwd)) {
//			CustomerMember m = new CustomerMember();
//			m.setCMemId(id);
//			m.setCMemName(cDao.findNameById(id));
//			System.out.println("로그인 성공함");
//			System.out.println(m);
//			
//			return m;
//		}else {
//			return null;
//		}
//		
	}
	
	@PostMapping("/business")
	public BusinessMember BusinessLogin(@RequestBody LoginRequest req) {		
	
		String id  = req.getId();
	    String pwd = req.getPwd();
	    System.out.println("아이디: " + id);
	    System.out.println("비번: " + pwd);
	    if (bDao.existsByIdAndPwd(id, pwd)) {
	        BusinessMember m = new BusinessMember();
	        m.setBMemId(id);
	        m.setBMemName(bDao.findNameById(id));
	        System.out.println("사업자 로그인 성공함");
	        return m;
	    } else {
	    	System.out.println("사업자 로그인 실패함");
	        return null;
	    }
		
	}
	
//	@PostMapping("/business")
//	public BusinessMember BusinessLogin(String id, String pwd) {		
//		
//		if(bDao.existsByIdAndPwd(id, pwd)) {
//			BusinessMember m = new BusinessMember();
//			m.setBMemId(id);
//			m.setBMemName(bDao.findNameById(id));
//			
//			return m;
//		}else {
//			return null;
//		}
//		
//	}
}
