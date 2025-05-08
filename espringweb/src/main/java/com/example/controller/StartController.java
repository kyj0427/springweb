package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartController {

	@RequestMapping("start.do")
	public ModelAndView start() {
		System.out.println("start.do 요청을 받았음");
		
		ModelAndView mv = new ModelAndView();
		// 뷰페이지 지정   /WEB-INF/views/ + hello  + .jsp
		mv.setViewName("hello"); 
		mv.addObject("dbvalue", "나중에진짜디비값");
		mv.addObject("login", "나중에사용자아이디");
		
		return mv;
	}
}


/*
 	@Controller -> @Service -> @Repository
 
 	@Autowired
 	
 	-------
 	@Data
 	
*/
