package org.exit.service;

import java.util.List;

import org.exit.domain.DP_ProductVO;

//�Ѥ�(��, ������)�Ѥ�///////////////////////////////////////////////////////
public interface DP_ProductService {
		
	//���������� ��ǰ ����Ʈ ����(���� �ö���� ��ǰ = DB�� �ִ� ��ǰ = ���������� ���/����/�����ϴ� ��ǰ)
	public DP_ProductVO DP_ProductList(DP_ProductVO dppvo);
	
		//��ǰ ���
		public void DP_ProductInsert(DP_ProductVO dppvo);
	
		//��ǰ ����
		public void DP_ProductUpdate(DP_ProductVO dppvo);
	
		//��ǰ ����
		public void DP_ProductDelete(DP_ProductVO dppvo);
	
	//���� ��ǰ ����Ʈ �Ѹ���
	public List<DP_ProductVO> DP_ProductList();

}
