package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.MemberVO;
import com.example.model.MemberVOList;

@Controller
public class MultiInsertController {

	
	@RequestMapping("multiInsert.do")
	public String multiInsert( MemberVOList mList ) {
		System.out.println("----[ 컨트롤러 ] ---------");
		for(MemberVO vo  : mList.getList()) {
			System.out.println(vo.toString());
		}
		
		return "listResult";
	}
}
