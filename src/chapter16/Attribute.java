package chapter16;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;

@WebServlet(urlPatterns={"/chapter16/attribute"})
public class Attribute extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product p=new Product();
		p.setId(1);
		p.setName("まぐろ");
		p.setPrice(100);

		req.setAttribute("product", p);
		req.getRequestDispatcher("attribute.jsp")
		.forward(req, resp);
	}

}
