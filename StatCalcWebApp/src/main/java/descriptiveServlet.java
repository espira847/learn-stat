import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.util.*;

@WebServlet("/descriptiveResults.jsp")
public class descriptiveServlet extends HttpServlet{
	
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 ArrayList<Double> info = new ArrayList<>();
		 descriptiveService des;
		
		if(req.getParameter("add") != null) {
			String d = req.getParameter("data");
			Double data = Double.valueOf(d);
			info.add(data);
 		}else if(req.getParameter("Submit") != null) {
		
		des = new descriptiveService(info);
		
		List aspects = des.getAspects();
		
		
		req.setAttribute("parameters", aspects);
		RequestDispatcher view = req.getRequestDispatcher("descriptiveResults.jsp");
		view.forward(req, resp);
		
	}}

}
