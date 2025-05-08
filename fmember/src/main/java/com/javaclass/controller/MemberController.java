package com.javaclass.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.MemberVO;
import com.javaclass.service.MemberService;

// ### (1) 해당 어노테이션 지정
public class MemberController {

	// ### (2) 해당 어노테이션 지정
	private MemberService memberServiceImpl;
	
	@RequestMapping("/{step}.do")
	public String viewPage(@PathVariable String step) {
		return step;
	}
	
	// ### (3) 해당 어노테이션 지정
	public void insertMember( MemberVO vo ) {
		memberServiceImpl.insertMember(vo);
	}
	

	
}
