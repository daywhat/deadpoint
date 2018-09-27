package org.exit.domain;

import java.sql.Date;

/**
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		이정빈
 */


public class DP_ProductVO {
	
	private int 	order_id;		//주문번호
	private int 	dp_id;			//회원번호
	private int 	order_ea;		//주문상품 수량
	private int 	order_tprice;	//주문상품 합계금액
	private Date 	order_date;		//주문날짜
	private int 	dppro_id;		//상품번호
	private String	dppro_name;		//상품이름(판매자가 등록한 이름)
	
	private int 	dppro_price;	//상품가격	
	
	private int 	ba_ea;			//장바구니 상품수량
	private Date 	ba_date;		//장바구니 담은 날짜
	private int 	ba_id;			//장바구니 번호
	private int		ba_state;		//상품체크박스(구매할때 체크해서 구매/비구매)
	
	private int 	dppro_cat;		//상품 카테고리
	private int		dppro_gender;	//상품 성별
	
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getDp_id() {
		return dp_id;
	}
	public void setDp_id(int dp_id) {
		this.dp_id = dp_id;
	}
	public int getOrder_ea() {
		return order_ea;
	}
	public void setOrder_ea(int order_ea) {
		this.order_ea = order_ea;
	}
	public int getOrder_tprice() {
		return order_tprice;
	}
	public void setOrder_tprice(int order_tprice) {
		this.order_tprice = order_tprice;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public int getDppro_id() {
		return dppro_id;
	}
	public void setDppro_id(int dppro_id) {
		this.dppro_id = dppro_id;
	}
	public int getDppro_price() {
		return dppro_price;
	}
	public void setDppro_price(int dppro_price) {
		this.dppro_price = dppro_price;
	}
	public int getBa_ea() {
		return ba_ea;
	}
	public void setBa_ea(int ba_ea) {
		this.ba_ea = ba_ea;
	}
	public Date getBa_date() {
		return ba_date;
	}
	public void setBa_date(Date ba_date) {
		this.ba_date = ba_date;
	}
	public int getBa_id() {
		return ba_id;
	}
	public void setBa_id(int ba_id) {
		this.ba_id = ba_id;
	}
	public int getBa_state() {
		return ba_state;
	}
	public void setBa_state(int ba_state) {
		this.ba_state = ba_state;
	}
	public int getDppro_cat() {
		return dppro_cat;
	}
	public void setDppro_cat(int dppro_cat) {
		this.dppro_cat = dppro_cat;
	}
	public String getDppro_name() {
		return dppro_name;
	}
	public void setDppro_name(String dppro_name) {
		this.dppro_name = dppro_name;
	}
	public int getDppro_gender() {
		return dppro_gender;
	}
	public void setDppro_gender(int dppro_gender) {
		this.dppro_gender = dppro_gender;
	}
	
	
}