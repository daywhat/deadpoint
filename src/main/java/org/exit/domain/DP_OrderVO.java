package org.exit.domain;

import java.util.Date;

public class DP_OrderVO {
	
	private int 	order_id;		//�ֹ���ȣ
	private int 	order_tprice;	//�ֹ� �հ�ݾ�
	private int 	order_ea;		//�ֹ� ����
	private Date 	order_date;		//�ֹ� ��¥
	private int 	dppro_id;		//��ǰ ��ȣ
	private String	dppro_name;		//��ǰ�̸�(�Ǹ��ڰ� ����� �̸�)
	private int 	p_id;			//ȸ�� ��ȣ
	
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getOrder_tprice() {
		return order_tprice;
	}
	public void setOrder_tprice(int order_tprice) {
		this.order_tprice = order_tprice;
	}
	public int getOrder_ea() {
		return order_ea;
	}
	public void setOrder_ea(int order_ea) {
		this.order_ea = order_ea;
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
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getDppro_name() {
		return dppro_name == null ? "" : dppro_name.trim();
	}
	public void setDppro_name(String dppro_name) {
		this.dppro_name = dppro_name;
	}
	

}
