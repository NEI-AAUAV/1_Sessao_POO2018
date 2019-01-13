/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dn
 */
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Utilizador aluno;
		Livro livro;
		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		while (true) {
			System.out.println("\nMENU\n1 - inscrever aluno\n2 - remover aluno\n3 - imprimir lista de utilizadores\n4 - registar um novo livro\n5 - imprimir lista de livros\n6 - emprestar\n7 - devolver\n8 - verificar disponibilidade\n9 - sair");
			System.out.print("\nOpcao: ");
			String resposta = sc.nextLine();
			if (resposta.equals("1")) {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("N Mec: ");
				String nmec = sc.nextLine();
				System.out.print("Curso: ");
				String curso= sc.nextLine();
				aluno = new Utilizador(nome, Integer.parseInt(nmec), curso);
				biblioteca.addAluno(aluno);
			}
			if(resposta.equals("2")){
				System.out.print("NMec a remover: ");
				String nMecRemover = sc.nextLine();
				biblioteca.removeAluno(nMecRemover);
			}
			if (resposta.equals("3")) {
				biblioteca.printAluno();
			}
			if (resposta.equals("4")) {
				System.out.print("Id: ");
				String id= sc.nextLine();
				System.out.print("Titulo: ");
				String titulo= sc.nextLine();
				System.out.print("Emprestimo (condicional/normal): ");
				String tipo_emprestimo= sc.nextLine();
				livro = new Livro(Integer.parseInt(id), titulo, tipo_emprestimo);
				biblioteca.addBook(livro);
			}
			if (resposta.equals("5")) {
				biblioteca.printBook();
			}
			if (resposta.equals("6")){
				System.out.print("N Mec: ");
				String nmec = sc.nextLine();
				System.out.print("Id: ");
				String id= sc.nextLine();
				biblioteca.emprestar(nmec, id);
			}
			if(resposta.equals("7")){
				System.out.print("N Mec: ");
				String nmec = sc.nextLine();
				System.out.print("Id: ");
				String id= sc.nextLine();
				biblioteca.devolver(nmec, id);
			}
			if(resposta.equals("8")){
				System.out.print("Id: ");
				String id= sc.nextLine();
				biblioteca.verificar(id);
			}
			if(resposta.equals("9")){
				sc.close();
				break;
			}
			else{
			}
		}
	}

}
