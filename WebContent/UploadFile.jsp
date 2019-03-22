<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h1>Upload File Page</h1>
<form action="uploadFile.do" method="post" enctype="multpart/form-data">
Upload File:<input type="file" name="fileupload"><br></br>
<input type="submit" value="submit">
${msg}

</form>

</body>
</html>