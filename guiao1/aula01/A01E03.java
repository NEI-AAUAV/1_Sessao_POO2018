package aula01;
import java.util.Scanner;

public class A01E03 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double graus_celsius;
        System.out.print("Insira os graus em Célsius: ");
        graus_celsius = sc.nextDouble();
        System.out.println("Os graus em Farenheit é "+(1.8*graus_celsius + 32));
        sc.close();
	}
}
