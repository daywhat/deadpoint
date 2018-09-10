package org.exit.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.exit.domain.DP_OtInfoVO;
import org.springframework.stereotype.Repository;

@Repository
////////////////////////////////////////////////////////////////////
public class DP_OtInfoDAOImpl implements DP_OtInfoDAO{
	
	@Inject
	public SqlSession sqlSession;

	//게시물 작성
	@Override
	public void DP_OtWrite(DP_OtInfoVO dpovo) {
		
	}

	//게시물 리스트 보기
	@Override
	public List<DP_OtInfoVO> DP_OtList() {
		return null;
	}
	
		//게시물 리스트 상세보기
		@Override
		public DP_OtInfoVO DP_OtListDetail(int c_id) {
			return null;
		}

			//게시물 삭제(리스트 상세보기 에서)
			@Override
			public void DP_OtDelete(int c_id) {
				
			}
		
			//게시물 수정(리스트 상세보기 에서)
			@Override
			public void DP_OtUpdate(DP_OtInfoVO dpovo) {
				
			}

}
