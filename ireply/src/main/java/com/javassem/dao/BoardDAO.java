package com.javassem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.javassem.domain.BoardVO;

@Mapper //boardmapper 에서 연결고리를 만들어줘야한다
public interface BoardDAO { 
	//함수들이 id와 반드시 같아야한다
	public void insertBoard(BoardVO vo);

	public void updateBoard(BoardVO vo) ;

	public void deleteBoard(BoardVO vo);

	public BoardVO getBoard(BoardVO vo) ;

	public List<BoardVO> getBoardList(BoardVO vo) ; //리턴 , id(mapper) , 파라미터
}
