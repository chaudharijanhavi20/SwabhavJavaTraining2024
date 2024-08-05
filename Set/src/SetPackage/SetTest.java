package SetPackage;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {
public static void main(String[] args) {
	
	HashSet<String> set=new HashSet<String>();
	set.add("Isha");
	set.add("Janhavi");
	set.add("Sarthak");
	set.add("Roshani");
	set.add("PC");
	
	System.out.println(set);
	System.out.println("\nIs janhavi present in the set? :"+set.contains("Janhavi"));
	System.out.println("\nIs set is Empty? :"+set.isEmpty());
	System.out.println(set.remove("Roshani"));
	System.out.println("\n Size of set is: "+set.size());
	
	HashSet<String> set1=new HashSet<String>();
	set1.add("Mobile");
	set1.add("Laptop");
	set1.add("PC");
	set1.add("Tab");
	System.out.println("\n"+set1);
	
	System.out.println("\nAfter RetainAll :");
	set1.retainAll(set);
	System.out.println(set1);
	
	set1.add("Mobile");
	set1.add("Laptop");
	set1.add("PC");
	set1.add("Tab");
	
	System.out.println("\nAfter Addall ");
	set1.addAll(set);
	System.out.println(set1);
	
	
	
	System.out.println("\nTreeSet ");
	
	TreeSet<String> treeset=new TreeSet<String>();
	treeset.add("yellow");
	treeset.add("pink");
	treeset.add("red");
	treeset.add("blue");
	System.out.println(treeset);
}
}
