package br.com.prova.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.prova.factory.ConnectionFactory;
import br.com.prova.model.Endereco;


public class EnderecoDao {

    private Connection connection;

    public EnderecoDao() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void createSeq() {
    	
    	String sqlSeq = "create sequence seq_endereco_id;";
    	
    	try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlSeq);
			preparedStatement.execute();
			preparedStatement.close();
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }
    
    public void createTable() {
    	String sqlCreate = "create table endereco(\r\n"
    			+ "	id bigint default nextval('seq_endereco_id'),\r\n"
    			+ "	cep varchar(10) not null,\r\n"
    			+ "	rua varchar(40) not null,\r\n"
    			+ "	bairro varchar(40) not null,\r\n"
    			+ "	cidade varchar(30) not null,\r\n"
    			+ "	pais varchar(20) not null,\r\n"
    			+ "	primary key(id)\r\n"
    			+ ")";
    	
    	try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlCreate);
			preparedStatement.execute();
			preparedStatement.close();
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
	public void add(Endereco endereco) {
		
		String sqlInsert = "insert into endereco (cep, rua, bairro, cidade, pais) values (?, ?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, endereco.getCep());
            preparedStatement.setString(2, endereco.getRua());
            preparedStatement.setString(3, endereco.getBairro());
            preparedStatement.setString(4, endereco.getCidade());
            preparedStatement.setString(5, endereco.getPais());
            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
	}
	
	public long lastUpdate() {
		Endereco endereco = new Endereco();
		
		String lastUpdate = "select * from endereco where id <= id order by id desc limit 1;";
		
		try {
            PreparedStatement preparedStatement = connection.prepareStatement(lastUpdate);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                endereco.setId(resultSet.getLong("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		return endereco.getId();
	}
	
    public Endereco findById(Long id){
        Endereco endereco = new Endereco();

        String sqlSelect = "select * from endereco where id=?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelect);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                endereco.setId(resultSet.getLong("id"));
                endereco.setCep(resultSet.getString("cep"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setBairro(resultSet.getString("bairro"));
                endereco.setCidade(resultSet.getString("cidade"));
                endereco.setPais(resultSet.getString("pais"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return endereco;
    }
	
    public List<Endereco> findAll(Long id){
    	
        List<Endereco> retornoBanco = new ArrayList<>();

        String sqlSelectAll = "select * from endereco;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelectAll);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Endereco endereco = new Endereco();
                endereco.setId(resultSet.getLong("id"));
                endereco.setCep(resultSet.getString("cep"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setBairro(resultSet.getString("bairro"));
                endereco.setCidade(resultSet.getString("cidade"));
                endereco.setPais(resultSet.getString("pais"));
                retornoBanco.add(endereco);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retornoBanco;
    }
    
	public void update(Endereco endereco) {
		
		String sqlInsert = "update endereco set cep = ?, rua = ?, bairro = ?, cidade = ?, pais = ? where id=?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, endereco.getCep());
            preparedStatement.setString(2, endereco.getRua());
            preparedStatement.setString(3, endereco.getBairro());
            preparedStatement.setString(4, endereco.getCidade());
            preparedStatement.setString(5, endereco.getPais());
            preparedStatement.setLong(6, endereco.getId());
            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
	}
    
}
