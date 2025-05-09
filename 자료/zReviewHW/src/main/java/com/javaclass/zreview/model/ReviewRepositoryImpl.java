package com.javaclass.zreview.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.zreview.model.vo.CateVO;
import com.javaclass.zreview.model.vo.FoodVO;

// [1]

public class ReviewRepositoryImpl implements ReviewRepository{

	// [2]
	
	SqlSessionTemplate sqlsession;
	
	/* [2-1] Mapper에서 getCateList 아이디를 실행하여 List<CateVO>에 데이타를 가져와서 리턴한다. */
	public List<CateVO> getCateList() {
	
		// [확인] 여기서 디비값을 출력해 본다
		
		
		return null;
	}
	
	/* 	[2-2]
	 * 	Mapper에서 getFoodList 아이디를 실행할 때 
	 *  카테고리번호 값을 가지고 있는 CateVO를 파라미터로 넘기고
	 *  결과는  List<FoodVO>에 데이타를 가져와서 리턴한다. */	
	public List<FoodVO> getFoodList(CateVO cate) {
		
		// [확인] 여기서 디비값을 출력해 본다
	
		
		return null;
	}
}
