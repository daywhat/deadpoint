package org.exit.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.exit.domain.DP_CouponVO;
import org.exit.domain.DP_MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class DP_MemberDAOImpl implements DP_MemberDAO{

	@Inject
	public SqlSession sqlSession;
	
	@Override
	/* 
	 *  
	 */
	public void DP_MemberInsert(DP_MemberVO dpmvo) {
		sqlSession.insert("memberInsert", dpmvo);
	}
	
	@Override
	/* 
	 *  
	 */
	public String DP_MemberInsertNickCheck(String dp_nick) {
		return sqlSession.selectOne("memberInsertNickCheck", dp_nick);
		
	}
	
	@Override
	/* 
	 *  
	 */
	public String DP_MemberInsertIDCheck(String dp_name) {
		return sqlSession.selectOne("memberInsertIdCheck", dp_name);
	}
	
	@Override
	/* 
	 *  
	 */
	public DP_MemberVO DP_MemberLogin(DP_MemberVO dpmvo) {
		return sqlSession.selectOne("memberLogin", dpmvo);
	}

		//회원정보 보기
	@Override
	/* 
	 *  
	 */
	public List<DP_MemberVO> DP_MemberDetail(int dp_id) {
		return null;
	}
	
		//회원정보 수정
	@Override
	/* 
	 *  
	 */
	public void DP_MemberUpdate(DP_MemberVO dpmvo) {
		
	}
		
	
	//회원탈퇴
	@Override
	/* 
	 *  
	 */
	public void DP_MemberDropout(DP_MemberVO dpmvo) {

	}

	//쿠폰 리스트
	@Override
	/* 
	 *  
	 */
	public List<DP_CouponVO> DP_MemberCoupon(DP_CouponVO dpcvo) {
		return null;
	}

}
