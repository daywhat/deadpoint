

package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_ProductVO;

//ㅡㅡ(장바구니, 마이페이지(구매내역확인))ㅡㅡ/////////////////////////////////////
public interface DP_OrderDAO {

	//주문 내역 보기(마이 페이지)
	public List<DP_ProductVO> DP_OrderList(int order_id);
	
		//주문 취소
		public void DP_OderCancle(int order_id);
	
	//장바구니 리스트 보기
	public List<DP_ProductVO> DP_BaguniList();
	
		//주문 합계 금액
		public int DP_BaguniTPrice(int ba_id);
	
		//물품 삭제(장바구니)
		public void DP_BaguniCancle(int ba_id);
		
	
}
