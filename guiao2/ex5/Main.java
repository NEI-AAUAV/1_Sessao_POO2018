
import java.util.Scanner;

/**
 *
 * @author Rafael Teixeira 84746 LEI
 */
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //Inicializa o objeto responsável por pedir ao utilizador informação pelo teclado
        
        int ano = -1; //Variável que guarda o dia
        int mes = -1; //Variável que guarda o mês
        boolean bissexto; //Variável que vai indicar se é bissexto
        
        while(ano < 0){         //Até que seja inserida um ano válido ele pede uma novo
            System.out.print("Indique o ano: ");
            ano = sc.nextInt();
        }
        
        while(mes < 1 || mes > 12){     //Até que seja inserido um mês pede um novo
            System.out.print("Indique o mês: ");
            mes = sc.nextInt();
        }
        
        if((ano%4==0 && ano%100!=0)||(ano%400==0))  //Verifica se é um ano bissexto ou não segundo um algoritmo que encontras
            bissexto =  true;                       //no wikipédia
        else
            bissexto = false;
        
        if(mes == 2){       //se for o mês 2 (fevereiro) faz a distinção entre bissexto e não bissexto
            if(bissexto)
                System.out.println("Mês tem 29 dias");
            else
                System.out.println("Mês tem 28 dias");
        }
        else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) // Vê se são os meses com 31 dias
            System.out.println("Mês tem 31 dias");
        else{           //Sobram apenas meses com 30 dias
            System.out.println("Mês tem 30 dias");
        }        
        
    }
    
}
