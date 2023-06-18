package HashMap;
import java.util.*;
public class HashMap1 {
public static void main (String args[]) {
	
	// Hashmap  is used to store values in pair like Key and Value
	//Country(Key) Population (value)int
	HashMap<String, Integer>map = new HashMap<>(); 
	
	//inserting value
	map.put("India", 100);
	map.put("China", 130);
	map.put("Japan", 55);
	System.out.println(map);
	
	// to get value related to any key
	System.out.println(map.get("India"));
	System.out.println("size of the map is "+ map.size());
	
	// using for each for printing each set
	for(Map.Entry<String, Integer> e:map.entrySet()) {
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		//output will be
/*
China
130
Japan
55
India
100
*/
		// to print set horizontally
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key+ " "+ map.get(key));
/*
China 130
Japan 55
India 100
		*/
			
		}
	}
}
}
