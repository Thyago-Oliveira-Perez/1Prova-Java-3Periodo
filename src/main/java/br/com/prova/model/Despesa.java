package br.com.prova.model;

public class Despesa {

	private Long id;
	private String descricao;
	private TiposDespesas tiposDespesas;
	
	public Despesa() {
	}

	public Despesa(Long id, String descricao, TiposDespesas tiposDespesas) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.tiposDespesas = tiposDespesas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TiposDespesas getTiposDespesas() {
		return tiposDespesas;
	}

	public void setTiposDespesas(TiposDespesas tiposDespesas) {
		this.tiposDespesas = tiposDespesas;
	}

	@Override
	public String toString() {
		return "Despesa [id=" + id + ", descricao=" + descricao + ", tiposDespesas=" + tiposDespesas + "]";
	}
	
	
}
