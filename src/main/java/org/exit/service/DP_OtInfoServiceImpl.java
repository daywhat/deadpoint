package org.exit.service;

import java.util.List;

import javax.inject.Inject;

import org.exit.domain.DP_OtInfoVO;
import org.exit.domain.Paging;
import org.exit.persistence.DP_OtInfoDAOImpl;
import org.springframework.stereotype.Service;

@Service
public class DP_OtInfoServiceImpl implements DP_OtInfoService{

	@Inject
	public DP_OtInfoDAOImpl dpotdao;
			
	@Override
	/* 
	 * otInfo 게시판 글 쓰기
	 */
	public void DP_OtWrite(DP_OtInfoVO dpotvo) {
		dpotdao.DP_OtWrite(dpotvo);
	}

	@Override
	/* 
	 *  
	 */
	public List<DP_OtInfoVO> DP_OtList(Paging paging) {
		return dpotdao.DP_OtList(paging);
	}

	
	// paging count
	@Override
	/* 
	 *  
	 */
	public int DP_OtListCount() {
		return dpotdao.DP_OtListCount();
	}

	@Override
	/* 
	 *  
	 */
	public DP_OtInfoVO DP_OtListDetail(int c_id) {
		return null;
	}

	@Override
	/* 
	 *  
	 */
	public void DP_OtDelete(int c_id) {
		
	}

	@Override
	/* 
	 *  
	 */
	public void DP_OtUpdate(DP_OtInfoVO dpovo) {
		
	}

}
