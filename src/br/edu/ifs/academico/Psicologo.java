package br.edu.ifs.academico;

public class Psicologo extends Pessoa {
	public Psicologo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
		return "Psicologo [numeroCRP=" + numeroCRP + ", classe=" + classe + ", especialidade=" + especialidade
				+ ", getName()=" + getName() + ", getLocalNascimento()=" + getLocalNascimento()
				+ ", getDataNascimento()=" + getDataNascimento() + ", getSexo()=" + getSexo() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
