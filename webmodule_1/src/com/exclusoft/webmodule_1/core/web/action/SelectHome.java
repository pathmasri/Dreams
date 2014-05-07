package src.com.exclusoft.webmodule_1.core.web.action;

import javax.servlet.*;
import javax.servlet.http.*;

import src.com.exclusoft.ejbmodule1.api.modle.Home;
import src.com.exclusoft.ejbmodule1.api.service.HouseBD;
import src.com.exclusoft.webmodule_1.api.dto.HomeFinder;
import src.com.exclusoft.webmodule_1.core.service.ModuleServiceLocator;

import java.util.List;
import java.io.*;



public class SelectHome extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
	//	response.setContentType("text/html" ) ;
	//	PrintWriter out = response.getWriter();
	//	out.println("Select your Dream Home here");
		String area = request.getParameter("area");
		String size = request.getParameter("sizeOfLand");	
		try {
			HouseBD houseBD = ModuleServiceLocator.getgetHouseBD();
			List<Home> homes = houseBD.getHouse();
			request.setAttribute("homes", homes);
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/jsp/result.jsp");
			view.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//List<Home> homes = HomeFinder.getHomes(Integer.parseInt(size),area);
		//request.setAttribute("homes", homes);
		//RequestDispatcher view = request.getRequestDispatcher("WEB-INF/jsp/result.jsp");
		//view.forward(request, response);
		
	

	}

}
