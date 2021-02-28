package com.cjo.freeboard.vo;

import java.util.Date;

public class ContentVo {
	private int JET_board_free_no;
	private int JET_member_no;
	private String JET_board_free_title;
	private String JET_board_free_content;
	private int JET_board_free_readcount;
	private Date JET_board_free_writedate;
	public ContentVo() {
		super();
	}
	public ContentVo(int jET_board_free_no, int jET_member_no, String jET_board_free_title,
			String jET_board_free_content, int jET_board_free_readcount, Date jET_board_free_writedate) {
		super();
		JET_board_free_no = jET_board_free_no;
		JET_member_no = jET_member_no;
		JET_board_free_title = jET_board_free_title;
		JET_board_free_content = jET_board_free_content;
		JET_board_free_readcount = jET_board_free_readcount;
		JET_board_free_writedate = jET_board_free_writedate;
	}
	public int getJET_board_free_no() {
		return JET_board_free_no;
	}
	public void setJET_board_free_no(int jET_board_free_no) {
		JET_board_free_no = jET_board_free_no;
	}
	public int getJET_member_no() {
		return JET_member_no;
	}
	public void setJET_member_no(int jET_member_no) {
		JET_member_no = jET_member_no;
	}
	public String getJET_board_free_title() {
		return JET_board_free_title;
	}
	public void setJET_board_free_title(String jET_board_free_title) {
		JET_board_free_title = jET_board_free_title;
	}
	public String getJET_board_free_content() {
		return JET_board_free_content;
	}
	public void setJET_board_free_content(String jET_board_free_content) {
		JET_board_free_content = jET_board_free_content;
	}
	public int getJET_board_free_readcount() {
		return JET_board_free_readcount;
	}
	public void setJET_board_free_readcount(int jET_board_free_readcount) {
		JET_board_free_readcount = jET_board_free_readcount;
	}
	public Date getJET_board_free_writedate() {
		return JET_board_free_writedate;
	}
	public void setJET_board_free_writedate(Date jET_board_free_writedate) {
		JET_board_free_writedate = jET_board_free_writedate;
	}
	
	
	
	
}
