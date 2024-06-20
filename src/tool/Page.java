package tool;

import java.io.PrintWriter;

/**
 * Pageクラス
 * ページに対して共通に行う処理をまとめたクラス
 * @author r_kanamori
 *
 */
public class Page {

	/**
	 * headerメソッド
	 * 先頭に出力するHTML
	 * @param out
	 */
	public static void header(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Servlet/JSP Sample Programs</title>");
		out.println("</head>");
		out.println("<body>");
	}

	/**
	 * footerメソッド
	 * 末尾に出力するHTML
	 * @param out
	 */
	public static void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}
}
