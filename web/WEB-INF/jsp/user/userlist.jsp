<%--
  Created by IntelliJ IDEA.
  User: xiaoquan
  Date: 17-8-7
  Time: 下午2:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>用户</title>
  </head>
  <body>
  <table width="100%" border="1">
      <tr>
          <td>姓名</td>
          <td>邮箱</td>
          <td>密码</td>
      </tr>
      <c:forEach items="${userlist}" var="user">
          <tr>
              <td>${user.username}</td>
              <td>${user.email}</td>
              <td>${user.password}</td>
          </tr>

      </c:forEach>
  </table>
  欢迎你！
  http://java.sun.com/jsp/jstl/core
  </body>
</html>
