package edu.es.eoi;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.IOUtils;

import edu.es.eoi.entity.User;
import edu.es.eoi.service.LoginService;
import edu.es.eoi.service.LoginServiceImpl;

public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fichero = req.getParameter("filename");

//		if (fichero.equals("usuarios.xlsx")) {
//			File file = new File("C://Users/jjimerod/Desktop/usuarios.xlsx");
//			resp.setContentType("text/plain");
//			resp.setHeader("Content-disposition", "attachment; filename=usuarios.xlsx");
//				
//		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		LoginService service = new LoginServiceImpl();
		User user = null;
		PrintWriter out = resp.getWriter();

		String usuario = req.getParameter("user");
		String pw = req.getParameter("password");

		try {
			user = service.login(usuario, pw);

			if (user == null) {
				out.println("usuario no encontrado o password no correcto");
				resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			} else {
				out.println("El usuario es correcto, hola: Mr./Ms. " + user.getSurname());
				resp.setStatus(HttpServletResponse.SC_OK);
			}

		} catch (Exception e) {
			out.println("Ha ocurrido un error");
			resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
	}

}
