package CollectionList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import Model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		System.out.print("Enter the number of students: ");
		int numStudents = scanner.nextInt();
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Enter details for student " + (i + 1));
			System.out.print("Enter your Roll Number: ");
			int rollNo = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter your Name: ");
			String name = scanner.nextLine();
			System.out.print("Enter your Percenage: ");
			double percentage = scanner.nextDouble();
			students.add(new Student(rollNo, name, percentage));
		}

		System.out.println("\nUsing normal for loop");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

		System.out.println("\nUsing advance for loop");
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("\nUsing iterative");
		Iterator<Student> studentIterator = students.iterator();
		while (studentIterator.hasNext())
			System.out.println(studentIterator.next());

		System.out.println("\nUsing iterative");
		ListIterator<Student> studentListIterator = students.listIterator();
		while (studentListIterator.hasNext())
			System.out.println(studentListIterator.next());
		System.out.println("\nIn reverse format");
		while (studentListIterator.hasPrevious())
			System.out.println(studentListIterator.previous());

		System.out.println("\nAfter sorting Roll Number wise :");
		Collections.sort(students,new SudentComparator.RollNumberComparator());
		printStudents(students);
		
		System.out.println("\nAfter sorting Percentage wise :");
		Collections.sort(students,new SudentComparator.PercentageComparator());
		printStudents(students);
		
		System.out.println("\nAfter sorting Name wise :");
		Collections.sort(students,new SudentComparator.NameComparator());
		printStudents(students);
		
	}

	private static void printStudents(List<Student> students) {
		for(Student student:students) {
			System.out.println(student);
		}
		
	}

}
