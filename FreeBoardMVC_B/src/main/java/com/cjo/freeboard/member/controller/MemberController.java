package com.cjo.freeboard.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjo.freeboard.member.service.MemberServiceImpl;
import com.cjo.freeboard.vo.MemberVo;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	
	//map.xml -> mapper -> service -> controller
	//컨트롤러 전은 서비스 이므로 서비스 주입 *오토 와이어드*걸어주기..
	@Autowired
	private MemberServiceImpl memberService;
	
	@RequestMapping("/login_page.do")
	public String loginPage() {
		System.out.println("free board MVC [loginPage] 실행됨");
		
		return "member/login_page";
	}
	
	
	@RequestMapping("/join_member_page.do")
	public String joinMemberPage() {
		System.out.println("free board MVC [joinMemberPage] 실행됨");
		
		//단순한 페이지 이동
		
		return "member/join_member_page";
	}
	
	@RequestMapping("/join_member_process.do")
	public String joinMemberProcess(MemberVo param) {
		System.out.println("free board MVC [joinMemberProcess] 실행됨");

		memberService.joinMember(param);
		//인서트된 memberVo값을 서비스로 인서트 .. 
		//아직 취미 넣기전...
		
		return "member/join_member_complete";
	}
	
	@RequestMapping("/login_process.do")
	public String loginprocess(MemberVo param, HttpSession session) {
		System.out.println("free board MVC [loginprocess] 실행됨");
		
		MemberVo sessionUser = memberService.login(param);
		
		if(sessionUser != null) {
			session.setAttribute("sessionUser", sessionUser);
			return "redirect:../content/main_page.do";
		}else {
			return "member/login_fail";
		}		
	}
	
	@RequestMapping("/logout_process.do")
	public String logoutProcess(HttpSession session ,HttpServletRequest request) {
		System.out.println("free board MVC [logoutProcess] 실행됨");
		
		session.invalidate();
		//세션을 지움 로그아웃 됨
		
		return "redirect:../content/main_page.do";
	}
	
}
