package StudentPack;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
//import java.io.IOException;
//import java.io.PrintWriter;

@SuppressWarnings("serial")
public class ReadCookieServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[] ck = request.getCookies();
		if (ck != null) {
			for (int i = 0; i < ck.length; i++)
				out.println("Hello " + ck[i].getValue());
		}
	}

}
