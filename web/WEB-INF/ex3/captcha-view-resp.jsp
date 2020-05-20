<%--
  Created by IntelliJ IDEA.
  User: weiyuan
  Date: 20/5/2020
  Time: 1:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Captcha View</title>
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

        input {
            padding: 2px 8px;
            border: solid 1px black;
            border-radius: 4px;
        }

        button {
            padding: 4px 8px;
            border: solid 1px black;
            border-radius: 4px;
            margin: auto;
            box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.2);
        }

        #form {
            display: flex;
            flex-flow: column;
        }
    </style>
</head>
<body>
<div id="main">
    <h1>Captcha View</h1>
    <% if ((Boolean) request.getAttribute("isPass")) {
    %>
    <h2 style="color: green;">Captcha Success !</h2>
    <%
    } else {
    %>
    <h2 style="color: red;">Captcha Failed !</h2>
    <%
        }
    %>
</div>
<script>

</script>
</body>
</html>
