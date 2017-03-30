package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.champions.Champion;
import model.user.User;


@WebServlet("/play")
public class PlayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = null;
		HttpSession session = request.getSession();
		if(session.getAttribute("logged")==null) {
			fileName="main.html";
		}
		else {
			if(session.getAttribute("logged").equals(true)) {
				fileName="champions.jsp";
			}
			else {
				fileName="main.html";
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(fileName);
		rd.forward(request, response);
	}

}
