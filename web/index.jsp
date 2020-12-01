<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: A11200321050135
  Date: 2020/11/30
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>斐波那契数列</title>
</head>
<body>
<form action="./seq" method="post">
    <h1 align="center">斐波那契数列:</h1>
    <br>
    <table border="1px" align="center">
        <tr>
            <td>请输入第几位数字:</td>
            <td>
                <input type="number" name="num">
            </td>
        </tr>
        <tr>
            <td>计算结果:</td>
            <td>
                <%
                    if (session.getAttribute("result") == null) {
                %>
                <p>0</p>
                <%
                } else {
                %>
                <p><%=session.getAttribute("result")%>
                </p>
                <%
                    }
                %>
            </td>
        </tr>
        <tr align="center">
            <td colspan="2"><input type="submit" value="计算"></td>
        </tr>
    </table>
</form>
</body>
</html>
