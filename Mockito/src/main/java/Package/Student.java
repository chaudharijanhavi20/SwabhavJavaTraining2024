package Package;

public class Student {
	private IStudentService studentservice;

	public Student(IStudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}

	public double calculatePercentage() {
		return studentservice.getTotalMarks() / studentservice.getTotalSubjects();
	}
}
