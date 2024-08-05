package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Model.Employee;
import Model.Student;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> employee = new ArrayList<Employee>();
		System.out.print("Enter the number of Employees: ");
		int numEmployee = scanner.nextInt();
		for (int i = 0; i < numEmployee; i++) {
			System.out.println("Enter details for Employees " + (i + 1));
			System.out.print("Enter your EmployeeId: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter your Name: ");
			String name = scanner.nextLine();
			System.out.print("Enter your Salary: ");
			double salary = scanner.nextDouble();
			employee.add(new Employee(id, name, salary));
		}
		System.out.println("\nAfter sorting Id wise :");
		Collections.sort(employee, new EmployeeComparator.IdComparator());
		printEmployees(employee);

		System.out.println("\nAfter sorting Salary wise :");
		Collections.sort(employee, new EmployeeComparator.SalaryComparator());
		printEmployees(employee);

		System.out.println("\nAfter sorting Name wise :");
		Collections.sort(employee, new EmployeeComparator.NameComparator());
		printEmployees(employee);
	}

	private static void printEmployees(List<Employee> employee) {
		for (Employee employees : employee) {
			System.out.println(employees);
		}

	}
}
