package com.bno.service;

import java.util.HashMap;
import java.util.List;

import com.bno.dto.BoardPager;
import com.bno.dto.JoinDto;
import com.bno.dto.SearchDto;
import com.bno.dto.TAManagement;
import com.bno.dto.UserInfo;

public interface TAManagementService {
	
	//출근시간 입력
	public void insertGto(TAManagement dto);

	//출근 전체 조회 출력
	public List<JoinDto>  selectGtoAllList(BoardPager boardPager);
	
	//출근 레코드 전체 갯수 가져오기
	public int selectuserGtoCount(SearchDto searchDto);

	//퇴근시간 (update)
	public void owUpdate(int ta_id);
	
	//퇴근 전체 조회 출력
	public List<JoinDto>  selectOwAllList(BoardPager boardPager);
	
	//퇴근 레코드 전체 갯수 가져오기
	public int selectuserOwCount(SearchDto searchDto);
	
	//상세보기
	public TAManagement userGtoOwSelectOne(int ta_id);
	
	//근무시간
	public TAManagement updateWorkingHour(int ta_id);
	
	//상태 수정
	public void userStatusUpdate(TAManagement dto);
	
	//관리자권한, 직원출근관리 삭제
	public void userGtoOwDelete(int ta_id);
	
	//부서원 휴가 등록
	public void insertUserVacation(TAManagement  dto);
}//inter end
