package venus.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import venus.core.Action;
import venus.dao.LoginUserDao;
import venus.dao.impl.LoginUserDaoImpl;
import venus.dbc.DatabaseConnection;
import venus.domain.User;

public class ManageLoginUserAction implements Action{
	private DatabaseConnection dbc=null;
	private LoginUserDao dao=null;
	private static Logger log = Logger.getLogger(LoginAction.class);

		@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		log.debug("loginAction is invoked ...");
		try {
			List<User> userData = selectLoginUser();
			if(userData==null || userData.size()==0){
				req.getSession().setAttribute("message", "Data Empty");
			}else{
				req.getSession().setAttribute("userData",userData);
			}
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "select error";
		}

}

	
	
	
	public  List<User> selectLoginUser() throws Exception {
		// TODO Auto-generated method stub
		List<User> userData = null;
		try {
			this.dbc = new DatabaseConnection();
			this.dao = new LoginUserDaoImpl(dbc.getConnection());
			userData = dao.selectLoginUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 throw new Exception("database error"); 
		} finally {
			this.dbc.close();
		}
		return userData;
	}

}
