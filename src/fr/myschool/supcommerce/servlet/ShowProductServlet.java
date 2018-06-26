package fr.myschool.supcommerce.servlet;

import fr.myschool.supcommerce.dao.ProductDao;
import fr.myschool.supcommerce.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/showProduct")
public class ShowProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product product = ProductDao.findProduct(Long.parseLong(req.getParameter("id")));
        req.setAttribute("product", product);
        RequestDispatcher rd = req.getRequestDispatcher("/showProduct.jsp");
        rd.forward(req, resp);
    }
}