
import java.util.Scanner;

/**
 *
 * @author Rafael Teixeira 84746 LEI
 */
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //Inicializa o objeto responsável por pedir ao utilizador informação pelo teclado
        Double  num = 0.0; //Variável que guarda o valor obtido do utilizador
        Double storage[] = new Double[10]; //Variável que vai armazenar os valores que o utilizador dá.
        int position = 1;    //guarda a posiçao do array que temos agora
        Double min = 0.0, max = 0.0, avg = 0.0;  //Variáveis que vão guardar o mínimo o máximo e a média respetivamente.
        
        
        System.out.print("Insira um número: "); //Pede o primeiro valor para começar o processo
        num = sc.nextDouble();                  
        storage[0] = num;               //E guarda-o no array
        
        do{             //Executa primeiro o ciclo e depois é que faz a verificação
           
            System.out.print("Insira um número: ");  //Pede um valor
           num = sc.nextDouble();                   //Guarda na variável para esse propósito
           
           if(position != storage.length)           //Verifica se já encheu o espaço todo do array
               storage[position] = num;             //Se não encheu coloca o valor obtido pelo utilizador no array
           
           else{                                    //Se estiver cheio pára o ciclo e segue o programa
                System.out.println("Número de elementos chegou ao máximo");
                break;
           }
           position ++;
           
        }while(!storage[0].equals(num));   //Faz um ciclo enquanto o primeiro valor não for igual ao último valor introduzido
        
        for(int i = 0; i < position; i ++){//percorre todos os elementos das posições ocupadas
            
            if(i == 0 || min > storage[i])  //Vemos se é o primeiro elemento ou se o valor da posição atual é menor que o mínimo
                min = storage[i];           //que temos agora
            
            if(i == 0 || max < storage[i])  //Vemos se é o primeiro elemento ou se o valor da posição atual é maior que o máximo
                max = storage[i];           //que temos agora
            
            avg += storage[i];              //Somamos todos os valores para fazer-mos a média
        }
        
        System.out.println("Mínimo: " + min);  //Imprime o texto "Mínimo: valor"
        System.out.println("Máximo: " + max);  //Imprime o texto "Máximo: valor"
        System.out.println("Média: " + avg/position);   //Imprime o texto "Média: valor"
        System.out.println("Número de números introduzidos: " + position); //Imprime o texto "Número de números introduzidos: valor"
        
    }
}
