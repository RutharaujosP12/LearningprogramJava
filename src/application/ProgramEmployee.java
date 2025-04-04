// Exercicio 02 das aulas de POO sobre classes e atributos

package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
	
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name:");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary:");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax:");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee:"  + emp);
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data:" + emp);
		
		sc.close();	

	}

}
