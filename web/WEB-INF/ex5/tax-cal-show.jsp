<%--
  Created by IntelliJ IDEA.
  User: hitomi
  Date: 24/6/2020
  Time: 2:19 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="taxBean" scope="request" class="club.piclight.homework.javaweb.Model.TaxBean">
    <jsp:setProperty name="taxBean"  property="income" value="${param.incomePerMon}"/>
</jsp:useBean>
<html>
<head>
    <title>Tax Cal</title>
    <jsp:include page="/WEB-INF/bootstrap-header.jsp" />
</head>
<body>
<h1>Tax Cal</h1>
<form class="form-horizontal">
    <fieldset>

        <!-- Form Name -->
        <legend>Tax Cal</legend>


        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="incomePerMon">您应缴纳税额</label>
            <div class="col-md-4">
                <input id="incomePerMon" name="incomePerMon" type="text" placeholder="${taxBean.tax}" class="form-control input-md">
            </div>
        </div>

    </fieldset>
</form>

</body>
</html>
