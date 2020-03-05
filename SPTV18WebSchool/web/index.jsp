<%-- 
    Document   : index
    Created on : 05.03.2020, 8:57:19
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
        <h1>Цифровой журнал</h1>
        <p id="info">${info}</p>
        <p>
        <a href="addPerson">Добавить ученика</a><br>
        <a href="addSubject">Добавить предмет</a><br>
        <a href="addMark">Добавить оценку</a><br>
        <br>
        <a href="addJournal">Добавить журнал</a><br>
        <br>
        <a href="deletePerson">Убрать ученика</a><br>
        <a href="deleteSubject">Убрать предмет</a><br>
        <a href="deleteMark">Убрать оценку</a><br>
        <br>
        <a href="delteJournal">Убрать журнал</a><br>
        <br>
        <a href="showJournal">Просмтор журнала</a><br>
        </p>
    </body>
</html>
