package org.exit.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.exit.domain.DP_ProductVO;
import org.springframework.stereotype.Repository;

@Repository
public class DP_ProductDAOImpl implements DP_ProductDAO{

	@Inject
	public SqlSession sqlSession;
	
	//재고관리에서 상품 리스트 보기(샵에 올라오는 상품 = DB에 있는 상품 = 재고관리에서 등록/수정/삭제하는 상품)
	@Override
	/* 
	 *  
	 */
	public DP_ProductVO DP_ProductList(DP_ProductVO dppvo) {
		return null;
	}

	//상품 등록
	@Override
	/* 
	 *  
	 */
	public void DP_ProductInsert(DP_ProductVO dppvo) {
		
	}
	
	//상품 수정
	@Override
	/* 
	 *  
	 */
	public void DP_ProductUpdate(DP_ProductVO dppvo) {
		
	}
	
	//상품 삭제
	@Override
	/* 
	 *  
	 */
	public void DP_ProductDelete(int dppro_id) {
		
	}
	
	//샵에 상품 리스트 뿌리기
	@Override
	/* 
	 *  
	 */
	public List<DP_ProductVO> DP_ProductList() {
		return sqlSession.selectList("totproductList");
	}
	
	@Override
	/* 
	 *  
	 */
	public List<DP_ProductVO> DP_mProductList() {
		return sqlSession.selectList("mproductList");
	}
	
	@Override
	/* 
	 *  
	 */
	public List<DP_ProductVO> DP_fmProductList() {
		return sqlSession.selectList("fmproductList");
	}

}
