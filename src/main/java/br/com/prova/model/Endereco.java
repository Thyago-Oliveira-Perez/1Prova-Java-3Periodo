package br.com.prova.model;

public class Endereco {

	private Long id;
	private String cep;
	private String rua;
	private String bairro;
	private String cidade;
	private String pais;
	
	public Endereco() {
		super();
	}
	
	public Endereco(Long id, String cep, String rua, String bairro, String cidade, String pais) {
		super();
		this.id = id;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.pais = pais;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", cep=" + cep + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", pais=" + pais + "]";
	}

	
}
