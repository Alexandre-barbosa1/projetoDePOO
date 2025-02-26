package br.edu.ifs.academico;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Pedagogo> pedagogos = new ArrayList<Pedagogo>();
		ArrayList<Psicologo> psicologos = new ArrayList<Psicologo>();
		ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
		ArrayList<Reitor> reitores = new ArrayList<Reitor>();
		Menu menu = new Menu();
		menu.imprimir();
		int opcao = scanner.nextInt();
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				System.out.println("cadastrar aluno");
				System.out.println("nome:");
				String name = scanner.next();
				Aluno aluno = new Aluno(name);
				System.out.println("Data de nascimento");
				String dataNascimento = scanner.next();
				aluno.setDataNascimento(dataNascimento);
				System.out.println("sexo: ");
				char sexo = scanner.next().charAt(0);
				aluno.setSexo(sexo);
				alunos.add(aluno);
				break;
			case 2:
				System.out.println("listar aluno");
					System.out.println(alunos);
				break;
			case 3:
				System.out.println("cadastrar professor");
				System.out.println("nome:");
				name = scanner.next();
				Professor professor = new Professor(name);
				System.out.println("Data de nascimento");
				dataNascimento = scanner.next();
				professor.setDataNascimento(dataNascimento);
				System.out.println("sexo: ");
				sexo = scanner.next().charAt(0);
				professor.setSexo(sexo);
				professores.add(professor);
				break;
			case 4:
				System.out.println("listar professor");
				System.out.println(professores);
				break;
			case 5:
				System.out.println("cadastrar pedagogo");
				System.out.println("nome:");
				name = scanner.next();
				Pedagogo pedagogo = new Pedagogo(name);
				System.out.println("Data de nascimento");
				dataNascimento = scanner.next();
				pedagogo.setDataNascimento(dataNascimento);
				System.out.println("sexo: ");
				sexo = scanner.next().charAt(0);
				pedagogo.setSexo(sexo);
				pedagogos.add(pedagogo);
				break;
			case 6:
				System.out.println("listar pedagogo");
				System.out.println(pedagogos);
				break;
			case 7:
				System.out.println("cadastrar psicologo");
				System.out.println("nome:");
				name = scanner.next();
				Psicologo psicologo = new Psicologo(name);
				System.out.println("Data de nascimento");
				dataNascimento = scanner.next();
				psicologo.setDataNascimento(dataNascimento);
				System.out.println("sexo: ");
				sexo = scanner.next().charAt(0);
				psicologo.setSexo(sexo);
				psicologos.add(psicologo);
				break;
			case 8:
				System.out.println("listar psicologo");
				System.out.println(psicologos);
				break;
			case 9:
				System.out.println("cadastrar tecnico");
				System.out.println("nome:");
				name = scanner.next();
				Tecnico tecnico = new Tecnico(name);
				System.out.println("Data de nascimento");
				dataNascimento = scanner.next();
				tecnico.setDataNascimento(dataNascimento);
				System.out.println("sexo: ");
				sexo = scanner.next().charAt(0);
				tecnico.setSexo(sexo);
				tecnicos.add(tecnico);
				break;
			case 10:
				System.out.println("listar tecnico");
				System.out.println(tecnicos);
				break;
			case 11:
				System.out.println("cadastrar reitor");
				System.out.println("nome:");
				name = scanner.next();
				Reitor reitor = new Reitor(name);
				System.out.println("Data de nascimento");
				dataNascimento = scanner.next();
				reitor.setDataNascimento(dataNascimento);
				System.out.println("sexo: ");
				sexo = scanner.next().charAt(0);
				reitor.setSexo(sexo);
				reitores.add(reitor);
				break;
			case 12:
				System.out.println("listar reitor");
				System.out.println(reitores);
				break;

			}
			System.out.println();
			menu.imprimir();
			opcao = scanner.nextInt();
		}

		scanner.close();

	}

}
