package br.com.prova.controller;

import java.io.IOException;

import br.com.prova.dao.MotoristaDao;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		name = "desativarMotorista",
		urlPatterns = "/pages/desativarMotorista"
)
public class DesativarMotoristaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		MotoristaDao motoristaDao = new MotoristaDao();
		
		long id = Integer.valueOf(httpServletRequest.getParameter("index"));
		
		motoristaDao.desativarAtivarMotorista(motoristaDao.findById(id));
		
		httpServletResponse.sendRedirect("../pages/ListarMotorista.jsp");
	}
}
