package model;

import dao.UserDAO;

public class LoginLogic {

    public User execute(User loginUser) {
        // DB で login_name と pass をチェック
        UserDAO userDAO = new UserDAO();
        User foundUser = userDAO.findByLogin(loginUser);
        return foundUser;  // 見つかれば User オブジェクト、見つからなければ null
    }
}
