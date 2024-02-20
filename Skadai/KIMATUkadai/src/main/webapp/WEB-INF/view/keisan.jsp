<%--
  Created by IntelliJ IDEA.
  User: KitamuraShuma
  Date: 2024/01/15
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <title>時給から年収を計算する</title>
    <link rel="stylesheet" href="jikyuu.css">
</head>
<body id="fo">

<h2>時給から年収を計算する</h2>
<form method="post" action="keisanServlet">
<div class="math">
<label for="hourlyRate">時給（円）:</label>
<input type="number" id="hourlyRate" placeholder="時給を入力してください" required name="hourlyRate">

<label for="weeklyHours">週の労働時間（時間）:</label>
<input type="number" id="weeklyHours" placeholder="週の労働時間を入力してください" required name="weeklyHours">

<label for="weeksPerYear">年間の労働週数:</label>
<input type="number" id="weeksPerYear" placeholder="年間の労働週数を入力してください" required name="weeksPerYear">

<a onclick="calculateSalary()" class="btn btn-outline-info">計算</a>
</div>
<div id="result">

<script>
    function calculateSalary() {
        var hourlyRate = document.getElementById('hourlyRate').value;
        var weeklyHours = document.getElementById('weeklyHours').value;
        var weeksPerYear = document.getElementById('weeksPerYear').value;

        var annualSalary = hourlyRate * weeklyHours * weeksPerYear;

        // 結果を表示
        document.getElementById('result').innerHTML = '年収: ¥' + annualSalary.toLocaleString() + '<input type="hidden" name="annual_workweeks" value="' + annualSalary.toString() + '">';
    }
</script>
</div>
<button href="keisanServlet" class="btn btn-primary " type="submit" style="background-color: coral; margin-top: 10px;">送信</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>

