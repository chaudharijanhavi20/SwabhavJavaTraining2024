package CollectionList;

import java.util.Comparator;

import Model.Student;

public class RollNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getRollNo() > student2.getRollNo())
			return 1;
		if (student1.getRollNo() < student2.getRollNo())
			return -1;
		return 0;
	}

}
