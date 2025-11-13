package filter;

// Java Servlet API の I/O やフィルタ関連クラスを読み込む
import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// ──────────────────────────────
// ✅ このフィルタが適用される URL パターンを指定
// ──────────────────────────────
// Main と LikeServlet へのアクセスはログイン必須にする
@WebFilter({
    "/Main"
	// "/LikeServlet" は見た目のみの実装に伴い現在はなし
})
public class LoginFilter implements Filter {

    // ──────────────────────────────
    // ✅ フィルタ処理の本体
    // ──────────────────────────────
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // ──────────────────────────────
        // ServletRequest/ServletResponse を HTTP 専用の型にキャスト
        // （HttpServletRequest/HttpServletResponse にしないとセッション操作やリダイレクトが使えない）
        // ──────────────────────────────
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        // ──────────────────────────────
        // ✅ セッション取得
        // getSession(false) → セッションがなければ null を返す（新規作成はしない）
        // ──────────────────────────────
        HttpSession session = req.getSession(false);

        // ──────────────────────────────
        // セッションが存在する場合は有効期限を 5 分に設定
        // ※5分間リクエストがないと自動的にセッション切れになる
        // ──────────────────────────────
        if (session != null) {
            session.setMaxInactiveInterval(5 * 60); // 5分（秒単位）
        }

        // ──────────────────────────────
        // ✅ ログイン状態の判定
        // session が存在し、loginUser 属性があればログイン済みとみなす
        // ──────────────────────────────
        boolean isLoggedIn = (session != null && session.getAttribute("loginUser") != null);

        if (!isLoggedIn) {
            // ──────────────────────────────
            // ✅ 未ログインまたはセッション切れの場合の処理
            // index.jsp にリダイレクトし、クエリパラメータで timeout を伝える
            // ──────────────────────────────
            res.sendRedirect(req.getContextPath() + "/index.jsp?msg=timeout");
            return; // ここで処理終了、以降のサーブレットは実行されない
        }

        // ──────────────────────────────
        // ✅ ログイン済みの場合は次のフィルタまたはサーブレットに処理を渡す
        // chain.doFilter() を呼ぶことで、通常の処理フローに戻る
        // ──────────────────────────────
        chain.doFilter(request, response);
    }
}
