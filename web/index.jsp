<%--
  Created by IntelliJ IDEA.
  User: Adam
  Date: 2/24/2020
  Time: 5:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="club.piclight.homework.javaweb.IndexUtil.Indexing" %>
<%@ page import="club.piclight.homework.javaweb.IndexUtil.IndexMark" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Java Web Homework</title>
    <link rel="stylesheet" type="text/css" href="./style.css"/>
</head>
<body>
<h1 id="title">Java Web Homework By WeiYuan 04181010</h1>
<div id="note">
    <p>我自定义了个注解，以及对应的遍历。当访问该页时，会自动扫描<code>club.piclight.homework.javaweb.view</code>下的所有含有注解的类。</p>
    <p>本页面由自定义扫描注解自动生成</p>
    <p>代码托管于<img src="https://gitee.com/logo-black.svg" style="max-height: 1em;margin: 1px 4px"><a href="https://gitee.com/WeiYuanStudio/JavaWebHomework">WeiYuan@Gitee / JavaWebHomework</a></p>
</div>
<div id="main-frame">
    <table>
        <ul>
            <%
                Set<Integer> exSet = new HashSet<>();
                Indexing.getClassIndexMarkList().forEach(mark -> {
                    exSet.add(mark.experimentID());
                });

                List<Integer> exArray = new ArrayList<>(exSet);

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
                    <li><a href="<%= mark.url()%>"><%= mark.title()%>
                    </a></li>
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
</div>
</body>
</html>
