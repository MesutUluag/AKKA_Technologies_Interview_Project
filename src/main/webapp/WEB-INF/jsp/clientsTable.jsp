<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Anmeldeformular - Kennenlerntagaufgabe</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <script src="http://code.jquery.com/jquery-2.1.3.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>

<body>
<h1>Thank you for your application</h1>

<table border="1">
    <tr>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Age</th>
    </tr>

    <c:forEach var="listValue" items="${clients}">
        <tr>
            <td><c:out value="${listValue.firstName}"/></td>
            <td><c:out value="${listValue.lastName}"/></td>
            <td><c:out value="${listValue.age}"/></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
