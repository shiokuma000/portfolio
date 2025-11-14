package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import util.PasswordUtil;

/**
 * ユーザー情報を扱うDAOクラス（SHA-256 + ソルト対応）。
 * - 登録時はPasswordUtil.hashPasswordでハッシュ化してDBに保存
 * - ログイン時はPasswordUtil.checkPasswordで照合
 */
public class UserDAO {

	private final String JDBC_URL = "jdbc:h2:~/desktop/h2/soloBear";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";


    // コンストラクタでH2ドライバをロード
    public UserDAO() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * ログイン処理
     * user 入力されたユーザー情報（loginNameとpassがセットされている）
     * 認証成功ならUserオブジェクト（パスワードはnull）、失敗ならnull
     */
    public User findByLogin(User user) {
        User foundUser = null;
        String sql = "SELECT ID, LOGIN_NAME, NAME, PASS FROM USERS WHERE LOGIN_NAME = ?";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
             PreparedStatement pStmt = conn.prepareStatement(sql)) {

            pStmt.setString(1, user.getLoginName());
            ResultSet rs = pStmt.executeQuery();

            if (rs.next()) {
                String storedHash = rs.getString("PASS"); // DBに保存されているソルト付きハッシュ

                // 入力パスワードと照合
                boolean matched = PasswordUtil.checkPassword(user.getPass(), storedHash);

                if (matched) {
                    int id = rs.getInt("ID");
                    String loginName = rs.getString("LOGIN_NAME");
                    String name = rs.getString("NAME");

                    // パスワードは返さない
                    foundUser = new User(id, loginName, name, null);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return foundUser;
    }

    /**
     * 新規登録処理
     * user 登録するユーザー情報（passは平文）
     * 登録成功でtrue、失敗でfalse
     */
    public boolean insert(User user) {
        String sql = "INSERT INTO USERS (LOGIN_NAME, NAME, PASS) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
             PreparedStatement pStmt = conn.prepareStatement(sql)) {

            // パスワードをSHA-256 + ソルトでハッシュ化
            String hashed = PasswordUtil.hashPassword(user.getPass());

            pStmt.setString(1, user.getLoginName());
            pStmt.setString(2, user.getName());
            pStmt.setString(3, hashed);

            int result = pStmt.executeUpdate();
            return result == 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
