package chapter10;

//public class HelloFilter2 implements Filter {
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		PrintWriter out=response.getWriter();
//		out.println("[HelloFilter2(pre)]");
//		chain.doFilter(request, response);
//		out.println("[HelloFilter2(post)]");
//	}
//	public void init(FilterConfig config) {}
//	public void destroy() {}
//}