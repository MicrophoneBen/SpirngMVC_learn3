<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>

<body>
<h2>Hello World!</h2>

<form action="/demo/testPsot" method="post">
    <input type="text" name="username" value=""/>
    <br/>
    <input type="password" name="pass" value=""/>
    <br/>
    <input type="submit" value="发送一个登录表单">
</form>

<a href="/demo/testPsot">点击发送一个登录get请求</a>
<br/>


<form action="/demo/testDelete/8" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <br/>
    <input type="submit" value="发送一个删除请求">
</form>

<form action="/demo/testPut/9" method="post">
    <input type="hidden" name="_method" value="put"/>
    <br/>
    <input type="submit" value="发送一个PUT请求">
</form>


<form action="/demo/mappingClass" method="post">
    用户名： <input type="text" name="username" value=""/>
    <br/>
    密码： <input type="password" name="password" value=""/>
    <br/>
    邮箱： <input type="text" name="email" value=""/>
    <br/>
    年龄： <input type="text" name="age" value=""/>
    <br/>
    居住国家： <input type="text" name="locate.country" value=""/>
    <br/>
    居住城市： <input type="text" name="locate.city" value=""/>
    <br/>
    居住街道： <input type="text" name="locate.street" value=""/>
    <br/>
    <input type="submit" value="登录">
</form>

<a href="/demo/testServlet">测试Servlet</a>

</body>
</html>
