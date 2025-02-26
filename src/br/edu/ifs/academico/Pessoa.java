package br.edu.ifs.academico;

public class Pessoa {
	
	
	public Pessoa(String name) {
		super();
		this.name = name;
	}

	private String name;
	private String localNascimento;
	private String dataNascimento;
	private char sexo;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocalNascimento() {
		return localNascimento;
	}

	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if (sexo == 'M' || sexo == 'F' || sexo == 'O') {
			this.sexo = sexo;
		} else {
			this.sexo = 'O';
			System.out.println("Apenas M ou F ou O");
		}

	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", localNascimento=" + localNascimento + ", dataNascimento=" + dataNascimento
				+ ", sexo=" + sexo + "]";
	}
	
}
