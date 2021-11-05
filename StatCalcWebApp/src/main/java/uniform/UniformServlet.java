package uniform;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;

@WebServlet(
		name = "uniformDis",
		urlPatterns = "/Uniform"
		)


public class UniformServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String aVal = req.getParameter("a");
		String bVal = req.getParameter("b");
		
		UniformService uniServe = new UniformService();
		Double a = Double.valueOf(aVal);
		Double b = Double.valueOf(bVal);
		
		List aspects = uniServe.getAspects(a, b);
		
		req.setAttribute("parameters", aspects);
		RequestDispatcher view = req.getRequestDispatcher("uniformResults.jsp");
		view.forward(req, resp);
	}
}
