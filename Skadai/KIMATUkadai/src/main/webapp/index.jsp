<%--
  Created by IntelliJ IDEA.
  User: KitamuraShuma
  Date: 2024/01/22
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Custom styles for this template -->
<%--    <link href="sign-in.css" rel="stylesheet">--%>
    <title>Simple Map</title>

</head>

<body class="d-flex align-items-center py-4 bg-body-tertiary">
<main class="form-signin w-100 m-auto">
    <form action="SigninServlet" method="post">
        <h1 class="h3 mb-3 fw-normal">KIMATUkadai</h1>

        <div class="form-floating">
            <input type="text" class="form-control" id="floatingInput" placeholder="User ID" name="id">
            <label for="floatingInput">User ID</label>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="pw">
            <label for="floatingPassword">Password</label>
        </div>

        <button class="btn btn-primary w-100 py-2" type="submit">Sign in</button>
        <a href="RegisterServlet" class="btn btn-primary w-100 py-2" type="submit" style="background-color: coral; margin-top: 10px;">新規登録</a>

    </form>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>

</body>
</html>
