<%--
  Created by IntelliJ IDEA.
  User: weiyi
  Date: 2019-03-24
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Container Information</title>
</head>
<body>
<div style="color: crimson">
    This is informations of container.
    <li>
        容器的ID是：${container.id}
    </li>
    <li>
        容器的名字是：${container.name}
    </li>
    <li>
        容器的创建用户是：${container.user}
    </li>
    <li>
        容器的创建时间为：${container.createtime}
    </li>
    <li>
        容器的镜像ID为：${container.imageid}
    </li>
    <li>
        容器的镜像名字为：${container.imagename}
    </li>

</div>

</body>
</html>
