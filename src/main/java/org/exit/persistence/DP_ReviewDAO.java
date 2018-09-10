package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_ReviewVO;

//�Ѥ�(��ǰ�� �Խ���)�Ѥ�//////////////////////////////////////////////////////
public interface DP_ReviewDAO {
	
	//��ǰ�� �ۼ�
	public void DP_ReviewInsert(DP_ReviewVO dprvo);
	
	//��ǰ�� ����Ʈ ����
	public List<DP_ReviewVO> DP_ReviewList();
	
		//��ǰ�� ����Ʈ �󼼺���
		public List<DP_ReviewVO> DP_ReviewListDetail();
	
			//��ǰ�� ����(����Ʈ �󼼺��� ����)
			public void DP_ReviewDelete(int b_id);
	
			//��ǰ�� ����(����Ʈ �󼼺��� ����)
			public void DP_ReviewUpdate(DP_ReviewVO dprvo);
			
	//��ǰ�� ��� �ޱ�
	public void DP_ReviewInsertPlus();

	//��ǰ�� ��� �����
	public void DP_ReviewDeletePlus(int bplust_id);
		
		
}
