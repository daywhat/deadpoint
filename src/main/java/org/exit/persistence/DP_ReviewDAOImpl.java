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
	
	//��ǰ�� �ۼ�
	@Override
	/* 
	 *  
	 */
	public void DP_ReviewInsert(DP_ReviewVO dprvo) {
		
	}

	//��ǰ�� ����Ʈ ����
	@Override
	/* 
	 *  
	 */
	public List<DP_ReviewVO> DP_ReviewList() {
		return null;
	}
	
	//��ǰ�� ����Ʈ �󼼺���
	@Override
	/* 
	 *  
	 */
	public List<DP_ReviewVO> DP_ReviewListDetail() {
		return null;
	}

	//��ǰ�� ����(����Ʈ �󼼺��� ����)
	@Override
	/* 
	 *  
	 */
	public void DP_ReviewDelete(int b_id) {
		
	}

	//��ǰ�� ����(����Ʈ �󼼺��� ����)
	@Override
	/* 
	 *  
	 */
	public void DP_ReviewUpdate(DP_ReviewVO dprvo) {		
		
	}

	//��ǰ�� ��� �ޱ�
	@Override
	/* 
	 *  
	 */
	public void DP_ReviewInsertRep() {
		
	}

	//��ǰ�� ��� �����
	@Override
	/* 
	 *  
	 */
	public void DP_ReviewDeleteRep(int bplust_id) {
		
	}

}
