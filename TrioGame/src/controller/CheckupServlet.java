package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.UserDAO;
import model.user.User;


@WebServlet("/check")
public class CheckupServlet extends HttpServlet {
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO return all registered users to the client!
		ArrayList<User> users = UserDAO.getInstance().getAllUsers();
		resp.getWriter().append(users.toString());
	}
}
