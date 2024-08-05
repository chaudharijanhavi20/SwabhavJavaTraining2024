package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		System.out.println(name.size());
		System.out.println(name);
		name.add("Janhavi");
		name.add("isha");
		name.add("rohini");
		name.add("darshu");
		name.add("bhakti");
		// name.add(60);
		System.out.println(name);
		name.add(2, "roshani");
		System.out.println(name);
		name.remove(4);
		System.out.println("Returning element: "+name.get(1));
		 name.set(1,"Mansi");  
		System.out.println(name);
		 Collections.sort(name); 
		 System.out.println(name);
	}
}
