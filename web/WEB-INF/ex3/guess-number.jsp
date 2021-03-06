<%@ page import="club.piclight.homework.javaweb.DB.GuessNumberRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! boolean numberStatus; %>
<%
    String jSession = request.getSession().getId();
    numberStatus = GuessNumberRepository.hasGuessNumber(jSession);
%>
<html>
<head>
    <title>猜数字</title>
    <meta charset="UTF-8">
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
    <h1>猜数字</h1>
    <form id="form" method="post">
        <h3 style="color: <%= numberStatus ? "green" : "red" %>">
            <%= numberStatus ? "已生成数字" : "未生成数字" %>
        </h3>
        操作类型:
        <label>生成数字<input type="radio" name="action" value="generate" checked></label>
        <label>猜数字<input type="radio" name="action" value="guess"></label>
        <label>显示答案<input type="radio" name="action" value="show"></label>
        <label>
            我的猜测:
            <input type="number" name="user-guess" value="0">
        </label>
        <button type="submit">提交</button>
    </form>
</div>
</body>
<script>
</script>
</html>
