package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.UserDAO;
import model.exceptions.InvalidEmailException;
import model.exceptions.InvalidNameException;
import model.exceptions.InvalidPasswordException;
import model.exceptions.InvalidUsernameException;
import model.user.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1190137669743686642L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// add the new user to db
		String user = req.getParameter("user");
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		String pass2 = req.getParameter("pass2");
		String email = req.getParameter("email");

		// validate data - if user.isEmpty and ....

		// if not valid data
		boolean validData = true;
		String filename = "register.html";
		if (validData) {
			filename = "index.html";
			User u = null;
			try {
				u = new User(name, user, pass2, email,0,0);
				try {
					UserDAO.getInstance().addUser(u);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					filename = "register.html";
				}
			} catch (InvalidNameException | InvalidUsernameException | InvalidPasswordException
					| InvalidEmailException e) {
				filename = "register.html";
				//Show user-friendly Error message
				System.out.println(e.getMessage());
			}

		}

		RequestDispatcher rd = req.getRequestDispatcher(filename);
		rd.forward(req, resp);
	}

}
