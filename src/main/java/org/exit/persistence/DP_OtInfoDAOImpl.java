package org.exit.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.exit.domain.DP_OtInfoVO;
import org.springframework.stereotype.Repository;

@Repository
////////////////////////////////////////////////////////////////////
public class DP_OtInfoDAOImpl implements DP_OtInfoDAO{
	
	@Inject
	public SqlSession sqlSession;

	//�Խù� �ۼ�
	@Override
	public void DP_OtWrite(DP_OtInfoVO dpovo) {
		
	}

	//�Խù� ����Ʈ ����
	@Override
	public List<DP_OtInfoVO> DP_OtList() {
		return null;
	}
	
		//�Խù� ����Ʈ �󼼺���
		@Override
		public DP_OtInfoVO DP_OtListDetail(int c_id) {
			return null;
		}

			//�Խù� ����(����Ʈ �󼼺��� ����)
			@Override
			public void DP_OtDelete(int c_id) {
				
			}
		
			//�Խù� ����(����Ʈ �󼼺��� ����)
			@Override
			public void DP_OtUpdate(DP_OtInfoVO dpovo) {
				
			}

}