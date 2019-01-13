
import java.util.Scanner;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author dn
 */

public class MainClass{
    public static void main(String[] args) {
        String opcao;
        Scanner sc;
        Professor pf = new Professor();
        sc = new Scanner(System.in);
        while (true) {
            
            System.out.println("\n\nMENU\n0-Sair\n1-Adicionar nota\n2-Imprimir pauta");
            System.out.print("Opção: ");
            opcao = sc.nextLine();
            
            if (Integer.parseInt(opcao) == 0) {
                break;
            }
            else if (Integer.parseInt(opcao) == 1 ) {
                
                System.out.print("Nota Teorica: ");
                String nota_t = sc.nextLine();
                
                System.out.print("Nota Pratica: ");
                String nota_p = sc.nextLine();
                
                pf.add(Double.parseDouble(nota_t), Double.parseDouble(nota_p));
            }
            else if (Integer.parseInt(opcao) == 2) {
                pf.printTable();
            }else{
                System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
