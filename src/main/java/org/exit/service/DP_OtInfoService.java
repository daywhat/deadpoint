package org.exit.service;

import java.util.List;

import org.exit.domain.DP_OtInfoVO;

//�Ѥ�(������ Ŀ�´�Ƽ)�Ѥ�///////////////////////////////////////////////////
public interface DP_OtInfoService {
	
	//�Խù� �ۼ�
	public void DP_OtWrite(DP_OtInfoVO dpovo);
	
	//�Խù� ����Ʈ ����
	public List<DP_OtInfoVO> DP_OtList();
	
		//�Խù� ��ȸ��
		public float DP_OtListCount();
	
		//�Խù� ����Ʈ �󼼺���
		public DP_OtInfoVO DP_OtListDetail(int c_id);
	
			//�Խù� ����(����Ʈ �󼼺��� ����)
			public void DP_OtDelete(int c_id);
	
			//�Խù� ����(����Ʈ �󼼺��� ����)
			public void DP_OtUpdate(DP_OtInfoVO dpovo);
	
	
}
