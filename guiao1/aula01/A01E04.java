package aula01;
import java.util.Scanner;

public class A01E04 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1, v2;
        System.out.print("Insira a v1: ");
        v1 = sc.nextDouble();
        System.out.print("Insira a v2: ");
        v2 = sc.nextDouble();
        System.out.println("Velocidade média final: "+(2*v1*v2 / (v1+v2)));
        sc.close();

	}
}
