package com.exclusoft.web;

import javax.servlet.*;
import javax.servlet.http.*;

import com.exclusoft.model.Home;
import com.exclusoft.model.HomeFinder;

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
		List<Home> homes = HomeFinder.getHomes(Integer.parseInt(size),area);
		request.setAttribute("homes", homes);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
	

	}

}
