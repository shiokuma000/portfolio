<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
        <h1>Hello, soloBear</h1>

        <!-- 入力不足エラー -->
	<c:if test="${not empty errorInput}">
    	<div class="error-message input-error">
        	${errorInput}
    	</div>
	</c:if>

	<!-- 認証失敗エラー -->
	<c:if test="${not empty errorAuth}">
    	<div class="error-message auth-error">
        	${errorAuth}
    	</div>
	</c:if>

	<!-- セッションタイムアウト -->
	<c:if test="${param.msg == 'timeout'}">
	    <div class="error-message timeout-error">
	        セッションがタイムアウトしました。もう一度ログインしてください。
	    </div>
	</c:if>



        <form action="Login" method="post" autocomplete="off">
            <label>ユーザー名：</label>
            <input type="text" name="loginName" autocomplete="username"><br>

            <label>パスワード：</label>
            <input type="password" name="pass" autocomplete="current-password"><br>

            <input type="submit" value="ログイン">
        </form>
    </div>

</div>
<script src="js/change.js"></script>
</body>
</html>
