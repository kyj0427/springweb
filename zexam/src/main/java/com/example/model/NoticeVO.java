package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//@Data << 생성자함수가 포함되어있지않다 

@Setter
@Getter
@NoArgsConstructor //인자없는 생성자함수 
@AllArgsConstructor //인자있는 생성자함수 
@ToString

public class NoticeVO {

	private Integer notice_no;
	private String notice_title;
	private String notice_content;
	private String notice_date; //db 의 날짜는 String으로 잡아도된다 
}
