package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainServletCheck {
    public static void main(String[] args) {
        // サーブレットのURL
        String servletUrl = "http://localhost:8080/soloBear/Main";

        try {
            URL url = new URL(servletUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // 接続してレスポンスコードを取得
            int responseCode = connection.getResponseCode();
            System.out.println("サーブレットURL: " + servletUrl);
            System.out.println("HTTPステータスコード: " + responseCode);

            if (responseCode == 200) {
                System.out.println("→ サーブレットは存在し、正常にアクセス可能です");
            } else if (responseCode == 404) {
                System.out.println("→ サーブレットが見つかりません（404）");
            } else {
                System.out.println("→ その他のHTTPステータスコード: " + responseCode);
            }

        } catch (IOException e) {
            System.out.println("接続エラー: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
