/**
*
* AB - LEI - 2018
* Guiao3 - Exercicio 1
* Sessao de duvidas POO.
*
*/

import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {

        // O objeto do tipo scanner e utilizado
        // para ler streams e ficheiros, neste
        // caso usamos o System.in para ler do teclado
        Scanner sc = new Scanner(System.in);

		// Ler a primeira String
        System.out.print("Insira a primeira String: ");
        String string1 = sc.nextLine(); 
		// Ler a segunda String
        System.out.print("Insira a segunda String: ");
        String string2 = sc.nextLine(); 

        // Nos proximos exemplos sao usados varios metodos
        // da classe String que estao descritos na documentacao Java,
		// disponivel no seguinte link:
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        
        // Imprimir numero total de carateres em ambas as String
        System.out.println("Tamanho da string1 [\""+string1+"\"]: "+countCharacters(string1));
        System.out.println("Tamanho da string2 [\""+string2+"\"]: "+countCharacters(string2));

		// Imprimir o ultimo carater da primeira String
		System.out.println("Ultimo caracter da string1: "+lastCharacter(string1));

		// Indicar se as duas Strings sao iguais.
		System.out.println("As strings são iguais: "+equalStrings(string1, string2));
		
		// Indicar se a segunda String acaba com "." (ponto)
		System.out.println("A string2 acaba com \".\": "+endsWithPoint(string2));

		// Indicar se a segunda String so tem minusculas.
		System.out.println("A string2 só tem minúsculas: "+isLowerCase(string2));

		// Converter todos os carateres das Strings para minusculas e imprimir o resultado.
		System.out.println("String1 em minusculas: "+convertToLower(string1));
		System.out.println("String2 em minusculas: "+convertToLower(string2));

		// Substituir todas as ocorrencias de varios espaços seguidos por um unico espaco.
		System.out.println("String1 sem espacos duplicados: "+removeDuplicatedSpaces(string1));
		System.out.println("String2 sem espacos duplicados: "+removeDuplicatedSpaces(string2));

		// Capitalize a primeira letra de cada palavra de ambas as frases;
		System.out.println("String1 capitalizada: "+capitalize(string1));	
		System.out.println("String2 capitalizada: "+capitalize(string2));	

		// Indique se cada String e um palindromo ou não
		System.out.println("String1 e um palindromo: "+isPalindromo(string1));
		System.out.println("String2 e um palindromo: "+isPalindromo(string2));
        
        // E necessario fechar o scanner para evitar problemas.
        sc.close();
	}
	
	// Imprimir numero total de carateres em ambas as String
	public static int countCharacters(String s) {
		return s.length();
	}

	// Imprimir o ultimo carater da primeira String
	public static char lastCharacter(String s) {
		return s.charAt(s.length()-1);
	}

	// Indicar se as duas Strings sao iguais.
	// O operador '==', para tipos primitivos (int, char, double, etc.)
	// compara valores, mas para objetos compara as referencias da memoria,
	// ou seja, lugar da memoria onde estao guardadas.
	public static boolean equalStrings(String s1, String s2) {
		return s1.equals(s2);	
	}

	// Indicar se a segunda String acaba com "." (ponto)
	public static boolean endsWithPoint(String s) {
		return s.endsWith("."); // ou return s.charAt(s.length()-1) == '.'
	}

	// Indicar se a segunda String so tem minusculas.
	// E o mesmo que perguntar se a string com os caracteres todos convertidos 
	// para minusculas e igual a string original.
	public static boolean isLowerCase(String s) {
		return 	s.toLowerCase().equals(s);
	}

	// Converter todos os carateres das Strings para minusculas e imprimir o resultado.
	public static String convertToLower(String s) {
		return s.toLowerCase();
	}

	// Substituir todas as ocorrencias de varios espaços seguidos por um unico espaco.
	public static String removeDuplicatedSpaces(String s) {
		return s.replaceAll("[ ]{2,}", " ");
	}

	// Capitalize a primeira letra de cada palavra de ambas as frases;
	// Primeiro caracter da string s, convertido para maiuscula, +(concatenacao)
	// a string s menos o primeiro caracter.
	public static String capitalize(String s) {
		return Character.toUpperCase(s.charAt(0)) + s.substring(1, s.length());
	}
	
	// *Para o comum dos mortais.
	// Indica se cada String e um palindromo ou não.
	public static boolean isPalindromo(String s) {
		int len = s.length(); // Comprimento da String
        // Verificar se todos os primeiros caracteres(ate ao meio da string) 
        // sao iguais aos ultimos(do meio da string para a frente).
        // Caso o comprimento da string seja impar, o caracter do meio
        // nao e verificado, pois pode ser qualquer um.
		for (int i = 0; i < len/2; i++)
			if (s.charAt(i) != s.charAt(len-i-1))
				return false;
		return true;
	}

	// *Para LEI, MIEC e interessados.
	// Indica se cada String e um palindromo ou não.
	public static boolean isPalindromoV2(String s) {
		return (new StringBuilder(s)).reverse().toString().equals(s);
	}
}
