package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_ProductVO;

/**
 * 상품에 관한 DAO
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		이정빈, 정빈
 * 
 */


public interface DP_ProductDAO {
		
	//재고관리에서 상품 리스트 보기(샵에 올라오는 상품 = DB에 있는 상품 = 재고관리에서 등록/수정/삭제하는 상품)
	public DP_ProductVO DP_ProductList(DP_ProductVO dppvo);

	public void DP_ProductInsert(DP_ProductVO dppvo);

	public void DP_ProductUpdate(DP_ProductVO dppvo);

	public void DP_ProductDelete(int dppro_id);
	
	//샵에 상품 리스트 뿌리기
	public List<DP_ProductVO> DP_ProductList();
	//male
	public List<DP_ProductVO> DP_mProductList();
	//female
	public List<DP_ProductVO> DP_fmProductList();

}
