package test;

import java.util.List;

import dao.MuttersDAO;
import model.Mutter;

public class MutterDBTest {
    public static void main(String[] args) {
        // テスト用のログインユーザーID
        int loginUserId = 1;  // おしおの場合

        MuttersDAO muttersDAO = new MuttersDAO();
        List<Mutter> mutterList = muttersDAO.findAll(loginUserId);

        if (mutterList.isEmpty()) {
            System.out.println("つぶやきがありません");
        } else {
            for (Mutter mutter : mutterList) {
                System.out.println("ID: " + mutter.getId());
                System.out.println("USER_ID: " + mutter.getUserId());
                System.out.println("USER_NAME: " + mutter.getUserName());
                System.out.println("TEXT: " + mutter.getText());
                System.out.println("------------------------");
            }
        }
    }
}
