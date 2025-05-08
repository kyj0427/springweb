package com.example.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReviewController {
	
	/* 1. ModelAndView 을 리턴하는 경우 
	      -> 뷰페이지 지정과 데이타전송  	 
	 */
	@RequestMapping("review/modelandview.do")
	public ModelAndView test1() {
	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("review/modelandview");
		mv.addObject("myData", "나중에 디비에서 중요한 데이타");
		mv.addObject("serverTime", new Date().toString());
		return mv;
	}
	
	/* 2. void 리턴
	 		-> 요청명(request경로)와 동일한 뷰페이지 자동 지정
	 		-> 뷰페이지로 데이타 전송 Model 객체 이용
	 */
	@RequestMapping("review/void.do")
	public void test2(Model m) {
		
		m.addAttribute("myData", "나중에 디비에서 중요한 데이타");
		m.addAttribute("serverTime", new Date().toString());
	}
	
	/*
	 	3. 문자열 리턴인 경우 
	 		-> 뷰 페이지 지정
	 		-> 뷰페이지로 데이타 전송 Model 객체 이용
	 */
	@RequestMapping("review/string.do")
	public String test3(Model m) {
		
		m.addAttribute("testData", "디비에서 중요한 데이타");
		m.addAttribute("message","오늘도 우리팀 화이팅");
		
		return "review/string";
	}
	
	
}
