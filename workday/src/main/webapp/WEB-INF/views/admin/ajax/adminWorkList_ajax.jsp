<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%String contextPath = request.getContextPath(); %>


<div class="row">
	<div class="col-sm-12">
		<table id="gpxBoard" class="table table-bordered table-hover dataTable" role="grid">
								<thead>※출퇴근 시간을 지킵시다※<br>
							                         ※퇴근 하려면 이름을 클릭하세요※
													<tr role="row">
														<th class="sorting_asc" tabindex="0" aria-controls="example1"
															rowspan="1" colspan="1" aria-sort="ascending"
															aria-label="Rendering engine: activate to sort column descending"
															style="width: 185px;">사번</th>
														<th class="sorting" tabindex="0" aria-controls="example1"
															rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 228px;">이름</th>
														<th class="sorting" tabindex="0" aria-controls="example1"
															rowspan="1" colspan="1"
															aria-label="Platform(s): activate to sort column ascending"
															style="width: 202px;">부서</th>
														<th class="sorting" tabindex="0" aria-controls="example1"
															rowspan="1" colspan="1"
															aria-label="Engine version: activate to sort column ascending"
															style="width: 158px;">출근시간</th>
														<th class="sorting" tabindex="0" aria-controls="example1"
															rowspan="1" colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 115px;">퇴근시간</th>
															<th class="sorting" tabindex="0" aria-controls="example1"
															rowspan="1" colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 115px;">근무시간</th>
															<th class="sorting" tabindex="0" aria-controls="example1"
															rowspan="1" colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 115px;">근무상태</th>
													</tr>
												</thead>
			<tbody>
				<c:forEach var="workAllList" items="${workAllList }">

					<tr role="row">
						<td class="">${workAllList.u_id }</td>
						<td onclick="javascript:location.href='<c:url value="/"/>user/WorkRecordSelectOne?w_id=${workAllList.w_id }'">
						${workAllList.u_name }</td>
						<c:if test="${workAllList.d_id eq 1 }">
						<td>경영지원</td>
						</c:if>
						<c:if test="${workAllList.d_id eq 2 }">
						<td>연구소</td>
						</c:if>
						<td>${workAllList.w_in }</td>
						<td>${workAllList.w_out }</td>
						<td>${workAllList.w_time /60}시간</td>
						<c:if test="${workAllList.w_status eq 'Y' }">
						<td>정상출근</td>
						</c:if>
						<c:if test="${workAllList.w_status eq 'E' }">
						<td>조퇴</td>
						</c:if>
						<c:if test="${workAllList.w_status eq 'L' }">
						<td>지각</td>
						</c:if>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</div>
<div class="row">
	<div class="col-sm-5">
		<div class="dataTables_info" id="example1_info" role="status" aria-live="polite"></div>
	</div>
	<div class="col-sm-7">
		<div class="dataTables_paginate paging_simple_numbers">
			<ul class="pagination">
				<c:if test="${boardPager.curBlock > 1 }">
					<li class="paginate_button previous disabled"><a
							href="javascript:adminWorkListAjaxfn(${boardPager.prevPage})">Previous</a>
					</li>
				</c:if>
				<c:forEach var="num" begin="${boardPager.blockBegin }" end="${boardPager.blockEnd }">
					<c:choose>
						<c:when test="${num == boardPager.curPage }">
							<li class="paginate_button active"><a href="#">${num }</a>
							</li>
						</c:when>
						<c:otherwise>
							<li class="paginate_button"><a href="javascript:adminWorkListAjaxfn(${num})">${num}</a></li>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				<c:if test="${boardPager.curBlock <= boardPager.totBlock }">
					<li class="paginate_button next" id="example1_next">
						<a href="javascript:adminWorkListAjaxfn(${boardPager.nextPage})">Next</a>
					</li>
				</c:if>
			</ul>
		</div>
	</div>
</div> 