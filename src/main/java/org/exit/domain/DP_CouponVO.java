package org.exit.domain;

import java.util.Date;

public class DP_CouponVO {
	
	private int cou_id;			//���� ��ȣ(AI ��)
	private String cou_name;	//���� �̸�(��:1000������, 5000������)
	private int cou_dc;			//���� ���αݾ�
	private Date cou_date;		//���� ����
	private int dp_id;			//ȸ�� ��ȣ
	
	
	public int getCou_id() {
		return cou_id;
	}
	public void setCou_id(int cou_id) {
		this.cou_id = cou_id;
	}
	public String getCou_name() {
		return cou_name == null ? "" : cou_name.trim();
	}
	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}
	public int getCou_dc() {
		return cou_dc;
	}
	public void setCou_dc(int cou_dc) {
		this.cou_dc = cou_dc;
	}
	public Date getCou_date() {
		return cou_date;
	}
	public void setCou_date(Date cou_date) {
		this.cou_date = cou_date;
	}
	public int getDp_id() {
		return dp_id;
	}
	public void setDp_id(int dp_id) {
		this.dp_id = dp_id;
	}
	
	
	
}