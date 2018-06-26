<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="../header.jsp"/>
<form action="addProduct" method="post" class="form-control"> Ajouter un product <br>
	<label >Produit :</label>
    <input name="ProductName" type="text" class="form-control"><br>
    <label>Description:</label>
    <input name="ProductDescription" type="text" class="form-control"><br>
    <label >Prix :</label>
    <input name="ProductPrice" type="text" class="form-control"><br>
    <input value="Submit" class="btn btn-primary" type="submit">
</form>
</body>
</html>