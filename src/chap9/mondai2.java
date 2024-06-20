package chap9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(urlPatterns={"/chap9/mondai2"})
public class mondai2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		Page.header(out);
		out.println("<h1>こちらのタイトルはServletで記述しています</h1>");

//		JSPファイルの読み込み
		req.getRequestDispatcher("mondai2.jsp").include(req,resp);

		out.println("<p>こちらの文はServletで記述しています</p>");
		Page.footer(out);
	}

}