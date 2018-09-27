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
	 * Join 버튼 클릭시 입력된 값을 가지고 DAOImpl 로 전송 
	 */
	public void DP_MemberInsert(DP_MemberVO dpmvo) {	
		dpmdao.DP_MemberInsert(dpmvo);
	}

	@Override
	/*
	 * 입력된 dp_id, dp_pwd 값을 전송
	 */
	public DP_MemberVO DP_MemberLogin(DP_MemberVO dpmvo) {
		return dpmdao.DP_MemberLogin(dpmvo);
	}
	
	@Override
	/*
	 * Session에 저장된 dp_id 값을 전송
	 */
	public List<DP_MemberVO> DP_MemberDetail(int dp_id) {
		return dpmdao.DP_MemberDetail(dp_id);
	}
	
	@Override
	/*
	 * Session에 저장된 dp_id 값을 전송
	 */
	public void DP_MemberUpdate(DP_MemberVO dpmvo) {
		dpmdao.DP_MemberUpdate(dpmvo);
	}
	
	@Override
	/* 
	 * Session에 저장된 dp_id 값을 전송
	 */
	public void DP_MemberDropout(DP_MemberVO dpmvo) {
		dpmdao.DP_MemberDropout(dpmvo);
	}

	@Override
	/* 
	 * Session에 저장된 dp_id 값을 전송
	 */
	public List<DP_CouponVO> DP_MemberCoupon(DP_CouponVO dpcvo) {
		return dpmdao.DP_MemberCoupon(dpcvo);
	}

	@Override
	/* 
	 * 입력된 dp_nick 값 전송
	 */
	public String DP_MemberNickCheck(String dp_nick) {
		return dpmdao.DP_MemberInsertNickCheck(dp_nick);
	}

	@Override
	/* 
	 * 입력된 dp_name 값 전송
	 */
	public String DP_MemberIDCheck(String dp_name) {
		return dpmdao.DP_MemberInsertIDCheck(dp_name);
	}

}
