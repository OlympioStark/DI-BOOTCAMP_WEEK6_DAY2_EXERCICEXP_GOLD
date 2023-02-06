package Exercice;

import java.util.Scanner;

public class AppSalary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the basic salary :");
		float basic_salary = scanner.nextFloat();
		double salary;
		double HRA = 0, DA = 0;
		
		if (basic_salary <= 10000) {
			HRA = basic_salary * 0.2 ;
            DA = basic_salary * 0.8 ;
		} else if(basic_salary <= 20000) {
			HRA = basic_salary * 0.25 ;
            DA = basic_salary * 0.9 ;
		} else if(basic_salary > 20000) {
			HRA = basic_salary * 0.3 ;
            DA = basic_salary * 0.95 ;
		}
		
		salary =  basic_salary + HRA + DA;
		System.out.println("Gross Salary : " + salary);

	}

}
