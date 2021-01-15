package edu.es.eoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.es.eoi.entity.User;
import edu.es.eoi.service.LoginService;
import edu.es.eoi.service.LoginServiceImpl;

public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fichero = req.getParameter("filename");

		if (null!=fichero&&fichero.equals("prueba.txt")) {

			File file = new File("C://Users/jjimerod/Desktop/prueba.txt");
			FileInputStream stream = new FileInputStream(file);

			resp.setContentType("text/plain");
			resp.setContentLength((int) file.length());

			String headerKey = "Content-Disposition";
			String headerValue = String.format("attachment; filename=\"%s\"", file.getName());
			resp.setHeader(headerKey, headerValue);

			OutputStream outStream = resp.getOutputStream();

			byte[] buffer = new byte[(int) file.length()];
			int bytesRead = -1;

			while ((bytesRead = stream.read(buffer)) != -1) {
				outStream.write(buffer, 0, bytesRead);
			}

			stream.close();
			outStream.close();

		}

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
