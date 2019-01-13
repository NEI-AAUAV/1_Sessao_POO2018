package aula01;
import java.util.Scanner;

public class A01E05 {

	public static void main(String[] args) {
        int time_in_seconds;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o tempo em segundos: ");
        time_in_seconds = sc.nextInt();
        int hours = (int)Math.floor(time_in_seconds / (60*60));
        int minutes = (int)Math.floor((time_in_seconds % (60*60)) / 60);
        int seconds = (int)Math.floor(time_in_seconds % (60*60) % 60);
        System.out.println("Tempo em hh:mm:ss: "+hours+":"+minutes+":"+seconds);
        sc.close();
	}
}
