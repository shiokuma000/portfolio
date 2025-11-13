package util;

import org.mindrot.jbcrypt.BCrypt;

/**
 * パスワードを安全にハッシュ化・照合するユーティリティクラス（改良版）。
 *
 * 特徴：
 * - ソルト（salt）は自動生成され、ハッシュ文字列に埋め込まれる
 * - ストレッチング（繰り返し計算）により総当たり攻撃に強い
 * - パスワードが null または空文字の場合は例外をスロー
 * - DBにはハッシュ済み文字列のみ保存すればOK
 */
public class PasswordUtil {

    // デフォルトのストレッチング回数（計算コスト）
    private static final int DEFAULT_LOG_ROUNDS = 12;

    /**
     * パスワードをBCryptでハッシュ化して返す。
     *
     * plainPassword ユーザーが入力した生パスワード
     * ハッシュ化済みのパスワード文字列（ソルト込み）
     * IllegalArgumentException パスワードが null または空文字の場合
     */
    public static String hashPassword(String plainPassword) {
        if (plainPassword == null || plainPassword.isEmpty()) {
            throw new IllegalArgumentException("パスワードは null または空文字にできません。");
        }

        try {
            // ランダムソルトを生成＋ストレッチング回数を設定
            String salt = BCrypt.gensalt(DEFAULT_LOG_ROUNDS);
            return BCrypt.hashpw(plainPassword, salt);
        } catch (Exception e) {
            throw new RuntimeException("パスワードハッシュ化中にエラーが発生しました。", e);
        }
    }

    /**
     * 入力されたパスワードとハッシュ化済みパスワードを比較する。
     *
     * plainPassword  ログイン時に入力されたパスワード
     * hashedPassword DBなどに保存されているハッシュ化パスワード
     * 一致すれば true、不一致なら false
     * IllegalArgumentException 引数が null または空文字の場合
     */
    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        if (plainPassword == null || plainPassword.isEmpty()) {
            throw new IllegalArgumentException("入力パスワードは null または空文字にできません。");
        }
        if (hashedPassword == null || hashedPassword.isEmpty()) {
            throw new IllegalArgumentException("保存ハッシュは null または空文字にできません。");
        }

        try {
            return BCrypt.checkpw(plainPassword, hashedPassword);
        } catch (Exception e) {
            throw new RuntimeException("パスワード照合中にエラーが発生しました。", e);
        }
    }
}
