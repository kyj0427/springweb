package com.javaclass.repository;

import org.mybatis.spring.SqlSessionTemplate;

import com.javaclass.domain.MemberVO;

//### (1) 해당 어노테이션 지정
public class MemberDAOImpl implements MemberDAO{

	//### (2) 해당 어노테이션 지정
	private SqlSessionTemplate sqlSession;
	
	public void insertMember(MemberVO vo) {
		sqlSession.insert(" ### (3)해당 Mapper의 해당 쿼리의 ID 지정 ", vo);
	}
	
	
}
