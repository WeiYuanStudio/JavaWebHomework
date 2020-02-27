<%--
  Created by IntelliJ IDEA.
  User: Adam
  Date: 2/27/2020
  Time: 11:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Receive form success</title>
</head>
<body>
<h1>Receive form success</h1>
<table>
    <tr>
        <td>Name:</td>
        <td><%= request.getParameter("name")%>
        </td>
    </tr>
    <tr>
        <td>Age:</td>
        <td><%= request.getParameter("age")%>
        </td>
    </tr>
</table>
</body>
</html>
