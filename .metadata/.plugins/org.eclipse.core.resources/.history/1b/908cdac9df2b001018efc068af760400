package com.javassem.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.SampleVO;

//@Controller
@RestController
public class SampleController {

	// 1.문자열 반환
	@RequestMapping(value="getText", produces="text/plain; charset=UTF-8")
	//@ResponseBody
	public String getText() {
		return "서버에서 보내는 데이타";
	}
	
	
	// 2. 객체 반환
	@RequestMapping("getObject")
	public SampleVO getObject() {
		SampleVO vo = new SampleVO("홍길동", 22, "오늘도 맛점합시다");
		return vo;
	}
	
	// 3. 리스트 반환
	@RequestMapping("getList")
	public ArrayList<SampleVO> getList() {
		ArrayList<SampleVO> list = new ArrayList<SampleVO>();
		list.add(new SampleVO("홍길동", 22, "짝꿍님"));
		list.add(new SampleVO("홍길자", 33, "오늘도"));
		list.add(new SampleVO("홍길순", 44, "잘부탁합니다"));
		return list;
	}
	
	
	// 5. 폼전송
	@RequestMapping("sample/data")	
	public SampleVO xxxx(SampleVO vo) {
		
		return vo;
	}
	
	// 4. url에서 정보받기
	@RequestMapping("sample/{cate}/{cno}")
	public String[] sample(@PathVariable String cate, @PathVariable String cno) {
		System.out.println(cate +"/" + cno);
		
		return new String[] {"카테고리:"+ cate, "번호:" + cno };
	}
	
	
	@RequestMapping("sample2")
	public String[] sample2(@RequestParam String cate, @RequestParam String id) {
		return new String[] {"카테고리:"+ cate, "번호:" + id };
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
