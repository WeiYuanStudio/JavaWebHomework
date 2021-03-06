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
    <style>
        body {
            font-family: Arial, "Arial Black", "Microsoft YaHei", sans-serif, monospace;
        }

        #main {
            display: flex;
            width: max-content;
            flex-flow: column;
            padding: 50px;
            border: solid 1px;
            border-radius: 20px;
            margin: auto;
            margin-top: 20vh;
            box-shadow: 8px 8px 8px rgba(0, 0, 0, 0.2);
            user-select: none;
        }

        #main * {
            margin: 5px auto;
        }
    </style>
</head>
<body>
<div id="main">
    <h1>Receive form success</h1>
    <table>
        <tr>
            <td>Name:</td>
            <td><%= request.getParameter("name")%>
            </td>
        </tr>
        <tr>
            <td>ID:</td>
            <td><%= request.getParameter("id")%>
            </td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td><%= request.getParameter("gender")%>
            </td>
        </tr>
        <tr>
            <td>Age:</td>
            <td><%= request.getParameter("age")%>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
