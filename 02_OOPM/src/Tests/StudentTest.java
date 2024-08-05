package Tests;

import java.util.Scanner;

import Models.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your roll number:");
		int rollno = sc.nextInt();

		System.out.print("Enter your name:");
		String name = sc.next();

		System.out.print("Enter your age:");
		int age = sc.nextInt();

		System.out.println("Enter your percentage:");
		double percentage = sc.nextDouble();
		Student student = new Student(rollno,name,age,percentage);
		System.out.println("Grade: " + student.grade());
	}
}
