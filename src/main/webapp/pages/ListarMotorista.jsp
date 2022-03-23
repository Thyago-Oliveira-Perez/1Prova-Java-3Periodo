<%@page import="br.com.prova.dao.MotoristaDao"%>
<%@page import="br.com.prova.model.Motorista"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Lista de Motoristas</title>
		<link rel="stylesheet" href="../styles/listarMotorista.styles.css">
	</head>
	<body>
		
		<div class="container">
			<h1> Lista de Motoristas </h1>					
			<div class="campo_botoes">
				<div class="botoes">
					<a href="../pages/Menu.jsp">Menu</a>
				</div>
				<div class="botoes">
					<a href="../pages/CadastrarMotorista.jsp"> Cadastrar Motorista</a>
				</div>
			</div>
				<table class="tabela" border="1">
					<tr >
						<th>ID</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>CNH</th>
						<th>Telefone</th>
						<th>Data de Nascimento</th>
						<th>CEEP</th>
	     				<th>Ativo</th>
						<th>Observação</th>
						<th>Opcao</th>
					</tr>		
				<% MotoristaDao motoristaDao = new MotoristaDao(); %>
				<% List<Motorista> motoristas = motoristaDao.findAll(); %>		
				<% for (int i = 0; i < motoristas.size(); i++) { %>			
					<tr>
						<td> <%= motoristas.get(i).getId() %> </td>
						<td> <%= motoristas.get(i).getNome() %> </td>
						<td> <%= motoristas.get(i).getCpf() %> </td>
						<td> <%= motoristas.get(i).getCnh() %> </td>
						<td> <%= motoristas.get(i).getTelefone() %> </td>
						<td> <%= motoristas.get(i).getDataNascimento() %> </td>
						<td> <%= motoristas.get(i).getEndereco().getCep() %> </td>
						<td> <%= motoristas.get(i).getIsAtivo() %> </td>
						<td> <%= motoristas.get(i).getObservacao() %> </td>								
						<td >
							<div class="campo_botoes">
				        		<form action="editarMotorista" method="post">
									<input type="hidden" name="index" value="<%= motoristas.get(i).getId() %>">
									<input type="submit" value="Editar" class="botao_submit">
								</form>								        
								<form action="desativarMotorista" method="post">
									<input type="hidden" name="index" value="<%= motoristas.get(i).getId() %>">
									<input type="submit" value="Ativar/Desativar" class="botao_submit">
								</form>
		        			</div>										    
						</th>
					</tr>				
				<% } %>
			</table>
		</div>	
	</body>
</html>