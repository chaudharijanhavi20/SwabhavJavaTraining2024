package Package;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

class StudentTest {
	IStudentService studentservice;
	Student student;

	@BeforeEach
	public void init() {
		studentservice = Mockito.mock(IStudentService.class);
		student=new Student(studentservice);
	}

	@Test
	void testcalculatepercentage() {
		Mockito.when(studentservice.getTotalMarks()).thenReturn((double) 650);
		Mockito.when(studentservice.getTotalSubjects()).thenReturn(10);

		assertEquals(65, student.calculatePercentage());
	}
}
