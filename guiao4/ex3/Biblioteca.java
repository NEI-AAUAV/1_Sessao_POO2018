/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

import java.util.ArrayList;
import java.util.List;

/**
*
* @author dn
*/
public class Biblioteca {

	private List<Utilizador> listaAluno = new ArrayList<>();
	private List<Livro> listaLivros = new ArrayList<>();
	private List<Livro> livrosDisponiveis = new ArrayList<>();
	private List<String[]> emprestimos = new ArrayList<>();
	private Utilizador aluno = new Utilizador();
	private Livro livro = new Livro();

	public Biblioteca() {
	}

	public void addAluno(Utilizador aluno) {
		boolean existe = false;
		for (int i = 0; i < listaAluno.size(); i++) {
			if(listaAluno.get(i).getNmec() == aluno.getNmec()) {
				existe = true;
			}
		}
		if(!existe) {
			listaAluno.add(aluno);
		}else{
			System.out.println("O aluno já existe!");
		}
	}

	public void removeAluno(String nmec) {
		for (int i = 0; i < listaAluno.size(); i++) {
			if (Integer.parseInt(nmec) == listaAluno.get(i).getNmec()) {
				System.out.println("Aluno " + listaAluno.get(i).getNmec() + " removido");
				listaAluno.remove(i);
			}
		}

		for (int j = 0; j < emprestimos.size(); j++) {
			String[] emprestimo = emprestimos.get(j);
			if (emprestimo[0].equals(nmec)) {
				for (int k = 0; k < listaLivros.size(); k++) {
					livro = listaLivros.get(k);
					if ((""+livro.getId()).equals(emprestimo[1])) {
						livrosDisponiveis.add(livro);
						break;
					}
				}
			}
		}
	}


	public void printAluno() {
		System.out.println("Lista de utilizadores :");
		if(listaAluno.isEmpty()){
			System.out.println("Não existe qualquer utilizador registado");
			return;
		}
		System.out.printf("%-10s| %-6s| %-10s|\n","NOME","N MEC","CURSO");
		System.out.println("-----------------------------");
		for (int i = 0; i < listaAluno.size(); i++) {
			System.out.printf("%-10s| %-6d| %-10s|\n",listaAluno.get(i).getNome(),listaAluno.get(i).getNmec(),listaAluno.get(i).getCurso());
		}
	}

	public void addBook(Livro livro) {
		listaLivros.add(livro);
		livrosDisponiveis.add(livro);
	}

	public void printBook() {
		System.out.println("Livros registados :");
		if(listaLivros.isEmpty()){
			System.out.println("Não existe qualquer livro registado");
			return;
		}
		System.out.printf("%-6s| %-20s| %-12s|\n","ID","TITULO","EMPRESTIMO");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < listaLivros.size(); i++) {
			System.out.printf("%-6d| %-20s| %-12s|\n",listaLivros.get(i).getId(),listaLivros.get(i).getTitulo(),listaLivros.get(i).getTipo_emprestimo());
		}
	}

	public boolean verificacoes (String nmec, String id){
		boolean inscrito = false;
		for (int i = 0; i < listaAluno.size(); i++) {
			if ((""+listaAluno.get(i).getNmec()).equals(nmec)) {
				inscrito = true;
			}
		}
		if (!inscrito) {
			System.out.println("O aluno não está inscrito");
			return false;
		}

		boolean livro_registado = false;
		for (int i = 0; i < listaLivros.size(); i++) {
			if (listaLivros.get(i).getId() == Integer.parseInt(id)) {
				livro_registado = true;
			}
		}
		if (!livro_registado) {
			System.out.println("O livro não foi registado");
			return false;
		}

		return true;
	}

	public void emprestar(String nmec, String id) {

		if (!verificacoes(nmec, id)) {
			return;
		}
		int contagem = 0;
		for (int i = 0; i < emprestimos.size(); i++) {
			String[] emprestimo = emprestimos.get(i);
			if (emprestimo[0].equals(nmec)) {
				contagem++;
			}
		}
		if (contagem == 3) {
			System.out.println("Não pode requisitar. Máximo excedido!");
			return;
		}
		//Se tudo correr bem, então colocar o livro a "NÃO DISPONIVEL"
		for (int j = 0; j < livrosDisponiveis.size(); j++) {
			if (livrosDisponiveis.get(j).getId() == Integer.parseInt(id)) {
				String[] tuplo = { nmec, id };
				emprestimos.add(tuplo);
				livrosDisponiveis.remove(j);
				System.out.println("Livro requisitado");
				return;
			}

		}

		System.out.println("O livro já foi emprestado");
	}

	public void devolver(String nmec, String id) {
		if (!verificacoes(nmec, id)) {
			return;
		}

		int alunos_requisitaram = 0;
		for (int i = 0; i < emprestimos.size(); i++) {
			String[] emprestimo = emprestimos.get(i);
			if (emprestimo[0].equals(nmec)) {
				alunos_requisitaram++;
			}
		}
		if (alunos_requisitaram == 0) {
			System.out.println("O aluno não requisitou livros");
			return;
		}

		int contagem_livros_emprestados = 0;
		for (int i = 0; i < livrosDisponiveis.size(); i++) {
			livro = livrosDisponiveis.get(i);
			if (livro.getId() == Integer.parseInt(id)) {
				contagem_livros_emprestados++;
			}
		}
		if (contagem_livros_emprestados == 1) {
			System.out.println("O livro não foi emprestado");
			return;
		}

		for (int i = 0; i < emprestimos.size(); i++) {
			String[] emprestimo = emprestimos.get(i);
			if (emprestimo[0].equals(nmec) && emprestimo[1].equals(id)) {
				emprestimos.remove(i);
			}
		}
		for (int j = 0; j < listaLivros.size(); j++) {
			livro = listaLivros.get(j);
			if(livro.getId() == Integer.parseInt(id)){
				livrosDisponiveis.add(livro);
				System.out.println("Livro devolvido");
				return;
			}
		}

		System.out.println("O aluno não requisitou esse livro");
	}

	public void verificar(String id) {
		for (int i = 0; i < livrosDisponiveis.size(); i++) {
			livro=livrosDisponiveis.get(i);
			if(livro.getId() == Integer.parseInt(id)){
				System.out.println("O livro está disponível");
				return;
			}
		}
		System.out.println("O livro não está disponível");
	}
}
