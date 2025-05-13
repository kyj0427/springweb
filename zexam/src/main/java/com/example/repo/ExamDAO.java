package com.example.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mapper.ExamMapper;
import com.example.model.NoticeVO;

@Repository
public class ExamDAO {
	@Autowired
	private ExamMapper examMapper;
	
	   public List<NoticeVO> getNoticeList() {
	        return examMapper.selectAllNotices();
	    }
	
 }

