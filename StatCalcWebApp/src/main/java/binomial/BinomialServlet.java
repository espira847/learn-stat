package binomial;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;

@WebServlet(
		name = "binomialDis",
		urlPatterns = "/Binomial"
		)

public class BinomialServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pVal = req.getParameter("p");
		String nTimes = req.getParameter("n");
		
		BinomialService biServe = new BinomialService();
		Double p = Double.valueOf(pVal);
		Integer n = Integer.valueOf(nTimes);
		
		List aspects = biServe.getAspects(p, n);
		
		req.setAttribute("parameters", aspects);
		RequestDispatcher view = req.getRequestDispatcher("negBiResults.jsp");
		view.forward(req, resp);
	}
	

}
