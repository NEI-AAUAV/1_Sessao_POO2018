
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
public class Professor {
    
    private double[][] notas = new double[16][3];
    private int posicao = 0;
    
    public void add(double nota_t, double nota_p){
        
        if (isFull()) {
            System.out.println("Já foram adicionadas 16 notas!");
            return;
        }
        
        if (nota_t < 7 || nota_p < 7) {
            double[] temp = { nota_t, nota_p, 66};
            notas[posicao] = temp;
        }else{
            double[] temp = { nota_t, nota_p, nota_t * 0.4 + nota_p * 0.6};
            notas[posicao] = temp;
        }
        posicao++;

    }
    
    public boolean isFull(){
        if (posicao == notas.length) {
            return true;
        }
        return false;
    }
    
    public void printTable(){
        System.out.printf("| %-6s | %-6s | %-6s |\n", "NotaT", "NotaP", "Pauta");
        for (int i= 0; i < posicao; i++) {
            System.out.printf("| %-6.1f | %-6.1f | %-6.0f |\n", notas[i][0], notas[i][1], notas[i][2]);
        }
    }
}
