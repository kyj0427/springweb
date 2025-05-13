package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.NoticeVO;
import com.example.service.ExamService;

@Controller
public class ExamController {
	@Autowired
	private ExamService service;
	@RequestMapping("/index")
	public String index(Model m) {
		List<NoticeVO> NoticeList = service.getNoticeList();
		m.addAttribute("noticeList" , NoticeList);
		
		return "index";
	}

		
		// 추후에는 디비연결 지금은 공지사항 가짜 데이터

		
		// 뷰페이지로 데이터 전송( 여기서 공지사항, QnA, 저자문의, 책정보이미지 ) 

}
	

