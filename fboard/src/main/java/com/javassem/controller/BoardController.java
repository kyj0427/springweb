package com.javassem.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService=null;
	
	@RequestMapping("deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		
		return "redirect:getBoardList.do"; 
	}
	
	@RequestMapping("updateBoard.do")
	public String updateBoard(BoardVO vo) {
		System.out.println("수정할 항목 확인:"+ vo.toString());
		boardService.updateBoard(vo);
		
		return "redirect:getBoard?seq=" + vo.getSeq();
	}
	
	@RequestMapping("getBoard.do")
	public void getBoard(BoardVO vo, Model m) {
		
		BoardVO result = boardService.getBoard(vo);
		
		m.addAttribute("board", result);
		
	}
	
	
//	@RequestMapping("insertBoard.do")
//	public void insertBoard() {
//		
//	}

	/*
	 @RequestMapping("{step}.do")
	 public void viewpage(@PathVariable String step) {
		
	 }
	 */
	
			
	@RequestMapping("{step}.do")
	public String viewpage(@PathVariable String step) {
		
		return "board/"+step;
	}
	
	
	@RequestMapping("saveBoard.do")
	public String saveBoard(BoardVO vo) {
		System.out.println("입력값 확인:" + vo.toString());
		boardService.insertBoard(vo);
		
		//return "getBoardList";
		return "redirect:getBoardList.do"; 
	}
	
	@RequestMapping("getBoardList.do")
	public void getBoardList(Model m, String searchCondition, String searchKeyword ) {
		//System.out.println("[searchCondition]"+ searchCondition);
		//System.out.println("[searchKeyword]"+searchKeyword);
		
		HashMap map = new HashMap();		
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);

		/*
		   만일 제목선택하고 검색어입력에 'spring' 글자를 입력했다면
		   
		   [key]		 	[value]
		 searchCondition 	title
		 searchKeyword		spring	
		 */
		
		List<BoardVO> result = boardService.getBoardList(map);
		m.addAttribute("boardList", result);
		
	}
	
	
	
	

}
