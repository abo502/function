<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>函数</title>
</head>
<body>
<form action="./fun" method="post">
    <h1>函数f(x)=2x+y:</h1>
    <table>
        <tr>
            <td>请输入X:</td>
            <td>
                <input type="number" name="x">
            </td>
        </tr>
        <tr>
            <td>请输入Y:</td>
            <td>
                <input type="number" name="y">
            </td>
        </tr>
        <tr>
            <td><h2>f(x)=2x+y:</h2></td>
            <td>
                <%
                    if (session.getAttribute("result") == null) {
                %>
                <h2><p>0</p></h2>
                <%
                } else {
                %>
                <h2><p><%=session.getAttribute("result")%>
                </p></h2>
                <%
                    }
                %>
            </td>
        </tr>
        <tr>
            <td colspan="2"><h2><input type="submit" value="计算"></h2></td>
        </tr>
    </table>
</form>
</body>
</html>
