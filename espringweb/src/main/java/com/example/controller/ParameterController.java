package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.MemberVO;

@Controller
public class ParameterController {

	@RequestMapping("param.do")
	public void param(String id, Integer age) {
		System.out.println("서버까지 파라메터 받음");
		System.out.println("아이디:" + id);
		System.out.println("나이:" + age);
	}
	
	@RequestMapping("paramtest.do")
	public void paramtest(String item, String cate) {
		
	}
	
	
	@RequestMapping("paramForm.do")
	// public void paramForm(String id, String name, Integer age) {
	public void paramForm(MemberVO vo, HttpSession session) {
		System.out.println("폼의 입력값을 서버에서 확인:" + vo.toString());
		
		/**********************
		 *  스프링에서 세션을 처리 => 인자에  HttpSession 변수만 선언
		 */
		Integer dbid = 1004;
		String  dbname = "홍길동";
		System.out.println(dbid == vo.getId());
		System.out.println(dbname.equals(vo.getName()));
		
		if(dbid.equals(vo.getId()) && dbname.equals(vo.getName())) {
			System.out.println("로그인확인");
			session.setAttribute("login", dbid+"님 로그인");
		}
		
	}
	
	
	
}
