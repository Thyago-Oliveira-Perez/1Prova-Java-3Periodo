package br.com.prova.model;

public class Motorista {

	private Long id;
	private String nome;
	private String cpf;
	private String cnh;
	private String telefone;
	private String dataNascimento;
	private Endereco endereco;
	private Boolean isAtivo;
	private String observacao;
	
	public Motorista() {
		super();
	}
	public Motorista(Long id, String nome, String cpf, String cnh, String telefone, String dataNascimento,
			Endereco endereco, Boolean isAtivo, String observacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cnh = cnh;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.isAtivo = isAtivo;
		this.observacao = observacao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
		return "Motorista [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", cnh=" + cnh + ", telefone=" + telefone
				+ ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + ", isAtivo=" + isAtivo
				+ ", observacao=" + observacao + "]";
	}
}
