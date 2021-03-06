package com.bno.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bno.dto.Approval;
import com.bno.dto.BoardPager;
import com.bno.dto.JoinDto;
import com.bno.dto.SearchDto;

@Repository
public class ApprovalDaoImpl implements ApprovalDao {
	
	
	@Autowired
	private SqlSessionTemplate session;
	
	private String queryprefix = "Approval.";

	// 결재정보 접수
	@Override
	public void approvalIn(Approval dto) {
		System.out.println("dto = "+dto);
		session.insert(queryprefix+"approvalIn", dto);
	}

	// 결재정보 전체 레코드 갯수
	@Override
	public int selectStatusCount(SearchDto searchDto) {
		// TODO Auto-generated method stub
		return session.selectOne(queryprefix+"selectStatusCount", searchDto);
	}

	// 결재정보 전체 조회
	@Override
	public List<JoinDto> selectAllApprovalList(BoardPager boardPager) {
		List<JoinDto> AllApprovalList = new ArrayList<JoinDto>();
		AllApprovalList = session.selectList(queryprefix+"selectAllApprovalList", boardPager);
//		System.out.println("전체 리스트 = "+AllUserList);
		return AllApprovalList;
	}
	
	// 결재정보 상세보기
	@Override
	public Approval approvalSelectOne(int apv_id) {
		// TODO Auto-generated method stub
		return session.selectOne(queryprefix+"approvalSelectOne", apv_id);
	}

	// 결재승인
	@Override
	public Approval updateStatus(Approval aDto) {
		System.out.println("apv_id = "+aDto);
		return session.selectOne(queryprefix+"updateStatus", aDto);
	}


	
	
	
	

}//class end
