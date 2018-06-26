<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.io.PrintWriter"%>
<%@page import="fr.myschool.supcommerce.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="fr.myschool.supcommerce.dao.ProductDao"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"/>

<%List<Product> products = ProductDao.getAllProducts();
request.getAttribute("products"); %>

<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Description</th>
            <th scope="col">Price</th>
            <th scope="col">Actions</th>
        </tr>
        </thead>
        <tbody>
        <% for (int i = 0; i < products.size(); i++) { %>
        <% Product product = products.get(i); %>
        <tr>
            <th scope="row"><%= product.getId()%></th>
            <td><%= product.getName()%></td>
            <td><%= product.getDescription()%></td>
            <td><%= product.getPrice()%></td>
            <td><a class="btn btn-primary" href="/SupCommerce/showProduct?id=<%= product.getId() %>" role="button">Show</a></td>
            <td><a class="btn btn-primary" href="/SupCommerce/auth/removeProduct?id=<%= product.getId() %>" role="button">Delete</a></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>
	</body>
</html>