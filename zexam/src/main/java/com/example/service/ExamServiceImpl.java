package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.NoticeVO;
import com.example.repo.ExamDAO;

@Service
public class ExamServiceImpl implements ExamService{
	@Autowired
	private ExamDAO dao;

	@Override
	public List<NoticeVO> getNoticeList() {
		
		return dao.getNoticeList();
	}
	
}
