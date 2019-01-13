/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dn
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c1 = new Circulo(1, "Azul", new Ponto(3, 4));
        Circulo c2 = new Circulo(1, "Verde", 3, 6.01);
        Circulo c3 = new Circulo(1, "Azul", 3, 4);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.print("Entre c1 e c2: ");
        System.out.println((c1.intersecao(c2)) ? "Existe interseção!" : "Não existe interseção");
        System.out.print("Entre c1 e c3: ");
        System.out.println((c1.intersecao(c3)) ? "Existe interseção!" : "Não existe interseção");
        System.out.print("Entre c1 e c2: ");
        System.out.println(c1.equals(c2) ? "Iguais" : "Diferentes");
        System.out.print("Entre c1 e c3: ");
        System.out.println(c1.equals(c3) ? "Iguais" : "Diferentes");
    }

}
