package chap14;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import tool.Page;

@WebServlet(urlPatterns={"/chap14/mondai22"})
public class Mondai22 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Page.header(out);

		try{
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/book");
			Connection con = ds.getConnection();

//			データベースを使った処理を記述

			PreparedStatement st = con.prepareStatement(
					"select * from student"
					);
//			SQL文を実行した結果をリザルトセットに格納
			ResultSet rs = st.executeQuery();

//			取得した結果を表示
//			結果から１件ずつ取り出すループ
			out.println("<table border=1>");
			out.println("<tr><th>学生番号</th><th>学生名</th><th>コースID</th></tr>");
			while(rs.next()){
//				getIntメソッド...引数で指定した「列」のデータをintで取り出す
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getInt("student_id"));
				out.println("</td>");

//				getStringメソッド...引数で指定した「列」のデータをStringで取り出す
				out.println("<td>");
				out.println(rs.getString("student_name"));
				out.println("</td>");

				out.println("<td>");
				out.println(rs.getInt("course_id"));
				out.println("</td>");
				out.println("</tr>");
			}
			out.println("</table>");

//			データベースとの接続を解除（必ず書く！！！！）
			st.close();
			con.close();

		}catch(Exception e){
			e.printStackTrace(out);
		}

		Page.footer(out);
	}

}
