package com.arcticsoft.springjsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/servlet")
public class MyServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("HOLA DESDE MY SERVLET! <br/>");
		pw.println("<button onclick=\"window.location.href='/index.html';\">Inicio</button>");
		pw.close();
	}
}
