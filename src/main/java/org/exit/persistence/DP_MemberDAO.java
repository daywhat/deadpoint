package org.exit.persistence;

import java.util.List;

import org.exit.domain.DP_CouponVO;
import org.exit.domain.DP_MemberVO;

//�Ѥ�(�α���, ȸ������, ����������)�Ѥ�////////////////////////////////////////////
public interface DP_MemberDAO {
   
   //ȸ������   
   public void DP_MemberInsert(DP_MemberVO dpmvo);   
      
      //���̵� �ߺ�Ȯ��
      public String DP_MemberInsertIDCheck(String dp_name);
      
      //�г��� �ߺ�Ȯ��
      public String DP_MemberInsertNickCheck(String dp_nick);      
   
   //�α���
   public DP_MemberVO DP_MemberLogin(DP_MemberVO dpmvo);
   
      //ȸ������ ����
      public List<DP_MemberVO> DP_MemberDetail(int dp_id);
   
      //ȸ������ ����
      public void DP_MemberUpdate(DP_MemberVO dpmvo);
   
   //ȸ��Ż��
   public void DP_MemberDropout(DP_MemberVO dpmvo);
   
   //���� ����Ʈ
   public List<DP_CouponVO> DP_MemberCoupon(DP_CouponVO dpcvo);
   
}