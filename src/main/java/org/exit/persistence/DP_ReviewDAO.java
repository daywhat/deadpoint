package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_ReviewVO;

//ㅡㅡ(상품평 게시판)ㅡㅡ//////////////////////////////////////////////////////
public interface DP_ReviewDAO {
	
	//상품평 작성
	public void DP_ReviewInsert(DP_ReviewVO dprvo);
	
	//상품평 리스트 보기
	public List<DP_ReviewVO> DP_ReviewList();
	
		//상품평 리스트 상세보기
		public List<DP_ReviewVO> DP_ReviewListDetail();
	
			//상품평 삭제(리스트 상세보기 에서)
			public void DP_ReviewDelete(int b_id);
	
			//상품평 수정(리스트 상세보기 에서)
			public void DP_ReviewUpdate(DP_ReviewVO dprvo);
			
	//상품평에 댓글 달기
	public void DP_ReviewInsertPlus();

	//상품평 댓글 지우기
	public void DP_ReviewDeletePlus(int bplust_id);
		
		
}
