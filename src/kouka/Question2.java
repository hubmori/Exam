package kouka;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://サーバ名:ポート/プロジェクト名/Question2 のURLにアクセスされたときに呼び出される
@WebServlet(urlPatterns={"/Question2"})
public class Question2 extends HttpServlet {

    //Getリクエストでアクセスされたときの処理
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //現在日時を取得
        Date date = new Date();
        //時刻を取得
        int hour = date.getHours();

        //挨拶文を決定する
        String greeting = null;
        if(hour >= 5 && hour <= 10){
            greeting = "Good morning!";
        }else if(hour <= 16){
            greeting = "Hello!";
		}else{
		greeting = "Good evening!";
		}
		//レスポンスの生成
		response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println(date);
		out.println(greeting);
    }
}