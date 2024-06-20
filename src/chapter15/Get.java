package chapter15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.ProductDAO;
import tool.Page;

@WebServlet(urlPatterns={"/chapter15/get"})
public class Get extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		Page.header(out);
		try{
			int id = Integer.parseInt(req.getParameter("id"));
			ProductDAO dao=new ProductDAO();
			Product p=dao.get(id);

			if (p != null){

//				getIntメソッド...引数で指定した「列」のデータを
//				intで取り出す
				out.println(p.getId());
				out.println(":");

//				getStringメソッド...引数で指定した「列」のデータを
//				Stringで取り出す
				out.println(p.getName());
				out.println(":");

				out.println(p.getPrice());
				out.println("<br>");
			}
		}catch (Exception e){
			e.printStackTrace(out);
		}
		Page.footer(out);
	}

}