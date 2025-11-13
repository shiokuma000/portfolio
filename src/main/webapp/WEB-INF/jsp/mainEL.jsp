<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- キャッシュ防止 -->
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Expires" content="0">

<title>soloBear</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <div class="card">
        <h1>soloBear</h1>

        <p>
            <b><c:out value="${loginUser.name}" /></b> さん、ログイン中<br>
            <a href="Logout" onclick="return confirm('本当にログアウトしますか？');">ログアウト</a>
        </p>

        <img src="images/mark.png" class="theme-toggle" alt="テーマ切替">

        <!-- 投稿フォーム -->
        <form action="Main" method="post">
            <input type="text" name="text" placeholder="つぶやきを入力">
            <input type="submit" value="つぶやく">
        </form>

        <!-- ✅ エラーメッセージ（PRG用） -->
        <c:if test="${not empty sessionScope.postError}">
            <p class="error">
                <c:out value="${sessionScope.postError}" />
            </p>

            <!-- ✅ 表示後すぐ削除（1回だけ見せる） -->
            <c:remove var="postError" scope="session" />
        </c:if>

        <!-- 投稿リスト -->
        <c:forEach var="mutter" items="${mutterList}">
            <div class="tweet">
                <div class="tweet-header">
                    <img src="images/bear.jpg" alt="ユーザーアイコン" class="tweet-icon">
                    <b class="tweet-username"><c:out value="${mutter.userName}" /></b>
                </div>

                <div class="tweet-content">
                    <c:out value="${mutter.text}" />
                </div>

                <div class="tweet-actions">
                    <button class="action-btn">💬</button>
                    <button class="action-btn">⇋</button>
                    <button class="action-btn like-btn" data-tweetid="${mutter.id}">
                        <span class="${mutter.liked ? 'liked' : ''}">
                            ${mutter.liked ? '♥' : '♡'}
                        </span>
                    </button>
                    <button class="action-btn">✈️</button>
                </div>

                <c:if test="${loginUser.name == mutter.userName}">
                    <form action="Main" method="post" class="delete-form"
                          onsubmit="return confirm('本当に削除しますか？');">
                        <input type="hidden" name="deleteMutterId" value="${mutter.id}">
                        <button type="submit" class="delete-btn">削除</button>
                    </form>
                </c:if>
            </div>
        </c:forEach>
    </div>
</div>

<script src="jS/change.js"></script>
</body>
</html>
