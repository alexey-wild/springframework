<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload</title>
</head>
<body>
    <form method="post" action="/upload" enctype="multipart/form-data">
        <input type="file" name="file"/>
        <input type="submit"/>
    </form>
</body>
</html>
