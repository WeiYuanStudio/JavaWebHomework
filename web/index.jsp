<%@ page import="club.piclight.homework.javaweb.IndexUtil.Indexing" %>
<%@ page import="club.piclight.homework.javaweb.IndexUtil.IndexMark" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: Adam
  Date: 2/24/2020
  Time: 5:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Web Homework</title>
</head>
<body>
<table>
    <h1>Java Web Homework By WeiYuan 04181010</h1>
    <ul>
        <%
            ArrayList<Integer> exArray = new ArrayList<>();
            Indexing.getClassIndexMarkList().forEach(mark -> {
                exArray.add(mark.experimentID());
            });

            exArray.sort(Integer::compareTo);

            for (int i : exArray) {
        %>
        <li>
            <%= "实验" + i%>
            <ul>
                <%
                    for (IndexMark mark : Indexing.getClassIndexMarkList()) {
                        if (mark.experimentID() == i) {
                %>
                <li><a href="<%= mark.url()%>"><%= mark.title()%></a></li>
                <%
                        }
                    }
                %>
            </ul>
        </li>
        <%
            }
        %>
    </ul>
</table>
</body>
</html>
