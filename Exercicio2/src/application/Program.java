package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee Emp = new Employee();
		
		System.out.print("Nome: ");
		Emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		Emp.GrosSalary = sc.nextDouble();
		System.out.print("Tax: ");
		Emp.Tax = sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + Emp );
		System.out.println();
		System.out.print(" Which Percentage to increase salary? ");
		double percentage = sc.nextDouble();
		Emp.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + Emp);
		
	}

}
