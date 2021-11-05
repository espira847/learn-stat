package poisson;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;

@WebServlet(
		name = "Poisson",
		urlPatterns = "/Poisson"
		)

public class PoissonServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String lVal = req.getParameter("l");
		
		PoissonService poiServe = new PoissonService();
		Integer l = Integer.valueOf(lVal);
		
		List aspects = poiServe.getAspects(l);
		
		
		
		req.setAttribute("parameter", aspects);
		RequestDispatcher view = req.getRequestDispatcher("poissonResults.jsp");
		view.forward(req, resp);
	}

}
