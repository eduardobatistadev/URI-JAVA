package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double MEDIA = (A*2 + B*3 + C*5)/10;
		
		System.out.printf("MEDIA = %.1f", MEDIA);
		System.out.println();
		
		
		
		
		sc.close();
		

	}

}
