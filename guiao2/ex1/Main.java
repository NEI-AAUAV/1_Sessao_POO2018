

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rafael Teixeira 84746 LEI
 */
public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //Inicializa o objeto responsável por pedir ao utilizador informação pelo teclado
        Double notaP = 0.0, notaT = 0.0; //Variáveis que guardam os valores obtidos do utilizador
        
        try{                            //Vai tentar executar o código dentro das {}
            System.out.print("Nota da Prática: ");
            notaP = sc.nextDouble();            //Pede ao utilizador um valor (Tem de ser numérico, 
                                                //se não for faz o código dentro do catch)  
            System.out.print("Nota da Teórica: ");
            notaT = sc.nextDouble();            //Mesmo que em cima
        }
        
        catch(InputMismatchException e){    //Se o código anterior não for executado ele vai executar o que está aqui dentro
            e.printStackTrace();
            System.exit(1);
        }
        
        if(notaP < 7 || notaT < 7)  //Verifica se uma das notas dádas são inferiores a 7
                System.out.println("66");   //Se forem imprime 66
        
        else{                       //Se não chumbar por nota minima
            System.out.println( Math.round(notaP*0.6 + notaT*0.4)); //É feito o calculo (notaP*0.6 + notaT*0.4)
                                                                    //Depois é arredondado ( Math.round() )
                                                                    //Depois imprime ( System.out.println() )
        }
    }
    
}
