package org.exit.domain;

import java.sql.Date;

/**
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������
 */


public class DP_ProductVO {
	
	private int 	order_id;		//�ֹ���ȣ
	private int 	dp_id;			//ȸ����ȣ
	private int 	order_ea;		//�ֹ���ǰ ����
	private int 	order_tprice;	//�ֹ���ǰ �հ�ݾ�
	private Date 	order_date;		//�ֹ���¥
	private int 	dppro_id;		//��ǰ��ȣ
	private String	dppro_name;		//��ǰ�̸�(�Ǹ��ڰ� ����� �̸�)
	
	private int 	dppro_price;	//��ǰ����	
	
	private int 	ba_ea;			//��ٱ��� ��ǰ����
	private Date 	ba_date;		//��ٱ��� ���� ��¥
	private int 	ba_id;			//��ٱ��� ��ȣ
	private int		ba_state;		//��ǰüũ�ڽ�(�����Ҷ� üũ�ؼ� ����/�񱸸�)
	
	private int 	dppro_cat;		//��ǰ ī�װ�
	private int		dppro_gender;	//��ǰ ����
	
	
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