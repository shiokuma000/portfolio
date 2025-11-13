package model;

import java.util.List;

import dao.MuttersDAO;

public class GetMutterListLogic {

    // ログインユーザーIDを引数として受け取る
    public List<Mutter> execute(int loginUserId) {
        MuttersDAO dao = new MuttersDAO();
        List<Mutter> mutterList = dao.findAll(loginUserId);

        // 初期表示では liked を false にする
        for (Mutter mutter : mutterList) {
            mutter.setLiked(false);
        }

        return mutterList;
    }
}
