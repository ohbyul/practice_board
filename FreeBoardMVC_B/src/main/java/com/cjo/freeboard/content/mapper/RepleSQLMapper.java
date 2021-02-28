package com.cjo.freeboard.content.mapper;

import java.util.ArrayList;

import com.cjo.freeboard.vo.RepleVo;

public interface RepleSQLMapper {

	
	public void insert (RepleVo vo);
	//댓글 쓰기
	
	public ArrayList<RepleVo> selectByContentNo(int JET_board_free_no);
	//글 번호 뽑아오기

}
