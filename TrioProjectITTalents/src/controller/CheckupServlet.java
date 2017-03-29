package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.UserDAO;
import model.user.User;


@WebServlet("/check")
public class CheckupServlet extends HttpServlet {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -6457292480423374966L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO return all registered users to the client!
		HashMap<String, User> users = new HashMap<>();
		try {
			users = UserDAO.getInstance().getAllUsers();
		} catch (SQLException e) {
			System.out.println("users could not be loaded.");
		}
		resp.getWriter().append(users.toString());
	}
}
