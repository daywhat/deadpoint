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
	
	//���������� ��ǰ ����Ʈ ����(���� �ö���� ��ǰ = DB�� �ִ� ��ǰ = ���������� ���/����/�����ϴ� ��ǰ)
	@Override
	/* 
	 *  
	 */
	public DP_ProductVO DP_ProductList(DP_ProductVO dppvo) {
		return null;
	}

	//��ǰ ���
	@Override
	/* 
	 *  
	 */
	public void DP_ProductInsert(DP_ProductVO dppvo) {
		
	}
	
	//��ǰ ����
	@Override
	/* 
	 *  
	 */
	public void DP_ProductUpdate(DP_ProductVO dppvo) {
		
	}
	
	//��ǰ ����
	@Override
	/* 
	 *  
	 */
	public void DP_ProductDelete(int dppro_id) {
		
	}
	
	//���� ��ǰ ����Ʈ �Ѹ���
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
