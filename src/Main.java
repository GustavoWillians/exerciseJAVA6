import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de A:");
		double a = sc.nextDouble();
		System.out.println("Informe o valor de B:");
		double b = sc.nextDouble();
		System.out.println("Informe o valor de C:");
		double c = sc.nextDouble();
		
		double pi = 3.14159;
		
		double triangulo = (a * c) / b;
		double circulo = pi * (c * c);
		double trapezio = ((a + b) * c) / 2;
		double quadrado = b * b;
		double retangulo = a * b;
		
		System.out.println("Segue abaixo a área de todas as formas listadas:");
		
		System.out.println("Triangulo: " + triangulo);
		System.out.println("Circulo: " + circulo);
		System.out.println("Trapezio: " + trapezio);
		System.out.println("Quadrado: " + quadrado);
		System.out.println("Retangulo: " + retangulo);
		
	}

}
