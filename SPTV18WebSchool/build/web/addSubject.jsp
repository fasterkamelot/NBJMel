<%-- 
    Document   : addSubject
    Created on : 05.03.2020, 10:59:59
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
        <h1>Добавить предмет</h1>
        <p id="info">${info}</p>
        <form action="addSubject" method="POST">
            Предмет: <input type="text" name="subject"  value="${subject}"><br>
            Часы: <input type="text" name="hours" value="${hours}">
            <button type="submit">Добавить</button>
        </form>
    </body>
</html>
