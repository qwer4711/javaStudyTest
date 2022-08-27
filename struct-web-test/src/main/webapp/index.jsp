<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>struts 学习</title>
</head>
<body>
<h2>Welcome to my home...</h2>
<form action="params" method="post">
    年龄:<input type="text"  value="2" />
    宠物年龄：<input type="text" name="dog.age" />
    宠物名：<input type="text" name="dog.name" />
    <input type="submit" value="参数传递值测试" />
</form>
<p4>获取的pojo值：${requestScope.age}****${requestScope.dog.age} *****   ${requestScope.dog.name}</p4>

</body>
</html>