package org.exit.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.exit.domain.DP_ReviewVO;
import org.springframework.stereotype.Repository;

@Repository
////////////////////////////////////////////////////////////////////
public class DP_ReviewDAOImpl implements DP_ReviewDAO{

	@Inject
	public SqlSession sqlSession;
	
	//상품평 작성
	@Override
	/* 
	 *  
	 */
	public void DP_ReviewInsert(DP_ReviewVO dprvo) {
		
	}

	//상품평 리스트 보기
	@Override
	/* 
	 *  
	 */
	public List<DP_ReviewVO> DP_ReviewList() {
		return null;
	}
	
	//상품평 리스트 상세보기
	@Override
	/* 
	 *  
	 */
	public List<DP_ReviewVO> DP_ReviewListDetail() {
		return null;
	}

	//상품평 삭제(리스트 상세보기 에서)
	@Override
	/* 
	 *  
	 */
	public void DP_ReviewDelete(int b_id) {
		
	}

	//상품평 수정(리스트 상세보기 에서)
	@Override
	/* 
	 *  
	 */
	public void DP_ReviewUpdate(DP_ReviewVO dprvo) {		
		
	}

	//상품평에 댓글 달기
	@Override
	/* 
	 *  
	 */
	public void DP_ReviewInsertRep() {
		
	}

	//상품평 댓글 지우기
	@Override
	/* 
	 *  
	 */
	public void DP_ReviewDeleteRep(int bplust_id) {
		
	}

}
