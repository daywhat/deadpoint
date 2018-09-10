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
	Join 버튼 클릭시 입력된 값을 가지고 DAOImpl 로 전송
	 */
	@Override
	public void DP_MemberInsert(DP_MemberVO dpmvo) {
		// TODO Auto-generated method stub
		dpmdao.DP_MemberInsert(dpmvo);
	}
	
	
	
	/*
		로그인시 아이디 비밀번호 가지고 DAOImpl로 전송 
		DAOImpl에서 0, 1 값 돌려주어 비밀번호 확인용 alert 창 띄우기
	 */
	@Override
	public DP_MemberVO DP_MemberLogin(DP_MemberVO dpmvo) {
		// TODO Auto-generated method stub
		return dpmdao.DP_MemberLogin(dpmvo);
	}
	
	/*
		MyPage버튼 클릭시 Session에 저장된 고유 id 번호를 
		불러와 DAOImpl로 전송
	*/
	@Override
	public List<DP_MemberVO> DP_MemberDetail(int dp_id) {
		// TODO Auto-generated method stub
		return dpmdao.DP_MemberDetail(dp_id);
	}
	
	/*
		고유 id 값을 이용하여 수정된 정보를 DAOImpl로 전송
	*/
	@Override
	public void DP_MemberUpdate(DP_MemberVO dpmvo) {
		// TODO Auto-generated method stub
		dpmdao.DP_MemberUpdate(dpmvo);
	}
	
	/*
		회원탈퇴버튼 클릭시 고유 아이디 값을 DAOImpl로 전송
	*/
	@Override
	public void DP_MemberDropout(DP_MemberVO dpmvo) {
		// TODO Auto-generated method stub
		dpmdao.DP_MemberDropout(dpmvo);
	}

	/*
		쿠폰확인 버튼 클릭시 고유 id 값을 DAOImpl로 전송
	*/
	@Override
	public List<DP_CouponVO> DP_MemberCoupon(DP_CouponVO dpcvo) {
		// TODO Auto-generated method stub
		return dpmdao.DP_MemberCoupon(dpcvo);
	}

	/*
	 *	닉네임 중복 체크
	 */

	@Override
	public String DP_MemberNickCheck(String dp_nick) {
		
		return dpmdao.DP_MemberInsertNickCheck(dp_nick);
	}

	/*
	 *	아이디 중복 체크 
	 */

	@Override
	public String DP_MemberIDCheck(String dp_name) {
		// TODO Auto-generated method stub
		return dpmdao.DP_MemberInsertIDCheck(dp_name);
	}

}
