

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rafael Teixeira 84746 LEI
 */
public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //Inicializa o objeto responsável por pedir ao utilizador informação pelo teclado
        int  num = -1; //Variável que guarda o valor obtido do utilizador

        while(num < 2){  //Faz o que está cá dentro até ser inserido um número válido
        
            try{         //Vai tentar executar o código que está dentro das {}
                System.out.print("Número a Testar: ");
                num = sc.nextInt();   
            }
            catch(InputMismatchException e){    //Se o código anterior não for executado ele vai executar o que está aqui dentro
            }                                   //Impede que o programa pare por causa do erro que se deu no try
        }
        
        for(int i = 2; i < num; i++)    //Vai percorrer todos os números pertencentes ao conjunto ]1,num[
            if(num%i == 0){             //Verifica se o resto da divisão é zero
                                        //Se for isto significa que o num é divísivel por um número que não é ele próprio
                                        //nem 1, logo viola o príncipio de ser primo ou não
                System.out.println("Não é primo");  //Imprime o resultado a dizer que não é primo
                System.exit(0);     //Termina o programa
            }
        System.out.println("O número dado é primo");    //Se o programa percorrer o for sem terminar
                                                        //Significa que o número só é divísivel por ele mesmo e por 1 logo é primo
    }
}
