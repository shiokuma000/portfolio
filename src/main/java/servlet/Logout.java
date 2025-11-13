package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//セッションスコープを破棄
		HttpSession session = request.getSession();
		session.invalidate();

		// キャッシュ防止ヘッダを追加
	 	 response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	 	 response.setHeader("Pragma", "no-cache");
	 	 response.setDateHeader("Expires", 0);

		//ログアウト画面にフォワード
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/logout.jsp");
		dispatcher.forward(request, response);
	}


}
