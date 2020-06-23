<%--
  Created by IntelliJ IDEA.
  User: hitomi
  Date: 24/6/2020
  Time: 2:19 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tax Cal</title>
    <jsp:include page="/WEB-INF/bootstrap-header.jsp" />
</head>
<body>
<form class="form-horizontal" method="post">
    <fieldset>

        <!-- Form Name -->
        <legend>Tax Cal</legend>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="incomePerMon">月收入</label>
            <div class="col-md-4">
                <input id="incomePerMon" name="incomePerMon" type="text" placeholder="1000" class="form-control input-md">
                <span class="help-block">请输入您的月收入</span>
            </div>
        </div>

        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="submit"></label>
            <div class="col-md-4">
                <button id="submit" name="submit" class="btn btn-primary">提交</button>
            </div>
        </div>

    </fieldset>
</form>
</body>
</html>
