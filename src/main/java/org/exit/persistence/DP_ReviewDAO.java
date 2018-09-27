package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_ReviewVO;

/**
 * Reviewø° ∞¸«— DAO
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		¿Ã¡§∫Û, ¡§∫Û
 * 
 */


public interface DP_ReviewDAO {
	
	public void DP_ReviewInsert(DP_ReviewVO dprvo);
	
	public List<DP_ReviewVO> DP_ReviewList();
	
	public List<DP_ReviewVO> DP_ReviewListDetail();
	
	public void DP_ReviewDelete(int b_id);
	
	public void DP_ReviewUpdate(DP_ReviewVO dprvo);

	public void DP_ReviewInsertRep();

	public void DP_ReviewDeleteRep(int bplust_id);
		
		
}
