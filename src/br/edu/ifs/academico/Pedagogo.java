package br.edu.ifs.academico;

public class Pedagogo extends Pessoa {
	public Pedagogo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private int anoFormacao;
	private String experiencia;

	public int getAnoFormacao() {
		return anoFormacao;
	}

	public void setAnoFormacao(int anoFormacao) {
		this.anoFormacao = anoFormacao;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Pedagogo [anoFormacao=" + anoFormacao + ", experiencia=" + experiencia + ", getName()=" + getName()
				+ ", getLocalNascimento()=" + getLocalNascimento() + ", getDataNascimento()=" + getDataNascimento()
				+ ", getSexo()=" + getSexo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

}
