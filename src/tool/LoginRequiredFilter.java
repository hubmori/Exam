package tool;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

//フィルターを適用するURLの範囲を指定
//*は任意の文字列　=>　全てのURLに対して適用
@WebFilter(urlPatterns={"/a/*"})
public class LoginRequiredFilter implements Filter {

	@Override
	public void destroy() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("ログインフィルターの前処理");

		boolean isLogin = false;

//		ログインしていなかったら
		if(!isLogin){
//			ログインページにリダイレクト
			((HttpServletResponse)response).sendRedirect("/book/chapter4/hello2");
			return;
		}
		chain.doFilter(request, response);

		System.out.println("ログインフィルターの後処理");
	}

	@Override
	public void init(FilterConfig filterconfig) throws ServletException {
		// TODO 自動生成されたメソッド・スタブ

	}

}