package kouka;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/kouka/Question6B"})
public class Question6B extends HttpServlet {
	protected void doGet (
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException {
		System.out.println("サーブレット6Bの処理");
		request.getRequestDispatcher("Question61.jsp").forward(request, response);
	}
}
