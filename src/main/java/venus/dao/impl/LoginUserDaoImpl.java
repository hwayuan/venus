package venus.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import venus.dao.LoginUserDao;
import venus.domain.User;

public class LoginUserDaoImpl implements LoginUserDao {

	private Connection conn=null;
	private PreparedStatement pstmt=null;
	public LoginUserDaoImpl(Connection conn){
		this.conn=conn;
	}
	
	@Override
	public List<User> selectLoginUser() throws Exception {
		// TODO Auto-generated method stub
		List<User> resultData=new ArrayList<User>();
		try{
		String sql="select accountId,password,nickName,sex,age from loginuser";
		this.pstmt=this.conn.prepareStatement(sql);
		ResultSet rs=this.pstmt.executeQuery();
		
		while(rs.next()){
			User user=new User();
			user.setUserId(rs.getString("accountId"));
			user.setPassword(rs.getString("password"));
			user.setNickName(rs.getString("nickName"));
			user.setSex(rs.getString("sex"));
			user.setAge(rs.getInt("age"));
			resultData.add(user);
		}
		}catch(Exception e){
			throw e;
		}finally{
			if(this.pstmt != null){
				try{
					this.pstmt.close();
				}catch(Exception e){
					throw e;
				}
			}
		}
		return resultData;
	}

}
