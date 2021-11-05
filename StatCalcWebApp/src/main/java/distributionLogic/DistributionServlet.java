package distributionLogic;

import StatType.DistributionType;
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
		name = "selectdisservlet",
		urlPatterns = "/SelectDistribution"
		)

public class DistributionServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String disType = req.getParameter("disType");
		RequestDispatcher view = null;
		
		
		if(disType.equals("Negative Binomial")) {
			view = req.getRequestDispatcher("NegBinomial.jsp");
		}
		else {
		DistributionType type = DistributionType.valueOf(disType);
		
		
		switch(type) {
			case Bernoulli:
				view = req.getRequestDispatcher("Bernoulli.jsp");
				break;
			case Binomial:
				view = req.getRequestDispatcher("Binomial.jsp");
				break;
			case Geometric:
				view = req.getRequestDispatcher("Geometric.jsp");
				break;
			case Poisson:
				view = req.getRequestDispatcher("Poisson.jsp");
				break;
			case Uniform:
				view = req.getRequestDispatcher("Uniform.jsp");
				break;
			case Exponential:
				view = req.getRequestDispatcher("Exponential.jsp");
				break;
				}
		}
		
		view.forward(req,resp);
	}
	
}
