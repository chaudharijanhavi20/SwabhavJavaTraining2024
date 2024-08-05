package Tests;

import Models.Employee;
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter you employee ID:");
		int id = sc.nextInt();
		
		System.out.print("Enter you name:");
		String name = sc.next();

		System.out.print("Enter you salary:");
		double salary = sc.nextInt();
		Employee employee = new Employee(id,name,salary);
		System.out.println("ID  : " + id + "\nName : " + name + "\nSalary : " + salary);
	}
}
