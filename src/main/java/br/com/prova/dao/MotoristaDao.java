package br.com.prova.dao;
import br.com.prova.factory.ConnectionFactory;
import br.com.prova.model.Motorista;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MotoristaDao {
	
	EnderecoDao enderecoDao = new EnderecoDao();
    private Connection connection;

    public static Motorista motorista = new Motorista();
    
    public MotoristaDao() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    public void createSeq() {
    	String createSeq = "create sequence seq_motorista_id;";
    	
    	PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(createSeq);
			preparedStatement.execute();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public void createTable() {
    	String createTable = "create table motorista (\r\n"
    			+ "	id bigint default nextval('seq_motorista_id'),\r\n"
    			+ "	nome varchar(50) not null,\r\n"
    			+ "	cpf varchar(15) not null,\r\n"
    			+ "	cnh varchar(15) not null,\r\n"
    			+ "	telefone varchar(20) not null,\r\n"
    			+ "	dataNascimento varchar(10) not null,\r\n"
    			+ "	idEndereco bigint not null,\r\n"
    			+ "	estaAtivo boolean not null,\r\n"
    			+ "	observacao varchar(100),\r\n"
    			+ "	primary key(id),\r\n"
    			+ "	constraint fk_endereco\r\n"
    			+ "		foreign key (idEndereco)\r\n"
    			+ "			references endereco(id)\r\n"
    			+ ")";
    	
    	try {
			PreparedStatement preparedStatement = connection.prepareStatement(createTable);
			preparedStatement.execute();
			preparedStatement.close();
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    			
    }
    
	public void add(Motorista motorista){
		enderecoDao.add(motorista.getEndereco());
		
		long idEndereco = enderecoDao.lastUpdate();
		
		String sqlInsert = "insert into motorista (nome, cpf, cnh, telefone, dataNascimento, idEndereco, estaAtivo, observacao) values (?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, motorista.getNome());
            preparedStatement.setString(2, motorista.getCpf());
            preparedStatement.setString(3, motorista.getCnh());
            preparedStatement.setString(4, motorista.getTelefone());
            preparedStatement.setString(5, motorista.getDataNascimento());
            preparedStatement.setLong(6, idEndereco);
            preparedStatement.setBoolean(7, motorista.getIsAtivo());
            preparedStatement.setString(8, motorista.getObservacao());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public List<Motorista> findAll(){
		
		EnderecoDao enderecoDao = new EnderecoDao();
		
		List<Motorista> retornoBanco = new ArrayList<>();
		
		String sqlSelectAll = "select * from motorista;";
		
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelectAll);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Motorista motorista = new Motorista();
                motorista.setId(resultSet.getLong("id"));
                motorista.setNome(resultSet.getString("nome"));
                motorista.setCpf(resultSet.getString("cpf"));
                motorista.setCnh(resultSet.getString("cnh"));
                motorista.setTelefone(resultSet.getString("telefone"));
                motorista.setDataNascimento(resultSet.getString("dataNascimento"));
                motorista.setEndereco(enderecoDao.findById(resultSet.getLong("idEndereco")));
                motorista.setIsAtivo(resultSet.getBoolean("estaAtivo"));
                motorista.setObservacao(resultSet.getString("observacao"));
                retornoBanco.add(motorista);
            }
            return retornoBanco;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retornoBanco;
	}
	
	public Motorista findById(Long id){
		
		EnderecoDao enderecoDao = new EnderecoDao();
		Motorista motorista = new Motorista();
		
		String sqlSelectAll = "select * from motorista where id = ?;";
		
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelectAll);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                motorista.setId(resultSet.getLong("id"));
                motorista.setNome(resultSet.getString("nome"));
                motorista.setCpf(resultSet.getString("cpf"));
                motorista.setCnh(resultSet.getString("cnh"));
                motorista.setTelefone(resultSet.getString("telefone"));
                motorista.setDataNascimento(resultSet.getString("dataNascimento"));
                motorista.setEndereco(enderecoDao.findById(resultSet.getLong("idEndereco")));
                motorista.setIsAtivo(resultSet.getBoolean("estaAtivo"));
                motorista.setObservacao(resultSet.getString("observacao"));
            }
            return motorista;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return motorista;
	}
	
	public void desativarAtivarMotorista(Motorista motorista) {
		
		String sqlSelectAll = "update motorista set estaativo = ? where estaativo = ? and id = ?; ";
		
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelectAll);
            preparedStatement.setBoolean(1, !motorista.getIsAtivo());
            preparedStatement.setBoolean(2, motorista.getIsAtivo());
            preparedStatement.setLong(3, motorista.getId());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void ativarMotorista(Long id) {
		String sqlSelectAll = "update motorista set estaativo = true where estaativo = false and id = ?; ";
		
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelectAll);
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void update(Motorista motorista) {
		
		enderecoDao.update(motorista.getEndereco());
		
		long idEndereco = motorista.getEndereco().getId();
		
		String sqlInsert = "update motorista set nome = ?, cpf = ?, cnh = ?, telefone = ?, dataNascimento = ?, idEndereco = ?, estaAtivo = ?, observacao = ? where id=?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, motorista.getNome());
            preparedStatement.setString(2, motorista.getCpf());
            preparedStatement.setString(3, motorista.getCnh());
            preparedStatement.setString(4, motorista.getTelefone());
            preparedStatement.setString(5, motorista.getDataNascimento());
            preparedStatement.setLong(6, idEndereco);
            preparedStatement.setBoolean(7, motorista.getIsAtivo());
            preparedStatement.setString(8, motorista.getObservacao());
            preparedStatement.setLong(9, motorista.getId());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}

