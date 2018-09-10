package org.exit.service;

import java.util.List;

import org.exit.domain.DP_OtInfoVO;

//ㅡㅡ(옷정보 커뮤니티)ㅡㅡ///////////////////////////////////////////////////
public interface DP_OtInfoService {
	
	//게시물 작성
	public void DP_OtWrite(DP_OtInfoVO dpovo);
	
	//게시물 리스트 보기
	public List<DP_OtInfoVO> DP_OtList();
	
		//게시물 조회수
		public float DP_OtListCount();
	
		//게시물 리스트 상세보기
		public DP_OtInfoVO DP_OtListDetail(int c_id);
	
			//게시물 삭제(리스트 상세보기 에서)
			public void DP_OtDelete(int c_id);
	
			//게시물 수정(리스트 상세보기 에서)
			public void DP_OtUpdate(DP_OtInfoVO dpovo);
	
	
}
