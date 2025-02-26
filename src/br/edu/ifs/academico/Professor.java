package br.edu.ifs.academico;

public class Professor extends Pessoa {
	public Professor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	@Override
	public String toString() {
		return "Professor [formacao=" + formacao + ", getName()=" + getName() + ", getLocalNascimento()="
				+ getLocalNascimento() + ", getDataNascimento()=" + getDataNascimento() + ", getSexo()=" + getSexo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
