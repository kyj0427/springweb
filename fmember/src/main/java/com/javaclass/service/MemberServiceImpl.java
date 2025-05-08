package com.javaclass.service;

import com.javaclass.domain.MemberVO;
import com.javaclass.repository.MemberDAO;

//### (1) 해당 어노테이션 지정
public class MemberServiceImpl implements MemberService{

	// ### (2) 해당 어노테이션 지정
	private MemberDAO memberDAOImpl;
	
	public void insertMember(MemberVO vo) {
		memberDAOImpl.insertMember(vo);
	}
	
}
