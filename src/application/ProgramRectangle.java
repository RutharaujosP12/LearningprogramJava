// Exercicio 01 das aulas de POO sobre classes e atributos

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	Rectangle R = new Rectangle();
	// Criação do objeto do tipo retângulo
	
	System.out.println("Enter rectangle width and height:");
	R.width = sc.nextDouble();
	R.height = sc.nextDouble();
	
	// saída do programa já formatada e chamada dos métodos para realizar os cálculos
	System.out.printf("AREA = %.2f%n" , R.area());
	System.out.printf("PERIMETER = %.2f%n" , R.perimeter());
	System.out.printf("DIAGONAL = %.2f%n" , R.diagonal());	

	}

}
