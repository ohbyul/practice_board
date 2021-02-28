package com.cjo.freeboard.content.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjo.freeboard.content.mapper.ContentSQLMapper;
import com.cjo.freeboard.content.mapper.RepleSQLMapper;
import com.cjo.freeboard.member.mapper.MemberSQLMapper;
import com.cjo.freeboard.vo.ContentVo;
import com.cjo.freeboard.vo.MemberVo;
import com.cjo.freeboard.vo.RepleVo;

@Service
public class ContentServiceImpl {

	@Autowired
	private ContentSQLMapper contentSQLMapper;
	
	@Autowired
	private MemberSQLMapper memberSQLMapper;
	
	@Autowired
	private RepleSQLMapper repleSQLMapper;

	//글쓰기
	public void writeContent(ContentVo vo) {
		contentSQLMapper.insert(vo);
		//주입
	}
	
	//글 리스트 출력 메인 페이지에서 
	public ArrayList<HashMap<String, Object>> getContentList() {
		
		ArrayList<HashMap<String, Object>> resultList = new ArrayList<HashMap<String,Object>>();
		
		ArrayList<ContentVo> contentList = null;
		
		contentList = contentSQLMapper.selectAll();
		//아직 페이지 처리 검색어 처리 전.
		
		
		//contentVo + memberVo 병합하자 
		//닉네임을 넣어주려면 일단 해체후 다시 조립
		for (ContentVo contentVo : contentList) {
			int JET_member_no = contentVo.getJET_member_no();
			
			MemberVo memberVo = memberSQLMapper.selectByNo(JET_member_no);
			//글쓴사람 넘버로 리턴!
			
			HashMap<String, Object> map = new HashMap<String, Object>();
			
			map.put("memberVo", memberVo);
			map.put("contentVo", contentVo);
			
			resultList.add(map);
		}
		return resultList;
	}
	
	//글읽기.. 여기에 조회수 추가 이미지 출력도 추가.지금은 글읽기만..
	public HashMap<String, Object> getContent(int contentNo) {
		//리턴 타입 해쉬 맵인 이유 : 글번호에 해당하는 하나의 Vo만 출력하면 됨으로 \
		//memberVo 와 contentVo 엮어주기
		
		contentSQLMapper.increaseReadcount(contentNo);
		//조회수 증가 연동
		
		
		ContentVo contentVo = contentSQLMapper.selectByNo(contentNo);
		
		int JET_member_no = contentVo.getJET_member_no();
		MemberVo memberVo = memberSQLMapper.selectByNo(JET_member_no);
		
		//contentVo .. memberVo 각각 contentNo 에 맞는거 뽑아오기
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("contentVo", contentVo);
		map.put("memberVo", memberVo);
	
		return map;
	}
	
	//글삭제 가볍게 연동만 시켜 주면됨
	public void deleteContent(int contentNo) {
		contentSQLMapper.deleteByNo(contentNo);
	}
	
	//글수정 가볍게 연동
	public void updateContent(ContentVo vo) {
		contentSQLMapper.update(vo);
	}
	
	//리플 쓰기
	public void writeReple(RepleVo vo) {
		repleSQLMapper.insert(vo);
	}
	
	//리플 출력
	public ArrayList<HashMap<String, Object>> getRepleList(int contentNo) {

		ArrayList<HashMap<String, Object>> result = new ArrayList<HashMap<String,Object>>();
		
		ArrayList<RepleVo> repleVoList = repleSQLMapper.selectByContentNo(contentNo);
		
		for(RepleVo repleVo : repleVoList) {
		
			MemberVo memberVo = memberSQLMapper.selectByNo(repleVo.getJET_member_no());
	
			HashMap<String, Object> map = new HashMap<String, Object>();
			
			map.put("memberVo", memberVo);
			map.put("repleVo", repleVo);
			
			result.add(map);
		}		
		return result;
	}
	
	
	
}
