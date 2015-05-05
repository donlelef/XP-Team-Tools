package login;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.HttpAction;

public class SignInService extends AccountAction implements HttpAction {

	@SuppressWarnings("unchecked")
	@Override
	public void perform(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");

		HashMap<String, String> registeredUsersPass = new HashMap<String, String>();
		HashMap<String, String> registeredUsers = new HashMap<String, String>();
		registeredUsersPass = (HashMap<String, String>) request
				.getServletContext().getAttribute("registeredUsersPass");
		registeredUsers = (HashMap<String, String>) request.getServletContext()
				.getAttribute("registeredUsers");
		try {
			signInAuthenticate(userId, password, registeredUsersPass,
					registeredUsers);
			response.sendRedirect("timeline.jsp");
		} catch (Exception e) {
			request.getSession().setAttribute("exception", e);
			response.sendRedirect("home.jsp");
		}
	}
}
