package chapter4;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter4/hello5"})
public class Hello5 extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		Page.header(out);

		out.println("<p>Congraturations!</p>");
		out.println("<p>おめでとう！</p>");
		out.println("<p>"+new java.util.Date()+"</p>");

		Page.footer(out);
	}
}