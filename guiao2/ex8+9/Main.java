/**
*
* AB - LEI - 2018
* Guiao2 - Exercicio 8/9
* Sessao de duvidas POO.
*
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ler o byte do teclado
        System.out.print("Insira o byte: ");
        byte a = sc.nextByte();
        sc.close();
        // Imprimir o numero em binario
        System.out.println("Numero "+a+" em binario: "+byteInBinary(a));
        // Imprimir o numero de bits a '1'
        System.out.println("Numero de bits a '1' do numero "+a+": "+countBits(a));
    }

    public static String byteInBinary(byte a) {
        StringBuilder binaryString = new StringBuilder();
        // Para cada bit utilizar o AND logico
        // para saber se p bit esta a 1 ou a 0
        for (int i = 7; i >= 0; i--) {
            if (((a >> i) & 1) == 1)
                binaryString.append("1");
            else
                binaryString.append("0");
        }
        return binaryString.toString();
    }

    // Contar o numero de bits do byte a
    public static int countBits(byte a) {
        // Guarda o numero de bits a '1'
        int count = 0;
        // Para cada bit utilizar o AND logico
        // para saber se p bit esta a 1 ou a 0
        for (int i = 7; i >= 0; i--)
            if (((a >> i) & 1) == 1)
                count++;
        return count;
    }
}

