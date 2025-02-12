package br.edu.ifs.academico;

public class Psicologo extends Pessoa {
	private int numeroCRP;
	private String classe;
	private String especialidade;

	public int getNumeroCRP() {
		return numeroCRP;
	}

	public void setNumeroCRP(int numeroCRP) {
		this.numeroCRP = numeroCRP;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
