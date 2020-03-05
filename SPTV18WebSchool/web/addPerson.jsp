<%-- 
    Document   : addPerson
    Created on : 05.03.2020, 11:00:12
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
        <h1>Добавить ученика</h1>
        <p id="info">${info}</p>
        <form action="addPerson" method="POST">
            Имя: <input type="text" name="firstname" value="${firstname}"><br>
            Фамилия: <input type="text" name="lastname" value="${lastname}"><br>
            Телефон: <input type="text" name="status" value="${status}"><br>
            <button type="submit">Добавить</button>
        </form>
    </body>
</html>
