

package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_ProductVO;

//�Ѥ�(��ٱ���, ����������(���ų���Ȯ��))�Ѥ�/////////////////////////////////////
public interface DP_OrderDAO {

	//�ֹ� ���� ����(���� ������)
	public List<DP_ProductVO> DP_OrderList(int order_id);
	
		//�ֹ� ���
		public void DP_OderCancle(int order_id);
	
	//��ٱ��� ����Ʈ ����
	public List<DP_ProductVO> DP_BaguniList();
	
		//�ֹ� �հ� �ݾ�
		public int DP_BaguniTPrice(int ba_id);
	
		//��ǰ ����(��ٱ���)
		public void DP_BaguniCancle(int ba_id);
		
	
}
