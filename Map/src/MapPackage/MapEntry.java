package MapPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Janhavi");
		map.put(2, "Tanvi");
		map.put(4, "Sanvi");
		map.put(5, "Avani");
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}
