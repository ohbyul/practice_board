package com.cjo.freeboard.vo;

import java.util.Date;

public class RepleVo {

	private int JET_board_free_reple_no;
	private int JET_board_free_no;
	private int JET_member_no;
	private String JET_board_free_reple_content;
	private Date JET_board_free_reple_writedate;
	public RepleVo() {
		super();
	}
	public RepleVo(int jET_board_free_reple_no, int jET_board_free_no, int jET_member_no,
			String jET_board_free_reple_content, Date jET_board_free_reple_writedate) {
		super();
		JET_board_free_reple_no = jET_board_free_reple_no;
		JET_board_free_no = jET_board_free_no;
		JET_member_no = jET_member_no;
		JET_board_free_reple_content = jET_board_free_reple_content;
		JET_board_free_reple_writedate = jET_board_free_reple_writedate;
	}
	public int getJET_board_free_reple_no() {
		return JET_board_free_reple_no;
	}
	public void setJET_board_free_reple_no(int jET_board_free_reple_no) {
		JET_board_free_reple_no = jET_board_free_reple_no;
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
	public String getJET_board_free_reple_content() {
		return JET_board_free_reple_content;
	}
	public void setJET_board_free_reple_content(String jET_board_free_reple_content) {
		JET_board_free_reple_content = jET_board_free_reple_content;
	}
	public Date getJET_board_free_reple_writedate() {
		return JET_board_free_reple_writedate;
	}
	public void setJET_board_free_reple_writedate(Date jET_board_free_reple_writedate) {
		JET_board_free_reple_writedate = jET_board_free_reple_writedate;
	}
	
}
