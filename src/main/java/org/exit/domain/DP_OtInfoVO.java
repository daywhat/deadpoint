package org.exit.domain;

import java.util.Date;

/**
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������
 */


public class DP_OtInfoVO {
	
	private int 	c_id;			//�� ��ȣ
	private String	c_title;		//�� ����
	private String	c_content;		//�� ����
	private int		c_hit;			//�� ��ȸ��
	private int		c_ref;			//�亯�� ����
	private Date	c_date;			//�ۼ� ��¥
	private int		dp_id;			//ȸ����ȣ
	private String	dp_nick;		//�г���
	
	private int 	cplus_id;		//��� ��ȣ
	private String 	c_pluscontent;	//��� ����
	private Date 	c_plusdate;		//�Է� ��¥
	
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_title() {
		return c_title == null ? "" : c_title.trim();
	}
	public void setC_title(String c_title) {
		this.c_title = c_title;
	}
	public String getC_content() {
		return c_content == null ? "" : c_content.trim();
	}
	public void setC_content(String c_content) {
		this.c_content = c_content;
	}
	public int getC_hit() {
		return c_hit;
	}
	public void setC_hit(int c_hit) {
		this.c_hit = c_hit;
	}
	public int getC_ref() {
		return c_ref;
	}
	public void setC_ref(int c_ref) {
		this.c_ref = c_ref;
	}
	public Date getC_date() {
		return c_date;
	}
	public void setC_date(Date c_date) {
		this.c_date = c_date;
	}
	public int getDp_id() {
		return dp_id;
	}
	public void setDp_id(int dp_id) {
		this.dp_id = dp_id;
	}
	public String getDp_nick() {
		return dp_nick == null ? "" : dp_nick.trim();
	}
	public void setDp_nick(String dp_nick) {
		this.dp_nick = dp_nick;
	}
	public int getCplus_id() {
		return cplus_id;
	}
	public void setCplus_id(int cplus_id) {
		this.cplus_id = cplus_id;
	}
	public String getC_pluscontent() {
		return c_pluscontent == null ? "" : c_pluscontent.trim();
	}
	public void setC_pluscontent(String c_pluscontent) {
		this.c_pluscontent = c_pluscontent;
	}
	public Date getC_plusdate() {
		return c_plusdate;
	}
	public void setC_plusdate(Date c_plusdate) {
		this.c_plusdate = c_plusdate;
	}
	
	
}