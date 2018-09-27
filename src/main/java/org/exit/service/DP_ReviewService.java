package org.exit.service;

import java.util.List;

import org.exit.domain.DP_ReviewVO;

/**
 * Review �Խ��� ����
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������, ����
 * 
 */


public interface DP_ReviewService {
	
	public void DP_ReviewWrite(DP_ReviewVO dprvo);
	
	public List<DP_ReviewVO> DP_ReviewList();
	
	public List<DP_ReviewVO> DP_ReviewDetail();
	
	public void DP_ReviewDelete(int b_id);
	
	public void DP_ReviewUpdate(DP_ReviewVO dprvo);
			
	public void DP_ReviewInsertRep();

	public void DP_ReviewDeleteRep(int bplust_id);
		
		
}
