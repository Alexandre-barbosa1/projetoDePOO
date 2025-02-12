package br.edu.ifs.academico;

public class Reitor extends Professor {
	private int dataInicio;
	private int dataFim;
	private int quantidadeDeVotos;

	public int getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getDataFim() {
		return dataFim;
	}

	public void setDataFim(int dataFim) {
		this.dataFim = dataFim;
	}

	public int getQuantidadeDeVotos() {
		return quantidadeDeVotos;
	}

	public void setQuantidadeDeVotos(int quantidadeDeVotos) {
		this.quantidadeDeVotos = quantidadeDeVotos;
	}

}
