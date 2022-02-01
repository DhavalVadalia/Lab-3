<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note keeper</h1>
        <h2>Edit Note </h2>
        <form action="note" method="post">
            <table>
                <tr>   
                    <td>  <label for="title">Title:</label> </td>
                    <td>  <input type="text" id="title" name="title" placeholder="Title" value="${note.title}"> </td> </tr>
            <tr>   
                    <td> <label id="contents">Contents:</label>  </td>
                    <td> <textarea rows="6" id="contents" name="contents" placeholder="Contents"><c:out value="${note.contents}"/></textarea>  </td> </tr>
            <tr>    <td></td> <td>  <center> <button type="submit">Save</button> </center> </td> </tr>
            </table>
        </form>
    </body>
</html>
