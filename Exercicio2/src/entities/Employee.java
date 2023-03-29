package entities;

public class Employee {
	
	public String name;
	public Double GrosSalary;
	public Double Tax;
	public double percentage;
	public double netSalary;
	
	public double netSalary() {
		return GrosSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GrosSalary += GrosSalary * percentage / 100.0;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
