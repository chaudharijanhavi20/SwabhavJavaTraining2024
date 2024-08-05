package MapPackage;
import java.util.HashMap;
import java.util.Map;
public class MapTest {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<String, Integer>();
	map.put("Janhavi", 87);
	map.put("tanvi", 77);
	map.put("Avni", 67);
	map.put("Shivani", 97);
	System.out.println(map);
	
	map.putIfAbsent("purvi", 89);
	System.out.println(map);
	
	System.out.println("\nIs 89 present in the map :"+map.containsValue(89));
	System.out.println("\nIs set is empty :"+map.isEmpty());
	
	Map<String, Integer> map1=new HashMap<String, Integer>();
	map1.put("Janhavi", 87);
	map1.put("tanvi", 77);
	map1.put("Avni", 67);
	map1.put("Shivani", 97);
	
}
}
