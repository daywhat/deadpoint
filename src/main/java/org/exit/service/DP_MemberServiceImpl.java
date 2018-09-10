package org.exit.service;

import java.util.List;

import javax.inject.Inject;

import org.exit.domain.DP_CouponVO;
import org.exit.domain.DP_MemberVO;
import org.exit.persistence.DP_MemberDAOImpl;
import org.springframework.stereotype.Service;

@Service
public class DP_MemberServiceImpl implements DP_MemberService{

	@Inject
	public DP_MemberDAOImpl dpmdao;
	
	/*
	Join ��ư Ŭ���� �Էµ� ���� ������ DAOImpl �� ����
	 */
	@Override
	public void DP_MemberInsert(DP_MemberVO dpmvo) {
		// TODO Auto-generated method stub
		dpmdao.DP_MemberInsert(dpmvo);
	}
	
	
	
	/*
		�α��ν� ���̵� ��й�ȣ ������ DAOImpl�� ���� 
		DAOImpl���� 0, 1 �� �����־� ��й�ȣ Ȯ�ο� alert â ����
	 */
	@Override
	public DP_MemberVO DP_MemberLogin(DP_MemberVO dpmvo) {
		// TODO Auto-generated method stub
		return dpmdao.DP_MemberLogin(dpmvo);
	}
	
	/*
		MyPage��ư Ŭ���� Session�� ����� ���� id ��ȣ�� 
		�ҷ��� DAOImpl�� ����
	*/
	@Override
	public List<DP_MemberVO> DP_MemberDetail(int dp_id) {
		// TODO Auto-generated method stub
		return dpmdao.DP_MemberDetail(dp_id);
	}
	
	/*
		���� id ���� �̿��Ͽ� ������ ������ DAOImpl�� ����
	*/
	@Override
	public void DP_MemberUpdate(DP_MemberVO dpmvo) {
		// TODO Auto-generated method stub
		dpmdao.DP_MemberUpdate(dpmvo);
	}
	
	/*
		ȸ��Ż���ư Ŭ���� ���� ���̵� ���� DAOImpl�� ����
	*/
	@Override
	public void DP_MemberDropout(DP_MemberVO dpmvo) {
		// TODO Auto-generated method stub
		dpmdao.DP_MemberDropout(dpmvo);
	}

	/*
		����Ȯ�� ��ư Ŭ���� ���� id ���� DAOImpl�� ����
	*/
	@Override
	public List<DP_CouponVO> DP_MemberCoupon(DP_CouponVO dpcvo) {
		// TODO Auto-generated method stub
		return dpmdao.DP_MemberCoupon(dpcvo);
	}

	/*
	 *	�г��� �ߺ� üũ
	 */

	@Override
	public String DP_MemberNickCheck(String dp_nick) {
		
		return dpmdao.DP_MemberInsertNickCheck(dp_nick);
	}

	/*
	 *	���̵� �ߺ� üũ 
	 */

	@Override
	public String DP_MemberIDCheck(String dp_name) {
		// TODO Auto-generated method stub
		return dpmdao.DP_MemberInsertIDCheck(dp_name);
	}

}
