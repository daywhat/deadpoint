package org.exit.domain;

import java.sql.Date;

public class DP_ReviewVO {
	
	private int 	b_id;			//�� ��ȣ
	private int 	dppro_id;		//��ǰ��ȣ
	private String	dppro_name;		//��ǰ�̸�(�Ǹ��ڰ� ����� �̸�)
	private int 	dp_id;			//ȸ����ȣ
	private String 	b_title;		//�� ����
	private String 	b_content;		//�� ����
	private Date 	b_date;			//�� �ۼ���¥
	private int 	b_hit;			//�� ��ȸ��
	private int 	b_reg;			//��� ����
	private String 	dp_nick;		//�г���
	
	private int 	bplus_id;		//��۹�ȣ
	private String 	b_pluscontent;	//��۳���
	private Date 	b_plusdate;		//����ۼ���¥
	
	
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public int getDppro_id() {
		return dppro_id;
	}
	public void setDppro_id(int dppro_id) {
		this.dppro_id = dppro_id;
	}
	public int getDp_id() {
		return dp_id;
	}
	public void setDp_id(int dp_id) {
		this.dp_id = dp_id;
	}
	public String getB_title() {
		return b_title == null ? "" : b_title.trim();
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content == null ? "" : b_content.trim();
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public Date getB_date() {
		return b_date;
	}
	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}
	public int getB_hit() {
		return b_hit;
	}
	public void setB_hit(int b_hit) {
		this.b_hit = b_hit;
	}
	public int getB_reg() {
		return b_reg;
	}
	public void setB_reg(int b_reg) {
		this.b_reg = b_reg;
	}
	public String getDp_nick() {
		return dp_nick == null ? "" : dp_nick.trim();
	}
	public void setDp_nick(String dp_nick) {
		this.dp_nick = dp_nick;
	}
	public int getBplus_id() {
		return bplus_id;
	}
	public void setBplus_id(int bplus_id) {
		this.bplus_id = bplus_id;
	}
	public String getB_pluscontent() {
		return b_pluscontent == null ? "" : b_pluscontent.trim();
	}
	public void setB_pluscontent(String b_pluscontent) {
		this.b_pluscontent = b_pluscontent;
	}
	public Date getB_plusdate() {
		return b_plusdate;
	}
	public void setB_plusdate(Date b_plusdate) {
		this.b_plusdate = b_plusdate;
	}
	public String getDppro_name() {
		return dppro_name == null ? "" : dppro_name.trim();
	}
	public void setDppro_name(String dppro_name) {
		this.dppro_name = dppro_name;
	}
	
	
	
}