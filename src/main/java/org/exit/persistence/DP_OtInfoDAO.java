package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_OtInfoVO;

//�Ѥ�(������ Ŀ�´�Ƽ)�Ѥ�///////////////////////////////////////////////////
public interface DP_OtInfoDAO {
	
	//�Խù� �ۼ�
	public void DP_OtWrite(DP_OtInfoVO dpovo);
	
	//�Խù� ����Ʈ ����
	public List<DP_OtInfoVO> DP_OtList();

		//�Խù� ����Ʈ �󼼺���
		public DP_OtInfoVO DP_OtListDetail(int c_id);
	
			//�Խù� ����(����Ʈ �󼼺��� ����)
			public void DP_OtDelete(int c_id);
	
			//�Խù� ����(����Ʈ �󼼺��� ����)
			public void DP_OtUpdate(DP_OtInfoVO dpovo);
	
	
}
