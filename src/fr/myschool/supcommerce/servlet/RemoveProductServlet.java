package fr.myschool.supcommerce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.myschool.supcommerce.dao.ProductDao;

@WebServlet(urlPatterns="/auth/removeProduct")
public class RemoveProductServlet extends HttpServlet {

	  @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String id = req.getParameter("id");

	        if (id != null) {
	        	ProductDao.removeProduct(Long.parseLong(id));
	        resp.sendRedirect("/SupCommerce/listProduct");
	    }
	  }
}
