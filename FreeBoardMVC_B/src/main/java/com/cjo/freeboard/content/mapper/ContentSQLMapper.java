package com.cjo.freeboard.content.mapper;

import java.util.ArrayList;

import com.cjo.freeboard.vo.ContentVo;

public interface ContentSQLMapper {

	//글쓰기
	public void insert(ContentVo vo);
	
	//전체 출력 게시판출력..
	public ArrayList<ContentVo> selectAll();
	
	//글보기 글 내용
	public ContentVo selectByNo(int no);
	
	//글삭제
	public void deleteByNo(int no);
	
	//글 수정
	public void update(ContentVo vo);
	
	//글 조회수 증가
	public void increaseReadcount(int no);
	
	
}
