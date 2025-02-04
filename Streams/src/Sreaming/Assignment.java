package Sreaming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Assignment {
public static void main(String[] args) {
	List<String> names=Arrays.asList("Janhavi","Roshni","Sarthak","Vedika","Deep");
	
	System.out.println("\nFirst three students sorted in ascending order :");
	names.stream()
	.sorted()
	.limit(3)
	.forEach((name)->System.out.println(name));
	
	System.out.println("\nFirst three students sorted in ascending order,if it contain 'a' :");
	names.stream()
	.filter(name -> name.contains("a")) 
	.sorted()
	.limit(3)
	.forEach((name)->System.out.println(name));
	
	System.out.println("\nStudents in Descending order :");
	names.stream()
	.sorted(Comparator.reverseOrder())
	.forEach((name)->System.out.println(name));
	
	System.out.println("\nFirst three characters of all names :");
	names.stream()
    .map(name -> name.substring(0,3))
    .forEach((name)->System.out.println(name));
	
	System.out.println("\nNames which only contains less than or equal to 4 charactors :");
	names.stream()
	.filter(name -> name.length() <= 4) 
	.forEach((name)->System.out.println(name));
}
}

