<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="fr.myschool.supcommerce.model.Product"%>
<%@page import="fr.myschool.supcommerce.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show product</title>
</head>
<body>

    <jsp:include page="header.jsp"/>

    <% Product product = (Product) request.getAttribute("product"); %>

    <div class="d-flex flex-column bd-highlight mb-3">

        <div class="p-2 bd-highlight"> <label>Id : </label> <%= product.getId()%></div>

        <div class="p-2 bd-highlight"><label>Nom : </label> <%= product.getName()%></div>

        <div class="p-2 bd-highlight"><label>Description : </label> <%= product.getDescription()%></div>

        <div class="p-2 bd-highlight"><label>Prix : </label> <%= product.getPrice()%></div>

    </div>

</body>
</html>