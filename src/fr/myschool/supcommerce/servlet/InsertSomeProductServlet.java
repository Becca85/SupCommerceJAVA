package fr.myschool.supcommerce.servlet;

import fr.myschool.supcommerce.dao.ProductDao;
import fr.myschool.supcommerce.model.Product;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(urlPatterns="/auth/basicInsert")
public class InsertSomeProductServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        Product product = new Product();
        product.setId(12L);
        product.setDescription("Description du produit");
        product.setName("Nom du produit");
        product.setPrice(45);
        ProductDao.addProduct(product);
    }
}