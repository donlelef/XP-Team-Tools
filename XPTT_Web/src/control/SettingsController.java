package control;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.actions.HttpAction;
import control.actions.settings.MemberAdder;

/**
 * Servlet implementation class TimelineController
 */
@WebServlet("/SettingsController")
public class SettingsController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private HashMap<String, HttpAction> actions = new HashMap<String, HttpAction>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SettingsController() {
		super();
		this.initializeMap();
	}

	private void initializeMap() {
		this.actions.put("addition", new MemberAdder());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.actions.get(request.getParameter("action")).perform(request,
				response);
	}

}
