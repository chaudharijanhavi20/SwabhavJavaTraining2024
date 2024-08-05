package CollectionList;

import java.util.Comparator;

import Model.Student;

public class SudentComparator {
	public static class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {

			return student1.getName().compareTo(student2.getName());
		}

	}

	public static class PercentageComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
			if (student1.getPercentage() > student2.getPercentage())
				return 1;
			if (student1.getPercentage() < student2.getPercentage())
				return -1;
			return 0;
		}

	}

	public static class RollNumberComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
			if (student1.getRollNo() > student2.getRollNo())
				return 1;
			if (student1.getRollNo() < student2.getRollNo())
				return -1;
			return 0;
		}

	}
}
