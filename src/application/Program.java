package application;

import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary:");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee.toString());
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee);

	}

}
