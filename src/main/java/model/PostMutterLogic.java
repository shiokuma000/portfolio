package model;

import dao.MuttersDAO;

public class PostMutterLogic {

    // 新規つぶやき投稿
    public void execute(Mutter mutter) {
        MuttersDAO dao = new MuttersDAO();
        dao.create(mutter);
    }

 // つぶやき削除（自分の投稿のみ）
    public void deleteMutter(int id, int userId) {
        MuttersDAO dao = new MuttersDAO();
        dao.delete(id, userId);  // int 型で渡す
    }

}
