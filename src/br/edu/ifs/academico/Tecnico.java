package br.edu.ifs.academico;

public class Tecnico extends Pessoa {
	public Tecnico(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String nivelFormacao;
	private String areaAtuacao;

	public String getNivelFormacao() {
		return nivelFormacao;
	}

	public void setNivelFormacao(String nivelFormacao) {
		this.nivelFormacao = nivelFormacao;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	@Override
	public String toString() {
		return "Tecnico [nivelFormacao=" + nivelFormacao + ", areaAtuacao=" + areaAtuacao + ", getName()=" + getName()
				+ ", getLocalNascimento()=" + getLocalNascimento() + ", getDataNascimento()=" + getDataNascimento()
				+ ", getSexo()=" + getSexo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

}
