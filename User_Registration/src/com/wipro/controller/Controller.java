package com.wipro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.Bean;
import com.wipro.service.Service;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String emailid=request.getParameter("emailaddress");
		String userId=request.getParameter("id");
		Bean bean=new Bean(firstname,lastname,emailid,userId);
		Service s=new Service();
		if(s.existingUser(bean))
		{
			PrintWriter out=response.getWriter();  
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('User already Registered');"); 
			out.println("location='Registration.jsp'");
			out.println("</script>");
		}
		else if(s.storeData(bean))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
		}
		else
		{
			PrintWriter out=response.getWriter();  
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Registration Failed');");
			out.println("location='Registration.jsp'");
			out.println("</script>");
		}
	}

}
