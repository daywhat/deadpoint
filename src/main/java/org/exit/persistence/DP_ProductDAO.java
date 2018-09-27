package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_ProductVO;

/**
 * ��ǰ�� ���� DAO
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������, ����
 * 
 */


public interface DP_ProductDAO {
		
	//���������� ��ǰ ����Ʈ ����(���� �ö���� ��ǰ = DB�� �ִ� ��ǰ = ���������� ���/����/�����ϴ� ��ǰ)
	public DP_ProductVO DP_ProductList(DP_ProductVO dppvo);

	public void DP_ProductInsert(DP_ProductVO dppvo);

	public void DP_ProductUpdate(DP_ProductVO dppvo);

	public void DP_ProductDelete(int dppro_id);
	
	//���� ��ǰ ����Ʈ �Ѹ���
	public List<DP_ProductVO> DP_ProductList();
	//male
	public List<DP_ProductVO> DP_mProductList();
	//female
	public List<DP_ProductVO> DP_fmProductList();

}
