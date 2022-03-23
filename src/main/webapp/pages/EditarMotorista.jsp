<%@page import="br.com.prova.dao.MotoristaDao"%>
<%@page import="br.com.prova.model.Motorista"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Motorista</title>
	</head>
	<body>
	
		<div style="height: 100%; justify-content: center; display: flex;">
		
			<form action="cadastrarMotorista" method="post" 
					style="width: 300px; 
						border: 1px solid #009a84;
						padding: 15px;
						border-radius: 10px 10px 10px 10px;">
						
				<h1 style="text-align: center; color: #009a84;">Editar Motorista </h1>
				
				<% Motorista motorista = MotoristaDao.motorista;%>
				
				<input type="hidden" value="<%= motorista.getId() %>" name="idMotorista" style="width: 100%">
				<input type="hidden" value="<%= motorista.getEndereco().getId() %>" name="idEndereco" style="width: 100%">
				<input type="hidden" value="<%= motorista.getIsAtivo() %>" name="ativo" style="width: 100%">
				
				<div class="input">
					<label style="color: #009a84">Nome: </label>
					<input type="text" value="<%= motorista.getNome() %>" name="nome" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">CPF: </label>
					<input type="text" value="<%= motorista.getCpf() %>" name="cpf" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">CNH: </label>
					<input type="text" value="<%= motorista.getCnh() %>" name="cnh" style="width: 100%">
				</div>
						
				<div class="input">
					<label style="color: #009a84">Telefone: </label>
					<input type="text" value="<%= motorista.getTelefone() %>" name="telefone" style="width: 100%">
				</div>
					
				<div class="input">
					<label style="color: #009a84">Data de Nascimento: </label>
					<input type="date" value="<%= motorista.getDataNascimento() %>" name="dataNascimento" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">CEEP: </label>
					<input type="text" value="<%= motorista.getEndereco().getCep() %>" name="ceep" style="width: 100%">
				</div>

				<div class="input">
					<label style="color: #009a84">Rua: </label>
					<input type="text" value="<%= motorista.getEndereco().getRua() %>" name="rua" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">Bairro: </label>
					<input type="text" value="<%= motorista.getEndereco().getBairro() %>" name="bairro" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">Cidade: </label>
					<input type="text" value="<%= motorista.getEndereco().getCidade() %>" name="cidade" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">País: </label>
					<input type="text" value="<%= motorista.getEndereco().getPais() %>" name="pais" style="width: 100%">
				</div>
								
				<div class="input_observacao" style="display: flex; flex-direction: column; with: 100%; margin-bottom: 20px">
					<label style="color: #009a84">Observação: </label>
					<textarea name="observacao" style="color: black; with: 100%" rows="10"><%= motorista.getObservacao() %></textarea>
				</div>
				
				<div style="width: 100%;">
					<div style="width: 50%; float: left;">
						<a href="../pages/ListarMotorista.jsp">Listar Motoristas</a>	
					</div>
					<div style="width: 50%; float: right;">
						<input type="submit" value="Salvar"
							style="
							    background: #009a84;
							    font-size: 16px;
							    color: white;
							    width: 100%;
							    text-align: center;
							    padding: 8px 10px 8px 10px;
							    text-decoration: auto;
							    border-radius: 10px 10px 10px 10px;
							    margin-top: -10px;">
					</div>	
				</div>
				
			</form>
		</div>
	
	</body>
</html>