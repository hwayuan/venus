package venus.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import venus.core.Action;

public class LoginAction implements Action {

	private static Logger log = Logger.getLogger(LoginAction.class);

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		log.debug("loginAction is invoked ...");
		return "success";
	}

}
