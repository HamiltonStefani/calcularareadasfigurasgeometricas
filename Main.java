package nivelamentoareadosgeometricos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double triRet, circ, trap, quadr, retang;
		double pi = 3.14159;
		double result;
		
		System.out.println("digite valor A, B, C");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.println("DIGITE TR^S VALORES COM VIRGULA:");
		triRet = (a*c)/2;
		System.out.printf("ÁREA DO TRIANGULO = %.3f%n",triRet);
		circ = pi * (c * c); 
		System.out.printf("ÁREA DO CIRCULO = %.3f%n", circ);
		trap = ((a + b)/2 )*c;
		System.out.printf("ÁREA DO TRAPÉZIO = %.3f%n", trap);
		quadr = b * b;
		System.out.printf("ÁREA DO QUADRADO = %.3f%n", quadr);
		retang = a * b;
		System.out.printf("ÁREA DO QUADRADO = %.3f%n", retang);
		
		sc.close();
		

	}
}
