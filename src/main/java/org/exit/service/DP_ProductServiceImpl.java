package org.exit.service;

import java.util.List;

import javax.inject.Inject;

import org.exit.domain.DP_ProductVO;
import org.exit.persistence.DP_ProductDAOImpl;
import org.springframework.stereotype.Service;


@Service
public class DP_ProductServiceImpl implements DP_ProductService{

	@Inject
	public DP_ProductDAOImpl dppdao;
	
	@Override
	/* 
	 *  
	 */
	public DP_ProductVO DP_ProductList(DP_ProductVO dppvo) {
		return null;
	}

	@Override
	/* 
	 *  
	 */
	public void DP_ProductInsert(DP_ProductVO dppvo) {
		
	}

	@Override
	/* 
	 *  
	 */
	public void DP_ProductUpdate(DP_ProductVO dppvo) {
		
	}

	@Override
	/* 
	 *  
	 */
	public void DP_ProductDelete(DP_ProductVO dppvo) {
		
	}

	@Override
	/* 
	 *  
	 */
	public List<DP_ProductVO> DP_ProductList() {
		return dppdao.DP_ProductList();
	}
	
	@Override
	/* 
	 *  
	 */
	public List<DP_ProductVO> DP_mProductList() {
		return dppdao.DP_mProductList();
	}

	
	@Override
	/* 
	 *  
	 */
	public List<DP_ProductVO> DP_fmProductList() {
		return dppdao.DP_fmProductList();
	}


}
