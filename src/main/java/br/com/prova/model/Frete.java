package br.com.prova.model;

import java.util.Date;

import br.com.prova.enums.EstadoFrete;

public class Frete {

	private long id;
	private Motorista motorista;
	private float PorcentMotorista;
	private Endereco enderecoPartida;
	private Endereco enderecoDestino;
	private Caminhao caminhao;
	private float quilometragemInicial;
	private float quilometragemFinal;
	private String produtoTransportado;
	private float pesoInicial;
	private float pesoFinal;
	private float pesoTotalTransportado;
	private Date dataInicio;
	private Date dataFinal;
	private float precoPorTonelada;
	private float totalBrutoRecebido;
	private Despesa despesa;
	private EstadoFrete estadoFrete;
	private String observacao;
	
	public Frete() {
	}

	public Frete(long id, Motorista motorista, float porcentMotorista, Endereco enderecoPartida,
			Endereco enderecoDestino, Caminhao caminhao, float quilometragemInicial, float quilometragemFinal,
			String produtoTransportado, float pesoInicial, float pesoFinal, float pesoTotalTransportado,
			Date dataInicio, Date dataFinal, float precoPorTonelada, float totalBrutoRecebido, Despesa despesa,
			EstadoFrete estadoFrete, String observacao) {
		super();
		this.id = id;
		this.motorista = motorista;
		PorcentMotorista = porcentMotorista;
		this.enderecoPartida = enderecoPartida;
		this.enderecoDestino = enderecoDestino;
		this.caminhao = caminhao;
		this.quilometragemInicial = quilometragemInicial;
		this.quilometragemFinal = quilometragemFinal;
		this.produtoTransportado = produtoTransportado;
		this.pesoInicial = pesoInicial;
		this.pesoFinal = pesoFinal;
		this.pesoTotalTransportado = pesoTotalTransportado;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.precoPorTonelada = precoPorTonelada;
		this.totalBrutoRecebido = totalBrutoRecebido;
		this.despesa = despesa;
		this.estadoFrete = estadoFrete;
		this.observacao = observacao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public float getPorcentMotorista() {
		return PorcentMotorista;
	}

	public void setPorcentMotorista(float porcentMotorista) {
		PorcentMotorista = porcentMotorista;
	}

	public Endereco getEnderecoPartida() {
		return enderecoPartida;
	}

	public void setEnderecoPartida(Endereco enderecoPartida) {
		this.enderecoPartida = enderecoPartida;
	}

	public Endereco getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(Endereco enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	public Caminhao getCaminhao() {
		return caminhao;
	}

	public void setCaminhao(Caminhao caminhao) {
		this.caminhao = caminhao;
	}

	public float getQuilometragemInicial() {
		return quilometragemInicial;
	}

	public void setQuilometragemInicial(float quilometragemInicial) {
		this.quilometragemInicial = quilometragemInicial;
	}

	public float getQuilometragemFinal() {
		return quilometragemFinal;
	}

	public void setQuilometragemFinal(float quilometragemFinal) {
		this.quilometragemFinal = quilometragemFinal;
	}

	public String getProdutoTransportado() {
		return produtoTransportado;
	}

	public void setProdutoTransportado(String produtoTransportado) {
		this.produtoTransportado = produtoTransportado;
	}

	public float getPesoInicial() {
		return pesoInicial;
	}

	public void setPesoInicial(float pesoInicial) {
		this.pesoInicial = pesoInicial;
	}

	public float getPesoFinal() {
		return pesoFinal;
	}

	public void setPesoFinal(float pesoFinal) {
		this.pesoFinal = pesoFinal;
	}

	public float getPesoTotalTransportado() {
		return pesoTotalTransportado;
	}

	public void setPesoTotalTransportado(float pesoTotalTransportado) {
		this.pesoTotalTransportado = pesoTotalTransportado;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public float getPrecoPorTonelada() {
		return precoPorTonelada;
	}

	public void setPrecoPorTonelada(float precoPorTonelada) {
		this.precoPorTonelada = precoPorTonelada;
	}

	public float getTotalBrutoRecebido() {
		return totalBrutoRecebido;
	}

	public void setTotalBrutoRecebido(float totalBrutoRecebido) {
		this.totalBrutoRecebido = totalBrutoRecebido;
	}

	public Despesa getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}

	public EstadoFrete getEstadoFrete() {
		return estadoFrete;
	}

	public void setEstadoFrete(EstadoFrete estadoFrete) {
		this.estadoFrete = estadoFrete;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "Frete [id=" + id + ", motorista=" + motorista + ", PorcentMotorista=" + PorcentMotorista
				+ ", enderecoPartida=" + enderecoPartida + ", enderecoDestino=" + enderecoDestino + ", caminhao="
				+ caminhao + ", quilometragemInicial=" + quilometragemInicial + ", quilometragemFinal="
				+ quilometragemFinal + ", produtoTransportado=" + produtoTransportado + ", pesoInicial=" + pesoInicial
				+ ", pesoFinal=" + pesoFinal + ", pesoTotalTransportado=" + pesoTotalTransportado + ", dataInicio="
				+ dataInicio + ", dataFinal=" + dataFinal + ", precoPorTonelada=" + precoPorTonelada
				+ ", totalBrutoRecebido=" + totalBrutoRecebido + ", despesa=" + despesa + ", estadoFrete=" + estadoFrete
				+ ", observacao=" + observacao + "]";
	}
	
}
