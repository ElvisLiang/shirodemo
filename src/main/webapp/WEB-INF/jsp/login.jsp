<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"  %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div style="margin-left: auto;margin-right: auto;">
    <h1>${message}</h1>
    <h2 style="margin-left: auto;margin-right: auto;">登陆页面</h2><br/>
    <form action="/login" method="post"><br/>
    <input type="text" name="username" /><br/>
    <input type="password" name="password" /><br/>
    <input style="margin-left: auto;margin-right: auto;" type="submit" /><br/>
    </form>
</div>
</body>
</html>