package org.exit.service;

import java.util.List;

import org.exit.domain.DP_ProductVO;
import org.exit.domain.DP_ReviewVO;

/**
 * �ֹ��� ���� ���� 
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������, ����
 * 
 */


public interface DP_OrderService {

	public List<DP_ProductVO> DP_OrderList(int dp_id);
	
	public int DP_OderSumPrice();

	public void DP_OderCancle(int order_id);
	
	public void DP_OderReviewWrite(DP_ReviewVO dprvo);
	
	public List<DP_ProductVO> DP_BaguniList();
	
	public int DP_BaguniSumPrice(int dp_id);
	
	public void DP_BaguniCancle();
		
	
}
