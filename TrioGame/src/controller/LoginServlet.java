package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.DBManager;
import model.dao.UserDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7518504298513100011L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//TODO try to validate login. 
				String user = req.getParameter("user");
				String pass = req.getParameter("pass");
				String fileName;
				try {
					if(UserDAO.getInstance().validLogin(user, pass)){
						fileName = "main.html";
					}
					else{
						fileName = "loginFailed.html";
					}
				} catch (SQLException e) {
					System.out.println("Error loging in - " + e.getMessage());
					fileName = "loginFailed.html";
				}
				RequestDispatcher rd = req.getRequestDispatcher(fileName);
				rd.forward(req, resp);
				System.out.println("Lognahme se!");
			}
			
			@Override
			public void destroy() {
				try {
					DBManager.getInstance().getConnection().close();
				} catch (SQLException e) {
				}
	}
}
