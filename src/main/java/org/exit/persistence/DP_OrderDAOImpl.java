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
	
	//�ֹ� ���� ����(���� ������)
	@Override
	/* 
	 *  
	 */
	public List<DP_ProductVO> DP_OrderList(int order_id) {
		return null;
	}
	
	//�ֹ� ���
	@Override
	/* 
	 *  
	 */
	public void DP_OderCancle(int order_id) {
			
	}

	//��ٱ��� ����Ʈ ����
	@Override
	/* 
	 *  
	 */
	public List<DP_ProductVO> DP_BaguniList() {
		return null;
	}
	
	//�ֹ� �հ� �ݾ�(��ٱ���)
	@Override
	/* 
	 *  
	 */
	public int DP_BaguniSumPrice(int ba_id) {
		return 0;
	}
	
	//��ǰ ����(��ٱ���)
	@Override
	/* 
	 *  
	 */
	public void DP_BaguniCancle(int ba_id) {
			
	}

}
