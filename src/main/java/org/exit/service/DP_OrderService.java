

package org.exit.service;

import java.util.List;

import org.exit.domain.DP_ProductVO;
import org.exit.domain.DP_ReviewVO;

//�Ѥ�(��ٱ���, ����������(���ų���Ȯ��))�Ѥ�/////////////////////////////////////
public interface DP_OrderService {

	//�ֹ� ���� ����(���� ������)
	public List<DP_ProductVO> DP_OrderList(int dp_id);
	
		//�ֹ� �հ� �޾�
		public int DP_OderTPrice();
	
		//�ֹ� ���
		public void DP_OderCancle(int order_id);
	
		//���� ��ǰ ���� �ۼ�
		public void DP_WriteReview(DP_ReviewVO dprvo);
	
	//��ٱ��� ����Ʈ ����
	public List<DP_ProductVO> DP_BaguniList();
	
		//�ֹ� �հ� �ݾ�
		public int DP_BaguniTPrice(int dp_id);
	
		//��ǰ ����(��ٱ���)
		public void DP_BaguniCancle();
		
	
}
