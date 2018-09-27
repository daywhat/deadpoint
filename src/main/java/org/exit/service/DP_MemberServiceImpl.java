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
	
	@Override
	/* 
	 * Join ��ư Ŭ���� �Էµ� ���� ������ DAOImpl �� ���� 
	 */
	public void DP_MemberInsert(DP_MemberVO dpmvo) {	
		dpmdao.DP_MemberInsert(dpmvo);
	}

	@Override
	/*
	 * �Էµ� dp_id, dp_pwd ���� ����
	 */
	public DP_MemberVO DP_MemberLogin(DP_MemberVO dpmvo) {
		return dpmdao.DP_MemberLogin(dpmvo);
	}
	
	@Override
	/*
	 * Session�� ����� dp_id ���� ����
	 */
	public List<DP_MemberVO> DP_MemberDetail(int dp_id) {
		return dpmdao.DP_MemberDetail(dp_id);
	}
	
	@Override
	/*
	 * Session�� ����� dp_id ���� ����
	 */
	public void DP_MemberUpdate(DP_MemberVO dpmvo) {
		dpmdao.DP_MemberUpdate(dpmvo);
	}
	
	@Override
	/* 
	 * Session�� ����� dp_id ���� ����
	 */
	public void DP_MemberDropout(DP_MemberVO dpmvo) {
		dpmdao.DP_MemberDropout(dpmvo);
	}

	@Override
	/* 
	 * Session�� ����� dp_id ���� ����
	 */
	public List<DP_CouponVO> DP_MemberCoupon(DP_CouponVO dpcvo) {
		return dpmdao.DP_MemberCoupon(dpcvo);
	}

	@Override
	/* 
	 * �Էµ� dp_nick �� ����
	 */
	public String DP_MemberNickCheck(String dp_nick) {
		return dpmdao.DP_MemberInsertNickCheck(dp_nick);
	}

	@Override
	/* 
	 * �Էµ� dp_name �� ����
	 */
	public String DP_MemberIDCheck(String dp_name) {
		return dpmdao.DP_MemberInsertIDCheck(dp_name);
	}

}
