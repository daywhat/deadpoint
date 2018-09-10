package org.exit.domain;

public class DP_MemberVO {
	
	private int 	dp_id;			//회원번호
	private String 	dp_name;		//아이디
	private String 	dp_pwd;			//비번
	private String 	dp_findpwd_q;	//비번 찾기 질문
	private String 	dp_findpwd_a;	//비번 찾기 답변
	private String 	dp_nick;		//닉네임
	private int 	dp_tel1;		//번호1
	private int 	dp_tel2;		//번호2
	private int 	dp_tel3;		//번호3
	private String 	dp_addr;		//주소
	private String 	dp_email1;		//이메일1
	private String	dp_email2;		//이메일2
	private int		dp_email_agree;	//이메일 수신동의
	private int 	dp_point;		//적립 포인트
	
	
	public int getDp_id() {
		return dp_id;
	}
	public void setDp_id(int dp_id) {
		this.dp_id = dp_id;
	}
	public String getDp_name() {
		return dp_name == null ? "" : dp_name.trim();
	}
	public void setDp_name(String dp_name) {
		this.dp_name = dp_name;
	}
	public String getDp_pwd() {
		return dp_pwd == null ? "" : dp_pwd.trim();
	}
	public void setDp_pwd(String dp_pwd) {
		this.dp_pwd = dp_pwd;
	}
	public String getDp_findpwd_q() {
		return dp_findpwd_q == null ? "" : dp_findpwd_q.trim();
	}
	public void setDp_findpwd_q(String dp_findpwd_q) {
		this.dp_findpwd_q = dp_findpwd_q;
	}
	public String getDp_findpwd_a() {
		return dp_findpwd_a == null ? "" : dp_findpwd_a.trim();
	}
	public void setDp_findpwd_a(String dp_findpwd_a) {
		this.dp_findpwd_a = dp_findpwd_a;
	}
	public String getDp_nick() {
		return dp_nick == null ? "" : dp_nick.trim();
	}
	public void setDp_nick(String dp_nick) {
		this.dp_nick = dp_nick;
	}
	public int getDp_tel1() {
		return dp_tel1;
	}
	public void setDp_tel1(int dp_tel1) {
		this.dp_tel1 = dp_tel1;
	}
	public int getDp_tel2() {
		return dp_tel2;
	}
	public void setDp_tel2(int dp_tel2) {
		this.dp_tel2 = dp_tel2;
	}
	public int getDp_tel3() {
		return dp_tel3;
	}
	public void setDp_tel3(int dp_tel3) {
		this.dp_tel3 = dp_tel3;
	}
	public String getDp_addr() {
		return dp_addr == null ? "" : dp_addr.trim();
	}
	public void setDp_addr(String dp_addr) {
		this.dp_addr = dp_addr;
	}
	public String getDp_email1() {
		return dp_email1 == null ? "" : dp_email1.trim();
	}
	public void setDp_email1(String dp_email1) {
		this.dp_email1 = dp_email1;
	}
	public String getDp_email2() {
		return dp_email2 == null ? "" : dp_email2.trim();
	}
	public void setDp_email2(String dp_email2) {
		this.dp_email2 = dp_email2;
	}
	public int getDp_email_agree() {
		return dp_email_agree;
	}
	public void setDp_email_agree(int dp_email_agree) {
		this.dp_email_agree = dp_email_agree;
	}
	public int getDp_point() {
		return dp_point;
	}
	public void setDp_point(int dp_point) {
		this.dp_point = dp_point;
	}
	
}