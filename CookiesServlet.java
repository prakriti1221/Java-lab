package StudentPack;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
public class CookiesServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("uname");
		out.println("Welcome User: " + n);
		Cookie ck = new Cookie("name", n);
		ck.setMaxAge(60 * 60 * 24);
		response.addCookie(ck);
		// Creating a form to check cookie
		out.println("<form action='ReadCookieServlet' method='post'>");
		out.println("<input type='submit' value='Read'>");
		out.println("</form>");
	}

}
