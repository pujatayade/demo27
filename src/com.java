import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class com {
	public static void main(String[] args) {
		
		HashMap<String,HashMap<String,ArrayList<String>>> hm=new HashMap<>();
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Aurangabad");
		al1.add("Pune");
		al1.add("Mumbai");
		al1.add("Nagpur");
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Mathura");
		al2.add("Aligarh");
		al2.add("Agra");
		al2.add("Jablapur");
		
		ArrayList<String> al3=new ArrayList<>();
		HashMap<String,ArrayList<String>> hm1=new HashMap<>();
		hm1.put("Maharashtra", al1);
		hm1.put("up", al2);
		hm1.put("d1", al3);
		hm.put("India", hm1);
		System.out.println(hm);
		for(String key1:hm1.keySet()) {
			for(String key2:hm1.keySet())
			System.out.println("key>>"+key2);
			System.out.println("value>>"+hm1.get(key1));
		}
	}
}

		
		
		
		
		

