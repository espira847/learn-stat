package bernoulli;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;

@WebServlet(
		name = "bernoulliRV",
		urlPatterns = "/Bernoulli"
		)
public class BernouillServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pVal = req.getParameter("p");
		
		BernoulliService bernServe = new BernoulliService();
		Double p = Double.valueOf(pVal);
		
		List aspects = bernServe.getAspects(p);
		
		req.setAttribute("parameter", aspects);
		RequestDispatcher view = req.getRequestDispatcher("bernoulliResults.jsp");
		view.forward(req, resp);
	}
	

}
