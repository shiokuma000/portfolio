package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import model.DBInit;
import util.PasswordUtil;

/**
 * ユーザー情報を扱うDAOクラス（SHA-256 + ソルト対応）。
 * - 登録時はPasswordUtil.hashPasswordでハッシュ化してDBに保存
 * - ログイン時はPasswordUtil.checkPasswordで照合
 */
public class UserDAO {

    /**
     * ログイン処理
     * user 入力されたユーザー情報（loginNameとpassがセットされている）
     * 認証成功ならUserオブジェクト（パスワードはnull）、失敗ならnull
     */
    public User findByLogin(User user) {
        User foundUser = null;
        String sql = "SELECT ID, LOGIN_NAME, NAME, PASS FROM USERS WHERE LOGIN_NAME = ?";

        try (Connection conn = DBInit.getConnection();
             PreparedStatement pStmt = conn.prepareStatement(sql)) {

            pStmt.setString(1, user.getLoginName());
            ResultSet rs = pStmt.executeQuery();

            if (rs.next()) {
                String storedHash = rs.getString("PASS");

                if (PasswordUtil.checkPassword(user.getPass(), storedHash)) {
                    int id = rs.getInt("ID");
                    String loginName = rs.getString("LOGIN_NAME");
                    String name = rs.getString("NAME");

                    foundUser = new User(id, loginName, name, null);
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
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

        try (Connection conn = DBInit.getConnection();
             PreparedStatement pStmt = conn.prepareStatement(sql)) {

            String hashed = PasswordUtil.hashPassword(user.getPass());

            pStmt.setString(1, user.getLoginName());
            pStmt.setString(2, user.getName());
            pStmt.setString(3, hashed);

            return pStmt.executeUpdate() == 1;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
