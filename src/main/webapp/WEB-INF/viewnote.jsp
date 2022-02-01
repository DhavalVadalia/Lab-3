<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
         <table>
                <tr>   
                    <td> <b>Title:</b> </td>
                    <td> <c:out value="${note.title}"/> </td> </tr>
        <tr>   
            <td> <b>Contents: </b></td>
            <td> <c:out value="${note.contents}"/> </td> </tr>
         </table>
        <a href="note?edit">Edit</a>
        
    </body>
</html>
