import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*; 
import java.sql.*;
import Bean.user;
import DAO.loginDao;
public class reg extends HttpServlet { 
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
 {
 	response.setContentType("text/html");
 	PrintWriter out = response.getWriter();
 	String name = request.getParameter("sname");
 	String roll = request.getParameter("roll");
 	String email = request.getParameter("mail");
 	String mobile = request.getParameter("mobi");
 	user u = new user();
 	u.setName(name);
 	u.setRoll(roll);
 	u.setEmail(email);
 	u.setMobile(mobile);
 	loginDao d = new loginDao();
 	int f = d.authenticate(u);
 	if(f == 1)
 	{
 		request.getRequestDispatcher("index.html").forward(request,response);

 	}
 	else
 	{
		request.getRequestDispatcher("index.html").forward(request,response); 		
 	}
}
}