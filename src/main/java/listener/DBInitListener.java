package listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import model.DBInit;

@WebListener
public class DBInitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // サーバー起動時に DB を初期化
        try {
            DBInit.initialize();
            System.out.println("DB 初期化完了");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // サーバー停止時に必要があれば処理
    }
}
