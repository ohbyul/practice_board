package com.cjo.freeboard.content.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjo.freeboard.content.service.ContentServiceImpl;
import com.cjo.freeboard.vo.ContentVo;
import com.cjo.freeboard.vo.MemberVo;
import com.cjo.freeboard.vo.RepleVo;

@Controller
@RequestMapping("/content/*")
public class ContentController {

	//map.xml -> mapper -> service -> controller

	@Autowired
	private ContentServiceImpl contentService;
	
	
	@RequestMapping("main_page.do")
	public String mainPage(Model model) {
		System.out.println("free board MVC [mainPage] 실행됨");
		
		//메인 페이지에서 글쓴 목록 뽑아내자
		ArrayList<HashMap<String, Object>> resultList = contentService.getContentList();
	 	
		model.addAttribute("resultList", resultList);
		//단순히 출력만..노 페이지 처리 노 검색어..
		
		return "content/main_page";
	}

	@RequestMapping("write_content_page.do")
	public String writeContentPage() {
		System.out.println("free board MVC [writeContentPage] 실행됨");
	
		return "content/write_content_page";
	}
	
	@RequestMapping("write_content_process.do")
	public String writeContentProcess(ContentVo param , HttpSession session) {
		System.out.println("free board MVC [writeContentProcess] 실행됨");
		
		//글쓰기 데이터 처리..작성자 결합하기
		MemberVo sessionUser = (MemberVo)session.getAttribute("sessionUser");
		
		int JET_member_no = sessionUser.getJET_member_no();
		//멤버 no 빼오기
		
		param.setJET_member_no(JET_member_no);
		//contnetVo 에 포린키 주입
		
		contentService.writeContent(param);
		//param = contentVo임...
		
		return "redirect:./main_page.do";
	}
	
	@RequestMapping("/read_content_page.do")
	public String readContentPage(int JET_board_free_no, Model model) {
		System.out.println("free board MVC [readContentPage] 실행됨");

		HashMap<String, Object> map = contentService.getContent(JET_board_free_no);
		//글 뽑아오는거
		
		ArrayList<HashMap<String, Object>> resultList = contentService.getRepleList(JET_board_free_no);
		//리플 리스트 뽑아옴..
		
		model.addAttribute("result",map);
		//read_content_page.jsp 에 map 담아서 넘겨주기....
		model.addAttribute("reple", resultList);
		//리플 값도 모델에 넘겨주기.
		
		//리플은 출력은 컨트롤러에서 두줄만 추가하면됨..
		
		return "content/read_content_page";
	}
	
	@RequestMapping("delete_content_process.do")
	public String deleteContentProcess(int JET_board_free_no) {
		System.out.println("free board MVC [deleteContentProcess] 실행됨");

		contentService.deleteContent(JET_board_free_no);
		
		return "redirect:./main_page.do";
	}
	
	@RequestMapping("update_content_page.do")
	public String updateContentPage(int JET_board_free_no,Model model) {
		System.out.println("free board MVC [updateContentPage] 실행됨");

		HashMap<String, Object> map = contentService.getContent(JET_board_free_no);
		model.addAttribute("result",map);
		//모델에 넣어줌..jsp출력을 위해
		
		
		return "content/update_content_page";
	}
	
	@RequestMapping("update_content_process.do")
	public String updateContentProcess(ContentVo param) {
		System.out.println("free board MVC [updateContentProcess] 실행됨");

		contentService.updateContent(param);
		
		return "redirect:./main_page.do";
	}
	
	@RequestMapping("write_reple_process.do")
	public String writeRepleProcess(RepleVo param,int JET_board_free_no,HttpSession session) {
		
		MemberVo sessionUser =  (MemberVo)session.getAttribute("sessionUser");
		//로그인한 세션 값 memberVo로 하나있고
		int JET_member_no = sessionUser.getJET_member_no();
		param.setJET_member_no(JET_member_no);
		//세션값에 멤버번호 빼워서 리플 Vo에 로그인하고 글쓴사람 번호 세팅
		
		contentService.writeReple(param);
		
		return "redirect:./read_content_page.do?JET_board_free_no="+JET_board_free_no+"";
	}
	
	

	
	
	
	
}
