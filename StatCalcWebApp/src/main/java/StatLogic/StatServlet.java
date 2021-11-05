package StatLogic;

import StatType.StatType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;


@WebServlet(
		name = "selectstatservelt",
		urlPatterns = "/SelectStat"
		)
public class StatServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String statType = req.getParameter("Type");
		
		StatType type = StatType.valueOf(statType);
		RequestDispatcher view = null;
		
		if(type.equals(StatType.Distribution)) {
			view = req.getRequestDispatcher("distributionSelection.jsp");
			
		}
		else if(type.equals(StatType.Descriptive)) {
			view = req.getRequestDispatcher("Descriptive.jsp");
	
		}
	
		view.forward(req, resp);
	}
	

}
