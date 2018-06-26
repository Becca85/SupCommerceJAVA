package fr.myschool.supcommerce.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.myschool.supcommerce.dao.ProductDao;
import fr.myschool.supcommerce.model.Product;

@WebServlet(urlPatterns="/auth/addProduct")
public class AddProductServlet extends HttpServlet {
	  
	  @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String productName = req.getParameter("ProductName");
	        
	        if (productName != null) {
	        	Product product = new Product();
		        product.setDescription(req.getParameter("ProductDescription"));
		        product.setName( req.getParameter("ProductName"));
		        product.setPrice( Float.parseFloat(req.getParameter("ProductPrice")));
		        ProductDao.addProduct(product);
		        resp.sendRedirect("/SupCommerce/showProduct?id=" +product.getId());
	        }

	        
	    }
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/auth/addProduct.jsp");
		rd.forward(req, resp);
	}
}
