package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/Logincheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		if ("ramya".equals(uname)&& "sanjay".equals (password))
		{
			response(response,"login successfull");
		}
		else
		{
			response(response,"invalid login...Please enter valid login details...");
		}
	}
private void response(HttpServletResponse response,String msg) throws IOException{
	PrintWriter Out = response.getWriter();
	Out.println("<html>");
	Out.println("<body>");
	Out.println("<t1>"+msg+"</t1>");
	Out.println("</body>");
	Out.println("</html>");
	
	
	
}

	}


