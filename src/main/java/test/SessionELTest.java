package test;

import java.util.HashMap;
import java.util.Map;

import model.User;

public class SessionELTest {
    public static void main(String[] args) {
        // 1. サーブレットのセッション風のマップを用意
        Map<String, Object> sessionScope = new HashMap<>();

        // 2. ログイン成功時のUserオブジェクトを作成
        User loginUser = new User(1, "osio001", "osio", null);

        // 3. sessionScopeにセット（JSPの sessionScope.loginUser 相当）
        sessionScope.put("loginUser", loginUser);

        // 4. EL式で参照しているプロパティを取得して表示
        User userFromSession = (User) sessionScope.get("loginUser");
        if (userFromSession != null) {
            System.out.println("ログインユーザー名: " + userFromSession.getName());
            System.out.println("LoginName: " + userFromSession.getLoginName());
            System.out.println("ID: " + userFromSession.getId());
        } else {
            System.out.println("sessionScope.loginUser は null です");
        }
    }
}
