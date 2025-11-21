package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DBInit;
import model.Mutter;

public class MuttersDAO {

    // 全件取得（いいね情報も含む）
    public List<Mutter> findAll(int loginUserId) {
        List<Mutter> mutterList = new ArrayList<>();
        String sql = "SELECT M.ID AS mutter_id, M.USER_ID AS mutter_userId, M.TEXT, " +
                     "U.NAME AS user_name, " +
                     "COUNT(L.ID) AS like_count, " +
                     "CASE WHEN EXISTS(SELECT 1 FROM LIKES L2 WHERE L2.TWEET_ID=M.ID AND L2.USER_ID=?) " +
                     "THEN TRUE ELSE FALSE END AS liked_by_user " +
                     "FROM MUTTERS M " +
                     "JOIN USERS U ON M.USER_ID = U.ID " +
                     "LEFT JOIN LIKES L ON L.TWEET_ID = M.ID " +
                     "GROUP BY M.ID, M.USER_ID, M.TEXT, U.NAME " +
                     "ORDER BY M.ID DESC";

        try (Connection conn = DBInit.getConnection();
             PreparedStatement pStmt = conn.prepareStatement(sql)) {

            pStmt.setInt(1, loginUserId);
            ResultSet rs = pStmt.executeQuery();

            while (rs.next()) {
                Mutter mutter = new Mutter(
                    rs.getInt("mutter_id"),
                    rs.getInt("mutter_userId"),
                    rs.getString("user_name"),
                    rs.getString("TEXT"),
                    rs.getBoolean("liked_by_user"),
                    rs.getInt("like_count"),
                    ""
                );
                mutterList.add(mutter);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mutterList;
    }

    // 投稿作成
    public boolean create(Mutter mutter) {
        String sql = "INSERT INTO MUTTERS(USER_ID, TEXT) VALUES(?, ?)";
        try (Connection conn = DBInit.getConnection();
             PreparedStatement pStmt = conn.prepareStatement(sql)) {

            pStmt.setInt(1, mutter.getUserId());
            pStmt.setString(2, mutter.getText());
            return pStmt.executeUpdate() == 1;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 削除（自分の投稿のみ）
    public boolean delete(int id, int userId) {
        String sql = "DELETE FROM MUTTERS WHERE ID = ? AND USER_ID = ?";
        try (Connection conn = DBInit.getConnection();
             PreparedStatement pStmt = conn.prepareStatement(sql)) {

            pStmt.setInt(1, id);
            pStmt.setInt(2, userId);
            return pStmt.executeUpdate() == 1;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
