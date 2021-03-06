package fr.myschool.supcommerce.servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.myschool.supcommerce.entity.Category;
import fr.myschool.supcommerce.model.EntityTest;

@WebServlet("/auth/addCategory")
public class AddCategoryServlet extends HttpServlet {
	EntityManagerFactory emf;
	
	@Override
	public void init() throws ServletException {
		emf = Persistence.createEntityManagerFactory("My-PU");
	}
	
	@Override
	public void destroy() {
		emf.close();
	}
	

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        try {
            t.begin();

            Category category = new Category();
            category.setName(req.getParameter("nameCategory"));
            em.persist(category);
            em.flush();
            t.commit();

        } finally {
            if (t.isActive()) t.rollback();
            em.close();
            this.doGet(req, resp);
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/auth/addCategory.jsp");
        rd.forward(req, resp);

    }
}