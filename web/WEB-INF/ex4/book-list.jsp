<%@ page import="club.piclight.homework.javaweb.Model.Book" %>
<%@ page import="java.util.List" %>
<%@ page import="club.piclight.homework.javaweb.Mock.BookMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hitomi
  Date: 22/6/2020
  Time: 3:34 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book List</title>
    <style>
        table.greyGridTable {
            border: 2px solid #FFFFFF;
            width: 100%;
            text-align: center;
            border-collapse: collapse;
        }
        table.greyGridTable td, table.greyGridTable th {
            border: 1px solid #FFFFFF;
            padding: 3px 4px;
        }
        table.greyGridTable tbody td {
            font-size: 13px;
        }
        table.greyGridTable td:nth-child(even) {
            background: #EBEBEB;
        }
        table.greyGridTable thead {
            background: #FFFFFF;
            border-bottom: 4px solid #333333;
        }
        table.greyGridTable thead th {
            font-size: 15px;
            font-weight: bold;
            color: #333333;
            text-align: center;
            border-left: 2px solid #333333;
        }
        table.greyGridTable thead th:first-child {
            border-left: none;
        }

        table.greyGridTable tfoot {
            font-size: 14px;
            font-weight: bold;
            color: #333333;
            border-top: 4px solid #333333;
        }
        table.greyGridTable tfoot td {
            font-size: 14px;
        }
    </style>
</head>
<body>
<h1>Book List</h1>

    <table class="greyGridTable">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>cover</th>
            <th>price</th>
            <th>count</th>
            <th>add</th>
            <th>remove</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${bookList}">
            <tr>
                <td>${book.getId()}</td>
                <td>${book.getName()}</td>
                <td><img src="${book.getCoverLink()}" alt="book cover"></td>
                <td>${book.getPrice()}</td>
                <td>${book.getNum()}</td>
                <td>
                    <form action="./book-list.do" method="post">
                        <input type="text" name="id" value="${book.getId()}" style="display: none;">
                        <input type="text" name="actionType" value="add" style="display: none;">
                        <button type="submit">+</button>
                    </form>
                <td>
                <td>
                    <form action="./book-list.do" method="post">
                        <input type="text" name="id" value="${book.getId()}" style="display: none;">
                        <input type="text" name="actionType" value="remove" style="display: none;">
<%--                        <button type="submit">-</button>--%>
                        <c:if test="${book.getNum() > 1}">
                            <button type="submit">-</button>
                        </c:if>
                    </form>
                <td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
