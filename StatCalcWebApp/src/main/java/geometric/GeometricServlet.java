
package geometric;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;

@WebServlet(
		name = "geometricDis",
		urlPatterns = "/Geometric"
		)

public class GeometricServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pVal = req.getParameter("p");
		
		GeometricService geoServe = new GeometricService();
		Double p = Double.valueOf(pVal);
		
		List aspects = geoServe.getAspects(p);
		
		req.setAttribute("parameter", aspects);
		RequestDispatcher view = req.getRequestDispatcher("geometricResults.jsp");
		view.forward(req, resp);
	}
	
	

}
