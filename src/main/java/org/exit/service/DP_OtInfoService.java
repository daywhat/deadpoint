package org.exit.service;

import java.util.List;

import org.exit.domain.DP_OtInfoVO;
import org.exit.domain.Paging;

/**
 * otInfo �Խ����� ����
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������, ����
 * 
 */


public interface DP_OtInfoService {
	
	public void DP_OtWrite(DP_OtInfoVO dpotvo);
	
	public List<DP_OtInfoVO> DP_OtList(Paging paging);
	
	public int DP_OtListCount();

	public DP_OtInfoVO DP_OtListDetail(int c_id);
	
	public void DP_OtDelete(int c_id);
	
	public void DP_OtUpdate(DP_OtInfoVO dpovo);
	
	
}
