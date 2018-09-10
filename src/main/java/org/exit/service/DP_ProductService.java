package org.exit.service;

import java.util.List;

import org.exit.domain.DP_ProductVO;

//ㅡㅡ(샵, 재고관리)ㅡㅡ///////////////////////////////////////////////////////
public interface DP_ProductService {
		
	//재고관리에서 상품 리스트 보기(샵에 올라오는 상품 = DB에 있는 상품 = 재고관리에서 등록/수정/삭제하는 상품)
	public DP_ProductVO DP_ProductList(DP_ProductVO dppvo);
	
		//상품 등록
		public void DP_ProductInsert(DP_ProductVO dppvo);
	
		//상품 수정
		public void DP_ProductUpdate(DP_ProductVO dppvo);
	
		//상품 삭제
		public void DP_ProductDelete(DP_ProductVO dppvo);
	
	//샵에 상품 리스트 뿌리기
	public List<DP_ProductVO> DP_ProductList();

}
