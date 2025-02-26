package br.edu.ifs.academico;

public class Aluno extends Pessoa {
	
	public Aluno(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private double nota1;
	private double nota2;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Aluno [nota1=" + nota1 + ", nota2=" + nota2 + ", getName()=" + getName() + ", getLocalNascimento()="
				+ getLocalNascimento() + ", getDataNascimento()=" + getDataNascimento() + ", getSexo()=" + getSexo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
