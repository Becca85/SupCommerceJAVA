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
@WebServlet("/testjpa")
public class TestJpaServlet extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("My-PU");
		EntityManager em = emf.createEntityManager();	
		EntityTransaction t = em.getTransaction();
		
		EntityTest entityTest = new EntityTest("This is a test value");
		
		try {
			t.begin();
			// manipulation de la bdd
			em.persist(entityTest);
			t.commit();
			
		}
		finally {
			if (t.isActive()) {
				t.rollback();
		}
			em.close();
			emf.close();
		}
	}
}

