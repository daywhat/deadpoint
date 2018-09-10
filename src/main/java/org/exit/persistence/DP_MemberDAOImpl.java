package org.exit.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.exit.domain.DP_CouponVO;
import org.exit.domain.DP_MemberVO;
import org.springframework.stereotype.Repository;

@Repository
////////////////////////////////////////////////////////////////////
public class DP_MemberDAOImpl implements DP_MemberDAO{

	@Inject
	public SqlSession sqlSession;
	
	//회원가입
	@Override
	public void DP_MemberInsert(DP_MemberVO dpmvo) {
		/*INSERT INTO DP_Member (AI, dp_name, dp_findpwd_q, dp_findpwd_a
							, dp_nick, dp_tel1, dp_tel2, dp_tel3, dp_addr
							, dp_email, dp_point) 
						VALUES (dp_id, dp_name, dp_findpwd_q, dp_findpwd_a
								, dp_nick, dp_tel1, dp_tel2, dp_tel3, dp_addr
								, dp_email, 0) */		
		
		sqlSession.insert("memberInsert", dpmvo);
		
	}
	
		//아이디 중복확인
		@Override
		public String DP_MemberInsertIDCheck(String dp_name) {
			return sqlSession.selectOne("memberInsertIdCheck", dp_name);
			/*SELECT dp_name FROM DP_Member	 */
	}
	
	
	//로그인
	@Override
	public DP_MemberVO DP_MemberLogin(DP_MemberVO dpmvo) {
		return sqlSession.selectOne("memberLogin", dpmvo);
		/*SELECT dp_name, dp_pwd FROM DP_Member */
	}

		//회원정보 보기
		@Override
		public List<DP_MemberVO> DP_MemberDetail(int dp_id) {
			return null;
			/*SELECT * FROM DP_Member WHERE dp_id= dp_id */
		}
	
		//회원정보 수정
		@Override
		public void DP_MemberUpdate(DP_MemberVO dpmvo) {
			/*UPDATE DP_Member dp_findpwd_q= dp_findpwd_q
			 * 				, dp_findpwd_a= dp_findpwd_a, dp_nick= dp_nick
							, dp_tel1= dp_tel1, dp_tel2= dp_tel2, dp_tel3= dp_tel3
							, dp_addr= dp_addr, dp_email= dp_email  
					WHERE dp_id= dp_id */
		}
		
	
	//회원탈퇴
	@Override
	public void DP_MemberDropout(DP_MemberVO dpmvo) {
		/*DELETE dp_id FROM DP_Member WHERE dp_id= dp_id */
	}

	//쿠폰 리스트
	@Override
	public List<DP_CouponVO> DP_MemberCoupon(DP_CouponVO dpcvo) {
		return null;
		/*SELECT * FROM DP_Coupon WHERE dp_id= dp_id */
	}

	@Override
	public String DP_MemberInsertNickCheck(String dp_nick) {
		return sqlSession.selectOne("memberInsertNickCheck", dp_nick);
		// TODO Auto-generated method stub
		
	}

}
