<%--
  Created by IntelliJ IDEA.
  User: KitamuraShuma
  Date: 2024/01/30
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登録フォーム</title>
</head>
<body>
<form action="RegisterServlet" method="post">
    <p>ID:<input type="text" name="id"></p>
    <p>Name:<input type="text" name="name"></p>
    <p>PW:<input type="password" name="pw"></p>

    <input type="submit" value="登録">
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>
