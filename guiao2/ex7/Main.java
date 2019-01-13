/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        Double array[][] = new Double[16][2]; //Um array com 16 posições e cada uma delas tem duas posições para as notas P e T
        int nAlunos = 16;
        for(int i = 0; i < nAlunos; i++){   //Faz 1 vez por cada aluno
            System.out.println("Aluno " + (i +1));
            try{                            //Vai tentar executar o código dentro das {}
                System.out.print("Nota da Prática: ");
                notaP = sc.nextDouble();            //Pede ao utilizador um valor (Tem de ser numérico, 
                                                    //se não for faz o código dentro do catch)  
                                                    
                array[i][0] = notaP;    //Guarda a nota prática do aluno i
                
                System.out.print("Nota da Teórica: ");
                notaT = sc.nextDouble();            //Mesmo que em cima
                
                array[i][1] = notaT;    //Guarda a nota da teórica do aluno i
            }

            catch(InputMismatchException e){    //Se o código anterior não for executado ele vai executar o que está aqui dentro
                e.printStackTrace();
                System.exit(1);
            }
        }
        System.out.println("NotaT\tNotaP\tPauta");
        for(int i = 0; i < nAlunos; i++){   //Faz este ciclo para cada aluno
            if(array[i][0] < 7 || array[i][1] < 7)  //Verifica se uma das notas dádas são inferiores a 7
                    System.out.println(array[i][1]+"\t"+array[i][0]+"\t66");   //Se forem imprime 66

            else{                       //Se não chumbar por nota minima
                System.out.println(array[i][1]+"\t"+array[i][0]+"\t"+ Math.round(array[i][0]*0.6 + array[i][1]*0.4)); //É feito o calculo (notaP*0.6 + notaT*0.4)
                                                                        //Depois é arredondado ( Math.round() )
                                                                        //Depois imprime ( System.out.println() )
            }
        }
    }
    
}
