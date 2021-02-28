package com.cjo.freeboard.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjo.freeboard.member.mapper.MemberSQLMapper;
import com.cjo.freeboard.vo.MemberVo;

@Service
public class MemberServiceImpl {

	@Autowired
	private MemberSQLMapper memberSQLMapper;
	//map.xml -> mapper -> service -> controller
	
	public void joinMember(MemberVo vo) {
		
		memberSQLMapper.insert(vo);
		//1. 회원가입을 위한 첫번째 주입..
	}
	
	
	public MemberVo login(MemberVo param) {
		
		MemberVo result = memberSQLMapper.seleteByIdAndPw(param);
		
		return result;
	}
	
	
	
}
