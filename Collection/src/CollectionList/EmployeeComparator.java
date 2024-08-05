package CollectionList;

import java.util.Comparator;

import Model.Employee;


public class EmployeeComparator {
	public static class NameComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {

			return employee1.getName().compareTo(employee2.getName());
		}

	}

	public static class SalaryComparator implements Comparator<Employee> {

		public int compare(Employee employee1, Employee employee2) {
			if (employee1.getId() > employee2.getId())
				return 1;
			if (employee1.getId() < employee2.getId())
				return -1;
			return 0;
		}

	}

	public static class IdComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {
			if (employee1.getId() > employee2.getId())
				return 1;
			if (employee1.getId() < employee2.getId())
				return -1;
			return 0;
		}

	}

}
