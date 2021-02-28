package com.cjo.freeboard.vo;

import java.util.Date;

public class MemberVo {

    private int JET_member_no;
    private String JET_member_id;
    private String JET_member_pw;
    private String JET_member_name;
    private String JET_member_nick;
    private String JET_member_phone;
    private String JET_member_kakao;
    private int JET_member_grade;
    private int JET_member_credit;
    private Date JET_member_joindate;
    private Date JET_member_dropoutdate;
	public MemberVo() {
		super();
	}
	public MemberVo(int jET_member_no, String jET_member_id, String jET_member_pw, String jET_member_name,
			String jET_member_nick, String jET_member_phone, String jET_member_kakao, int jET_member_grade,
			int jET_member_credit, Date jET_member_joindate, Date jET_member_dropoutdate) {
		super();
		JET_member_no = jET_member_no;
		JET_member_id = jET_member_id;
		JET_member_pw = jET_member_pw;
		JET_member_name = jET_member_name;
		JET_member_nick = jET_member_nick;
		JET_member_phone = jET_member_phone;
		JET_member_kakao = jET_member_kakao;
		JET_member_grade = jET_member_grade;
		JET_member_credit = jET_member_credit;
		JET_member_joindate = jET_member_joindate;
		JET_member_dropoutdate = jET_member_dropoutdate;
	}
	public int getJET_member_no() {
		return JET_member_no;
	}
	public void setJET_member_no(int jET_member_no) {
		JET_member_no = jET_member_no;
	}
	public String getJET_member_id() {
		return JET_member_id;
	}
	public void setJET_member_id(String jET_member_id) {
		JET_member_id = jET_member_id;
	}
	public String getJET_member_pw() {
		return JET_member_pw;
	}
	public void setJET_member_pw(String jET_member_pw) {
		JET_member_pw = jET_member_pw;
	}
	public String getJET_member_name() {
		return JET_member_name;
	}
	public void setJET_member_name(String jET_member_name) {
		JET_member_name = jET_member_name;
	}
	public String getJET_member_nick() {
		return JET_member_nick;
	}
	public void setJET_member_nick(String jET_member_nick) {
		JET_member_nick = jET_member_nick;
	}
	public String getJET_member_phone() {
		return JET_member_phone;
	}
	public void setJET_member_phone(String jET_member_phone) {
		JET_member_phone = jET_member_phone;
	}
	public String getJET_member_kakao() {
		return JET_member_kakao;
	}
	public void setJET_member_kakao(String jET_member_kakao) {
		JET_member_kakao = jET_member_kakao;
	}
	public int getJET_member_grade() {
		return JET_member_grade;
	}
	public void setJET_member_grade(int jET_member_grade) {
		JET_member_grade = jET_member_grade;
	}
	public int getJET_member_credit() {
		return JET_member_credit;
	}
	public void setJET_member_credit(int jET_member_credit) {
		JET_member_credit = jET_member_credit;
	}
	public Date getJET_member_joindate() {
		return JET_member_joindate;
	}
	public void setJET_member_joindate(Date jET_member_joindate) {
		JET_member_joindate = jET_member_joindate;
	}
	public Date getJET_member_dropoutdate() {
		return JET_member_dropoutdate;
	}
	public void setJET_member_dropoutdate(Date jET_member_dropoutdate) {
		JET_member_dropoutdate = jET_member_dropoutdate;
	}
    



	
}
