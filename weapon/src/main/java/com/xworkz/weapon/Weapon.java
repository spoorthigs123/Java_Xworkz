package com.xworkz.weapon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/weapon", loadOnStartup = 1)
public class Weapon extends HttpServlet{
	
	public Weapon() {
		System.out.println("Weapon information.....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String madeBy = req.getParameter("madeBy");
		String type = req.getParameter("type");
		

		System.out.println("name:" + name);
		System.out.println("lprice:" + price);
		System.out.println("madeBy:" + madeBy);
		System.out.println("type:" + type);
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "	<meta charset=\"ISO-8859-1\">\r\n"
				+ "	<title>X-Workz</title>\r\n"
				+ "	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
				+ "		integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n"
				+ "		<div class=\"container-md\">\r\n"
				+ "			<a class=\"navbar-brand\" href=\"#\">X-Workz</a>\r\n"
				+ "		</div>\r\n"
				+ "\r\n"
				+ "		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "					<li class=\"nav-item\">\r\n"
				+ "						<a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n"
				+ "					</li>\r\n"
				+ "					<li class=\"nav-item\">\r\n"
				+ "						<a class=\"nav-link\" href=\"weapon.html\">View</a>\r\n"
				+ "					</li>\r\n"
				+ "				</ul>\r\n"
				+ "				\r\n"
				+ "			</div>\r\n"
				+ "	</nav>\r\n"
				+ "	\r\n"
				+ "	<h2 class=\"d-flex justify-content-center\">Succesfully completed</h2>\r\n"
				+ "	\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");
		
		
		writer.println("<br>\name:" + name);
		writer.println("<br>\nprice:" + price);
		writer.println("<br>\nmadeBy:" + madeBy);
		writer.println("<br>\ntype:" + type);
		
		
	}
}
