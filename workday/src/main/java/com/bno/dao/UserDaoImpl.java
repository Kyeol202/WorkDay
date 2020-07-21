package com.bno.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bno.dto.UserInfo;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SqlSessionTemplate session;
	
	private String queryprefix = "user.";
	

	//회원가입
	@Override
	public void insertUser(UserInfo user) throws Exception {
		System.out.println("회원가입"+user.toString());
		session.insert(queryprefix+"insertUser", user);
	}


	@Override
	public int idcheck(String u_email) throws Exception {
	
		System.out.println("이메일 중복체크"+u_email.toString());
			
		return session.selectOne(queryprefix+"idcheck", u_email);
	}

	//유저 상세조회
	@Override
	public UserInfo userSelectOne(UserInfo user) {
	
		return session.selectOne(queryprefix+"userSelectOne", user);
	}
	
	
	
	
	
	
	
}//class end