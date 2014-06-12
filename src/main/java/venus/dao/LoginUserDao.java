package venus.dao;

import java.util.List;

import venus.domain.User;

public interface LoginUserDao {
	/*
	 *查詢全部loginUser 
	 */
	public List<User> selectLoginUser() throws Exception;
 }
