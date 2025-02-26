package br.edu.ifs.academico;

public class Reitor extends Professor {
	public Reitor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
		return "Reitor [dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", quantidadeDeVotos=" + quantidadeDeVotos
				+ ", getFormacao()=" + getFormacao() + ", toString()=" + super.toString() + ", getName()=" + getName()
				+ ", getLocalNascimento()=" + getLocalNascimento() + ", getDataNascimento()=" + getDataNascimento()
				+ ", getSexo()=" + getSexo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
