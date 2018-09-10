package org.exit.domain;

import java.util.Date;

public class DP_CouponVO {
	
	private int cou_id;			//쿠폰 번호(AI 값)
	private String cou_name;	//쿠폰 이름(예:1000원할인, 5000원할인)
	private int cou_dc;			//쿠폰 할인금액
	private Date cou_date;		//쿠폰 기한
	private int dp_id;			//회원 번호
	
	
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