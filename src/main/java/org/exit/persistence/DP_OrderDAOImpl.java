package org.exit.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.exit.domain.DP_ProductVO;
import org.exit.domain.DP_ReviewVO;
import org.springframework.stereotype.Repository;

@Repository
public class DP_OrderDAOImpl implements DP_OrderDAO{

	@Inject
	public SqlSession sqlSession;
	
	//주문 내역 보기(마이 페이지)
	@Override
	/* 
	 *  
	 */
	public List<DP_ProductVO> DP_OrderList(int order_id) {
		return null;
	}
	
	//주문 취소
	@Override
	/* 
	 *  
	 */
	public void DP_OderCancle(int order_id) {
			
	}

	//장바구니 리스트 보기
	@Override
	/* 
	 *  
	 */
	public List<DP_ProductVO> DP_BaguniList() {
		return null;
	}
	
	//주문 합계 금액(장바구니)
	@Override
	/* 
	 *  
	 */
	public int DP_BaguniSumPrice(int ba_id) {
		return 0;
	}
	
	//물품 삭제(장바구니)
	@Override
	/* 
	 *  
	 */
	public void DP_BaguniCancle(int ba_id) {
			
	}

}
