package edu.es.eoi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String dinero = req.getParameter("dinero");
		String moneda= req.getParameter("moneda");		
		
				
		PrintWriter out = resp.getWriter();
		out.println("Dinero " +dinero+" "+moneda);

	}

}
