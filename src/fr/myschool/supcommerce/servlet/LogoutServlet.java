package fr.myschool.supcommerce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.media.jfxmedia.logging.Logger;

@WebServlet(urlPatterns="/logout")
public class LogoutServlet extends HttpServlet {
	

	 	@Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	            req.getSession().removeAttribute("userName");

	    }

	 	
	 	@Override
	 	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 	this.doGet(req, resp);
	 	}
}