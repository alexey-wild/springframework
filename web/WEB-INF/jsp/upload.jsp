<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Upload</title>
</head>
<body>
    <form:form method="post" action="${pageContext}" enctype="multipart/form-data">
        <input type="file" name="file"/>
        <input type="submit"/>
    </form:form>
</body>
</html>
