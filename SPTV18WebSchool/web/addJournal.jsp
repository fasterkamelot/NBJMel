<%-- 
    Document   : addJournal
    Created on : 05.03.2020, 10:52:46
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>eKool</title>
    </head>
    <body>
        <h1>Добавить журнал</h1>
        <p id="info">${info}</p>
        <form action="addJournal" method="POST">
            Ученик: <input type="text" name="person" value="${person}"><br>
            Предмет: <input type="text" name="subject"  value="${subject}"><br>
            Оценка: <input type="text" name="mark" value="${mark}"><br>
            <button type="submit">Добавить</button>
        </form>
    </body>
</html>
