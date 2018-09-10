package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_CouponVO;
import org.exit.domain.DP_MemberVO;

//ㅡㅡ(로그인, 회원가입, 마이페이지)ㅡㅡ////////////////////////////////////////////
public interface DP_MemberDAO {
   
   //회원가입   
   public void DP_MemberInsert(DP_MemberVO dpmvo);   
      
      //아이디 중복확인
      public String DP_MemberInsertIDCheck(String dp_name);
      
      //닉네임 중복확인
      public String DP_MemberInsertNickCheck(String dp_nick);      
   
   //로그인
   public DP_MemberVO DP_MemberLogin(DP_MemberVO dpmvo);
   
      //회원정보 보기
      public List<DP_MemberVO> DP_MemberDetail(int dp_id);
   
      //회원정보 수정
      public void DP_MemberUpdate(DP_MemberVO dpmvo);
   
   //회원탈퇴
   public void DP_MemberDropout(DP_MemberVO dpmvo);
   
   //쿠폰 리스트
   public List<DP_CouponVO> DP_MemberCoupon(DP_CouponVO dpcvo);
   
}