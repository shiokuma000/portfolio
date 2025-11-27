package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInit {

	// アプリケーション全体で使う DB パス
    public static String dataFolderPath;

    // --- DB 接続 ---
    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName("org.h2.Driver");
        // 絶対パスを使うように変更
        String dbPath = dataFolderPath + "/soloBear";
        return DriverManager.getConnection("jdbc:h2:" + dbPath + ";AUTO_SERVER=TRUE", "sa", "");

        // プロジェクト直下 data フォルダ内 DB を使用
        //return DriverManager.getConnection("jdbc:h2:./data/soloBear;AUTO_SERVER=TRUE", "sa", "");
    }

    public static void initialize() {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {

            // --- USERS テーブル ---
            String sqlUsers =
                "CREATE TABLE IF NOT EXISTS USERS (" +
                "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                "LOGIN_NAME VARCHAR(50) NOT NULL, " +
                "NAME VARCHAR(100) NOT NULL, " +
                "PASS VARCHAR(100) NOT NULL, " +
                "CONSTRAINT UNIQUE_LOGIN_NAME UNIQUE(LOGIN_NAME)" +
                ")";
            stmt.execute(sqlUsers);

            // --- MUTTERS テーブル ---
            String sqlMutters =
                "CREATE TABLE IF NOT EXISTS MUTTERS (" +
                "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                "USER_ID INT NOT NULL, " +
                "TEXT VARCHAR(255) NOT NULL, " +
                "CREATED_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP, " +
                "CONSTRAINT FK_MUTTERS_USER FOREIGN KEY (USER_ID) " +
                "REFERENCES USERS(ID) ON DELETE CASCADE" +
                ")";
            stmt.execute(sqlMutters);

            // --- LIKES テーブル ---
            String sqlLikes =
                "CREATE TABLE IF NOT EXISTS LIKES (" +
                "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                "TWEET_ID INT NOT NULL, " +
                "USER_ID INT NOT NULL, " +
                "CONSTRAINT FK_LIKES_TWEET FOREIGN KEY (TWEET_ID) " +
                "REFERENCES MUTTERS(ID) ON DELETE CASCADE, " +
                "CONSTRAINT FK_LIKES_USER FOREIGN KEY (USER_ID) " +
                "REFERENCES USERS(ID) ON DELETE CASCADE, " +
                "CONSTRAINT UNIQUE_LIKE UNIQUE (TWEET_ID, USER_ID)" +
                ")";
            stmt.execute(sqlLikes);

            // --- 初期データ挿入 ---
            insertUserIfNotExists(conn, "osio001", "osio", " $2a$12$ZEa1zuihcatevkL5TRJUiux.SomWt6keULI/xk/mEEyvNtIRf4kmK");
            insertUserIfNotExists(conn, "kuma_3", "kuma", "$2a$12$PgBunqNiVJzJmFM6BNL8zu5PZhW4EPHoEvn/fw2db9P4vJiKkggeu");
            insertUserIfNotExists(conn, "test", "くまと遊ぼ", "$2a$12$hn4sz6KoJXXCP21knZ0HA.zCqpN4Y1ZCvcZKyyYHPcOvcesukk/hu");
            insertUserIfNotExists(conn, "siokumahonpo", "saltBear", "$2a$12$zYxYtC2RRx1wOvaPwEK4E.ZMa5Sqjcp6bYRmdYFBfBEqy.FpgLIXy");

            insertMutterIfNotExists(conn, 1, "こんにちは！");
            insertMutterIfNotExists(conn, 2, "Hello, World");
            insertMutterIfNotExists(conn, 4, "Thank you for visiting this page! I wish you lots of happiness!");

            System.out.println("soloBear テーブル初期化完了");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // --- USERS 挿入（存在確認付き） ---
    private static void insertUserIfNotExists(Connection conn, String loginName, String name, String pass) throws Exception {
        String sql = "INSERT INTO USERS(LOGIN_NAME, NAME, PASS) " +
                     "SELECT ?, ?, ? WHERE NOT EXISTS (SELECT * FROM USERS WHERE LOGIN_NAME = ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, loginName);
            pstmt.setString(2, name);
            pstmt.setString(3, pass);
            pstmt.setString(4, loginName);
            pstmt.executeUpdate();
        }
    }

    // --- MUTTERS 挿入（存在確認付き） ---
    private static void insertMutterIfNotExists(Connection conn, int userId, String text) throws Exception {
        String sql = "INSERT INTO MUTTERS(USER_ID, TEXT) " +
                     "SELECT ?, ? WHERE NOT EXISTS (SELECT * FROM MUTTERS WHERE USER_ID = ? AND TEXT = ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, text);
            pstmt.setInt(3, userId);
            pstmt.setString(4, text);
            pstmt.executeUpdate();
        }
    }
}
