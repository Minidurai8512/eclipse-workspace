package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		{
			PrintWriter Out=response.getWriter();
		String  e1=request.getParameter("email");
			Out.print("welcome to niit");
		
		
		

		if(e1.equals("admin@gmail.com"))
		{
			//RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			//rd.forward(request, response);
		response.sendRedirect("success.jsp");		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp");
			rd.forward(request, response);
		
		}
	}
}
}