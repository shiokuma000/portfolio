package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import dao.UserDAO;
import model.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String loginName = request.getParameter("loginName");
        String pass = request.getParameter("pass");

     // --- 入力チェック ---
        if (loginName == null || loginName.isEmpty() ||
            pass == null || pass.isEmpty()) {

            request.setAttribute("errorInput", "ユーザー名とパスワードを入力してください");
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // --- DB チェック ---
        User loginUser = new User();
        loginUser.setLoginName(loginName);
        loginUser.setPass(pass);

        UserDAO userDAO = new UserDAO();
        User foundUser = userDAO.findByLogin(loginUser);

        if (foundUser != null) {
            HttpSession session = request.getSession();
            session.setAttribute("loginUser", foundUser);

            session.setMaxInactiveInterval(5 * 60);
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);

            response.sendRedirect("Main");
            return;

        } else {
            request.setAttribute("errorAuth", "ユーザー名またはパスワードが違います");
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }

    }
}
