package exponential;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;

@WebServlet(
		name = "Exponential",
		urlPatterns = "/Exponential"
		)


public class ExponentialServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String lVal = req.getParameter("l");
		
		ExponentialService expServe = new ExponentialService();
		Integer l = Integer.valueOf(lVal);
		
		List aspects = expServe.getAspects(l);
		
		
		
		req.setAttribute("parameter", aspects);
		RequestDispatcher view = req.getRequestDispatcher("exponentialResults.jsp");
		view.forward(req, resp);
	}

}
