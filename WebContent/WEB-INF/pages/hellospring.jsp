<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloSpring</title>
</head>
<body>
  <center>
    <br/><br/><br/>
    This is HelloSpring.jsp Page ！   
    <hr color="green">
        您好，我的名字叫：${name} ，我今年 ${year} 岁了 ！
    <br/><br/>
    <a href="index.jsp">点击跳回到主页</a>
    <br/><br/>
    <img src="img/dog.jpg" width="200" height="100">
    <br/><br/>
    Studentclass表中刚刚插入了一行信息：<br/>
    Classid=${studentclass.classid}<br/>
    ClassName=${studentclass.classname}<br/>    
  </center>
</body>
</html>