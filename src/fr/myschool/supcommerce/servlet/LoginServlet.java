package fr.myschool.supcommerce.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.myschool.supcommerce.dao.ProductDao;
import fr.myschool.supcommerce.model.Product;

import java.io.IOException;
import java.util.Random;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/login.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String userName = req.getParameter("userName");
            HttpSession session = req.getSession();
            if (userName != null)
                session.setAttribute("userName", userName);
            resp.sendRedirect("/SupCommerce/listProduct");
        }
}
