package Models;

public class Employee {
private int employeeId;
private String name;
private double salary;

public Employee(int employeeId,String name,double salary) {
	this.employeeId=employeeId;
	this.name=name;
	this.salary=salary;
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int emploeeId) {
	employeeId=employeeId;
}
public String getName() {
    return name;
}

public void setName(String name) {
    name = name;
}
public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    salary=salary;
}
}
