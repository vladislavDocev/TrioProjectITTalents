package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.champions.Champion;
import model.dao.ChampionDAO;
import model.user.User;

@WebServlet("/priest")
public class ChoosePriestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName;
		HttpSession session = request.getSession();
		if (!session.isNew()) {
			fileName = "play.jsp";
			User u = (User) session.getAttribute("user");
			if(u != null) {
			Champion champ = null;
			try {
				champ = ChampionDAO.getInstance().getPriest();
				u.setChamp(champ);
			} catch (SQLException e) {
				System.out.println("ops");
			}

			}else{
				fileName = "index.html";
			}
		}else{
			fileName = "index.html";
		}
		RequestDispatcher rd = request.getRequestDispatcher(fileName);
		rd.forward(request, response);
	}

}