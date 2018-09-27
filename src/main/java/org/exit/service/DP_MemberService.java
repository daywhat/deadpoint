package org.exit.service;

import java.util.List;

import org.exit.domain.DP_CouponVO;
import org.exit.domain.DP_MemberVO;

/**
 * ȸ���� ���� ����
 * 
 * @version 	1.0.1c 09/14/18
 * @author 		������, ����
 * 
 */


public interface DP_MemberService {
	
	public void DP_MemberInsert(DP_MemberVO dpmvo);	
	
	public String DP_MemberNickCheck(String dp_nick);
		
	public String DP_MemberIDCheck(String dp_name);
	
	public DP_MemberVO DP_MemberLogin(DP_MemberVO dpmvo);
	
	public List<DP_MemberVO> DP_MemberDetail(int dp_id);
	
	public void DP_MemberUpdate(DP_MemberVO dpmvo);
	
	public void DP_MemberDropout(DP_MemberVO dpmvo);
	
	public List<DP_CouponVO> DP_MemberCoupon(DP_CouponVO dpcvo);
	
}
