package application;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1002 {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double n = 3.14159;
	double raio;
	
	System.out.println();
	raio = sc.nextDouble();
	double area = n*raio*raio;
	
	System.out.printf("A=%.4f", area);
	System.out.println();
	
	sc.close();
}
}
