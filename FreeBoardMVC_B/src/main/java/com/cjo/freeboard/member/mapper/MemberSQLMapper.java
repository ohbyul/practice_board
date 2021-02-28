package com.cjo.freeboard.member.mapper;

import com.cjo.freeboard.vo.MemberVo;

public interface MemberSQLMapper {

	public void insert(MemberVo vo);
	//회원가입시 인서트...

	public MemberVo seleteByIdAndPw(MemberVo vo);
	//로그인시 아이디 비번 셀렉트

	public MemberVo selectByNo(int no);
	//닉네임이랑 결합 할때 사용할것..
}
