package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.champions.Champion;
import model.dao.ChampionDAO;
import model.user.User;

@WebServlet("/mage")
public class ChooseMageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = "main.html";
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		Champion champ = null;
		try {
			champ = ChampionDAO.getInstance().getMage();
		} catch (SQLException e) {
			System.out.println("ops");
		}
		
		u.setChamp(champ);
	}

}
