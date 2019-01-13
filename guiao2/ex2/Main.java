
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rafael Teixeira 84746 LEI
 */
public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //Inicializa o objeto responsável por pedir ao utilizador informação pelo teclado
        int  max = 0; //Variável que guarda o valor obtido do utilizador
            
        try{                            //Vai tentar executar o código que está dentro das {}
            System.out.print("Número de Começo: ");
            max = sc.nextInt();            //Pede ao utilizador um valor (Tem de ser numérico, 
                                       //se não for faz o código dentro do catch)  
        }
        catch(InputMismatchException e){    //Se o código anterior não for executado ele vai executar o que está aqui dentro
            e.printStackTrace();
            System.exit(1);
        }
        
        for(int i = max; max >= 0; max --)   //Ciclo que começa no valor introduzido pelo utilizador e acaba em zero
            System.out.println(max);        //Imprime o valor do max que vai sendo decrementado
    
    }
    
}
