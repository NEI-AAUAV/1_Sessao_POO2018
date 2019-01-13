/**
*
* AB - LEI - 2018
* Guiao3 - Exercicio 2
* Sessao de duvidas POO.
*
*/

import java.util.Scanner;

public class Exec2{

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Ler o paragrafo
        System.out.print("Insira o paragrafo:");
        String paragraph = sc.nextLine().trim();

        // Numero de palavras no paragrafo
        System.out.println("O paragrafo tem "+paragraph.split("[,; ]+").length+" palavras");

        // Imprimir cada frase numa linha usando a sintaxe foreach
        String[] sentences = paragraph.split("[.]{3}|[.?!]");
        // Percorrer todas as strings de sentences usando
        // a sintaxe foreach
        for (String s : sentences)
            System.out.println(s);

        sc.close();

	}
}
