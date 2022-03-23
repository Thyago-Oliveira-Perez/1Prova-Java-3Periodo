<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastrar Motorista</title>
		<link rel="stylesheet" href="../styles/cadastrarMotorista.style.css">
	</head>
	<body>
	
		<div style="height: 100%; justify-content: center; display: flex;">
		
			<form action="cadastrarMotorista" method="post" 
					style="width: 300px; 
						border: 1px solid #009a84;
						padding: 15px;
						border-radius: 10px 10px 10px 10px;">
						
				<h1 style="text-align: center; color: #009a84;">Cadastro de Motorista</h1>
				
				<div class="input">
					<label style="color: #009a84">Nome: </label>
					<input type="text" name="nome" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">CPF: </label>
					<input type="text" name="cpf" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">CNH: </label>
					<input type="text" name="cnh" style="width: 100%">
				</div>
						
				<div class="input">
					<label style="color: #009a84">Telefone: </label>
					<input type="text" name="telefone" style="width: 100%">
				</div>
					
				<div class="input">
					<label style="color: #009a84">Data de Nascimento: </label>
					<input type="date" name="dataNascimento" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">CEEP: </label>
					<input type="text" name="ceep" style="width: 100%">
				</div>

				<div class="input">
					<label style="color: #009a84">Rua: </label>
					<input type="text" name="rua" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">Bairro: </label>
					<input type="text" name="bairro" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">Cidade: </label>
					<input type="text" name="cidade" style="width: 100%">
				</div>
				
				<div class="input">
					<label style="color: #009a84">País: </label>
					<input type="text" name="pais" style="width: 100%">
				</div>
								
				<div class="input_observacao" style="display: flex; flex-direction: column; with: 100%; margin-bottom: 20px">
					<label style="color: #009a84">Observação: </label>
					<textarea name="observacao" style="color: black; with: 100%" rows="10"></textarea>
				</div>
				
				<div class="campo_botoes">
					<div class="botoes">
						<a href="../pages/ListarMotorista.jsp">Listar Motoristas</a>
					</div>	
					<div  class="botoes">
						<input type="submit" value="Cadastrar">
					</div>	
				</div>
				
			</form>
		</div>
	
	</body>
</html>