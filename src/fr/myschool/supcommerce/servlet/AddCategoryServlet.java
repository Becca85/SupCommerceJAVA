package fr.myschool.supcommerce.servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.myschool.supcommerce.model.EntityTest;

@WebServlet("/auth/addCategory")
public class AddCategoryServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("My-PU");
		
	}
	
	@Override
	public void destroy() {
		EntityManagerFactory emf = 
	}
}