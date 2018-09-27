package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_ProductVO;

/**
 * 林巩俊 包茄 DAO
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		捞沥后, 沥后
 * 
 */


public interface DP_OrderDAO {

	public List<DP_ProductVO> DP_OrderList(int order_id);

	public void DP_OderCancle(int order_id);
	
	public List<DP_ProductVO> DP_BaguniList();
	
	public int DP_BaguniSumPrice(int ba_id);

	public void DP_BaguniCancle(int ba_id);
		
	
}
