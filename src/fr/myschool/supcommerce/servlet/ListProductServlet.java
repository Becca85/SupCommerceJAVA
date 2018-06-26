package fr.myschool.supcommerce.servlet;

import fr.myschool.supcommerce.dao.ProductDao;
import fr.myschool.supcommerce.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns="/listProduct")
public class ListProductServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    	List<Product> products = ProductDao.getAllProducts();

        req.setAttribute("products", products);
        RequestDispatcher rd = req.getRequestDispatcher("/listProduct.jsp");
        rd.forward(req, res);
    }
}