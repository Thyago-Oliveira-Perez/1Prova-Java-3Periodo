package br.com.prova.model;

import java.util.Date;

class Caminhao {

	private long id;
	private String placa;
	private String modelo;
	private String marca;
	private Date ano;
	private float tara;
	private String cor;
	private Boolean isAtivo;
	private String observacao;
	
	public Caminhao() {
	}

	public Caminhao(long id, String placa, String modelo, String marca, Date ano, float tara, String cor,
			Boolean isAtivo, String observacao) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.tara = tara;
		this.cor = cor;
		this.isAtivo = isAtivo;
		this.observacao = observacao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public float getTara() {
		return tara;
	}

	public void setTara(float tara) {
		this.tara = tara;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "Caminhao [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", ano=" + ano
				+ ", tara=" + tara + ", cor=" + cor + ", isAtivo=" + isAtivo + ", observacao=" + observacao + "]";
	}
	
}
