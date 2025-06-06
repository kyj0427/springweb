package com.javassem.domain;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
	private int b_id;		// 게시글번호
	private String b_name;	// 작성자
	private String b_email;	// 이메일
	private String b_title;	// 제목
	private String b_content;	// 내용	
	private String b_pwd;	// 비밀번호
	private String b_date;	// 등록일
	private int b_count;	// 조회수
	
	private String b_fname;		// 파일명
	private String b_realfname; // 저장된 파일이름
	private long b_fsize;		// 파일크기
	
	//*************************************************
	
	private MultipartFile file; // *********** <input type='file'/ name='file'> 타입이 file & 이름이 file이어야한다

	//setter & getter 생성
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;

		//업로드 파일처리
		if( !file.isEmpty()) {
			this.b_fname = file.getOriginalFilename(); //원래사용자가 올린 파일명(멤버변수 강조하기위해 설정) 
			this.b_fsize = file.getSize();
			System.out.println("원본파일명:" + b_fname );
			System.out.println("파일크기:" + b_fsize );
			
			UUID uuid = UUID.randomUUID(); //random한 글자를 만들어줌
			this.b_realfname = uuid.toString() + "_" + b_fname;//확장자가 날라갈수있어서 uuid 를 붙힘 
			
			//-------------------------------------
			// 경로를 이렇게 개인경로로 사용하지 않습니다.
			// 해당 프로젝트의 경로를 찾는 방식 모색하기
			//upload 의 경로 붙혀넣고 반드시 \\ 두개 붙혀주어야한다.
			File f = new File("D:\\springweb\\hfileupload\\src\\main\\webapp\\resources\\upload\\"+b_realfname);
			
			try {
				file.transferTo(f); //오리지널 파일복사 (내가설정한 f파일명에 전송하겠다)
			} catch (IllegalStateException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			} 
			
		}
	}
	
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_email() {
		return b_email;
	}
	public void setB_email(String b_email) {
		this.b_email = b_email;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public String getB_pwd() {
		return b_pwd;
	}
	public void setB_pwd(String b_pwd) {
		this.b_pwd = b_pwd;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public int getB_count() {
		return b_count;
	}
	public void setB_count(int b_count) {
		this.b_count = b_count;
	}
	public String getB_realfname() {
		return b_realfname;
	}
	public void setB_realfname(String b_realfname) {
		this.b_realfname = b_realfname;
	}
	public String getB_fname() {
		return b_fname;
	}
	public void setB_fname(String b_fname) {
		this.b_fname = b_fname;
	}
	public long getB_fsize() {
		return b_fsize;
	}
	public void setB_fsize(long b_fsize) {
		this.b_fsize = b_fsize;
	}

	

}
