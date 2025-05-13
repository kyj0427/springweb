package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.NoticeVO;

@Mapper
public interface ExamMapper {
	
	List<NoticeVO> selectAllNotices();

}
