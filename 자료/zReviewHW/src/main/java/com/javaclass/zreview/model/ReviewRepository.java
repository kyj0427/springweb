package com.javaclass.zreview.model;

import java.util.List;

import com.javaclass.zreview.model.vo.CateVO;
import com.javaclass.zreview.model.vo.FoodVO;

public interface ReviewRepository {
	public List<CateVO> getCateList();
	public List<FoodVO> getFoodList(CateVO cate);
}
