package com.bno.dto;

public class JoinDto {
	
	private int ta_id;							//일련번호 기본키
	private int u_id;							//사원번호
	private String dp_name;				//부서명
	private String u_name;					//사원 이름
	private String u_position;				//직급
	private String gto;						//출근 시간
	private char status;						//상태
	
	public JoinDto() {
		super();
	}

	public JoinDto(int ta_id, int u_id, String dp_name, String u_name, String u_position, String gto, char status) {
		super();
		this.ta_id = ta_id;
		this.u_id = u_id;
		this.dp_name = dp_name;
		this.u_name = u_name;
		this.u_position = u_position;
		this.gto = gto;
		this.status = status;
	}

	public int getTa_id() {
		return ta_id;
	}

	public void setTa_id(int ta_id) {
		this.ta_id = ta_id;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getDp_name() {
		return dp_name;
	}

	public void setDp_name(String dp_name) {
		this.dp_name = dp_name;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_position() {
		return u_position;
	}

	public void setU_position(String u_position) {
		this.u_position = u_position;
	}

	public String getGto() {
		return gto;
	}

	public void setGto(String gto) {
		this.gto = gto;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "JoinDto [ta_id=" + ta_id + ", u_id=" + u_id + ", dp_name=" + dp_name + ", u_name=" + u_name
				+ ", u_position=" + u_position + ", gto=" + gto + ", status=" + status + "]";
	}
	
	
	
	
	
	
}//class end