package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.GetMutterListLogic;
import model.Mutter;
import model.PostMutterLogic;
import model.User;

@WebServlet("/Main")
public class Main extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // ---- GET：メイン画面の表示 ----
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // ✅ キャッシュ無効化（安全性のため維持）
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);

        // ✅ LoginFilter がログイン済みを保証 → 直接取得
        HttpSession session = request.getSession(false);
        User loginUser = (User) session.getAttribute("loginUser");

        // ✅ つぶやき一覧取得
        List<Mutter> mutterList =
                new GetMutterListLogic().execute(loginUser.getId());
        request.setAttribute("mutterList", mutterList);

        // ✅ 表示
        RequestDispatcher dispatcher =
                request.getRequestDispatcher("WEB-INF/jsp/mainEL.jsp");
        dispatcher.forward(request, response);
    }

    // ---- POST：投稿 / 削除 / いいね（PRG）----
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        // ✅ LoginFilter によりログインは保証済み
        HttpSession session = request.getSession(false);
        User loginUser = (User) session.getAttribute("loginUser");

        // -------------------------
        //  投稿処理
        // -------------------------
        String text = request.getParameter("text");

        if (text != null) {
            if (!text.isEmpty() && text.length() <= 100) {
                Mutter mutter = new Mutter();
                mutter.setUserId(loginUser.getId());
                mutter.setText(text);
                new PostMutterLogic().execute(mutter);

            } else {
                // ✅ 入力エラーをセッションに格納（PRG対応）
                if (text.isEmpty()) {
                    session.setAttribute("postError", "つぶやきが入力されていません");
                } else if (text.length() > 100) {
                    session.setAttribute("postError", "つぶやきは100文字以内で入力してください");
                }
            }
        }

        // -------------------------
        //  削除処理
        // -------------------------
        String deleteMutterId = request.getParameter("deleteMutterId");

        if (deleteMutterId != null) {
            int mutterId = Integer.parseInt(deleteMutterId);
            new PostMutterLogic().deleteMutter(mutterId, loginUser.getId());
        }

        // ✅ ★PRG★ → Main にリダイレクト（二重送信防止）
        response.sendRedirect("Main");
    }
}
