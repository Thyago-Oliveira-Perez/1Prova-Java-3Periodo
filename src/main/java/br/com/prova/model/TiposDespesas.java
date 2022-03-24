package br.com.prova.model;

public class TiposDespesas {

	private long id;
	private String tipoDespesas;
	private Boolean isAtivo;
	
	public TiposDespesas() {
	}
	
	public TiposDespesas(long id, String tipoDespesas, Boolean isAtivo) {
		super();
		this.id = id;
		this.tipoDespesas = tipoDespesas;
		this.isAtivo = isAtivo;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipoDespesas() {
		return tipoDespesas;
	}
	public void setTipoDespesas(String tipoDespesas) {
		this.tipoDespesas = tipoDespesas;
	}
	public Boolean getIsAtivo() {
		return isAtivo;
	}
	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	@Override
	public String toString() {
		return "TiposDespesas [id=" + id + ", tipoDespesas=" + tipoDespesas + ", isAtivo=" + isAtivo + "]";
	}
}
