

import java.util.Scanner;

/**
 *
 * @author Rafael Teixeira 84746 LEI
 */

public class Main {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in); //Inicializa o objeto responsável por pedir ao utilizador informação pelo teclado
        String jogar = "sim"; //Vai guardar se é para jogar ou não
        int adivinha;  //Variável que guarda o valor obtido do utilizador
        int tentativas; //Guarda o número de tentativas feitas
        int num ;       //Número a ser adivinhado          
                                                
        while(jogar.equals("sim")){                     //Verifica se é ou não para jogar
            
           num = Math.round((float)Math.random()*100 ); //(o "(float)" não é importante, faz uma conversão)
                                                        // é gerado aleatóriamente com o Math.rand() -> que dá valores entre 0 e 1
                                                        //Depois é múltiplicado por 100 e fica entre 0 e 100 mas com virgula
                                                        // Com o round fica um inteiro sem vírgula
                                                
            adivinha = -1;  //No inicio de cada jogo fica com o valor -1 (para identificar uma opção que não é solução)
            tentativas = 0; //O contador é reiniciado para cada jogo desta forma
            
            while(adivinha != num){                             //Verifica se foi encontrada a solução
                if(tentativas != 0 && adivinha < num)           //Vê se já fez alguma tentativa e se já, vê se o a adivinha é menor
                    System.out.println("Demasiado baixo");      //Que o número e imprime a mensagem caso seja
                
                else if(tentativas != 0 && adivinha > num)      //Vê se já fez alguma tentativa e se já, vê se o a adivinha é maior
                    System.out.println("Demasiado alto");       //Que o número e imprime a mensagem caso seja
                
                System.out.print("Escolha um número: ");        //Pede um número novo ao utilizador
                adivinha = sc.nextInt();
                tentativas ++;                                  //Incrementa o númerod e tentativas
            }

            System.out.println("Adivinhou em " + tentativas + " tentativas");   //Imprime "Adivinhou em valor tentativas"
            System.out.print("Novo jogo (sim/nao)? ");          //Pergunta se quer um novo jogo
            jogar = sc.next();
        }
        
    }
}
