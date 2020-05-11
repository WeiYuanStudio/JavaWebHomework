<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    boolean status;
%>
<%
    status = "root".equals(request.getParameter("username")) && "123456".equals(request.getParameter("password"));
%>
<html>
<head>
    <%if (status) {
    %>
        <title>Login success</title>
    <%} else {%>
        <title>Login failed</title>
    <%}%>

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
    <%if (status) {
    %>
    <h1>Login success</h1>
    <table>
        <tr>
            <td>Name:</td>
            <td><%= request.getParameter("username")%>
            </td>
        </tr>
    </table>
    <%} else {%>
    <h1>Login failed</h1>
    <%}%>
</div>
</body>
</html>
