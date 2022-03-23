package br.com.prova.controller;

import java.io.IOException;

import br.com.prova.dao.MotoristaDao;
import br.com.prova.model.Endereco;
import br.com.prova.model.Motorista;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		name = "cadastrarMotorista",
		urlPatterns = "/pages/cadastrarMotorista"
)
public class CadastrarMotoristaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		Motorista motorista = new Motorista();
		MotoristaDao motoristaDao = new MotoristaDao();
		Endereco  endereco = new Endereco(
				Long.parseLong(httpServletRequest.getParameter("idEndereco")),
				httpServletRequest.getParameter("ceep"),
				httpServletRequest.getParameter("rua"),
				httpServletRequest.getParameter("bairro"),
				httpServletRequest.getParameter("cidade"),
				httpServletRequest.getParameter("pais")
				);
		
		if(httpServletRequest.getParameter("idMotorista") != null) {
			motorista.setId(Long.parseLong(httpServletRequest.getParameter("idMotorista")));
		}
		motorista.setNome(httpServletRequest.getParameter("nome"));
		motorista.setCpf(httpServletRequest.getParameter("cpf"));
		motorista.setCnh(httpServletRequest.getParameter("cnh"));
		motorista.setTelefone(httpServletRequest.getParameter("telefone"));
		motorista.setDataNascimento(httpServletRequest.getParameter("dataNascimento"));
		motorista.setEndereco(endereco);
		
		if(httpServletRequest.getParameter("ativo") == null) {
			motorista.setIsAtivo(true);
		}else {
			motorista.setIsAtivo(Boolean.parseBoolean(httpServletRequest.getParameter("ativo")));
		}
		
		
		motorista.setObservacao(httpServletRequest.getParameter("observacao"));
		
		if(motorista.getId() != null) {
			motoristaDao.update(motorista);
		}else {
			motoristaDao.add(motorista);
		}
		
		httpServletResponse.sendRedirect("../pages/ListarMotorista.jsp");
	}
}