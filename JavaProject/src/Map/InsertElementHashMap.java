package qsp.Map;

import java.util.HashMap;
import java.util.Map;

public class InsertElementHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap();
		hm.put(1, "Jareena");
		hm.put(2, "Himanshu");
		hm.put(3, "Gangadhar");
		//hm.put(null, "hello");
		//hm.put(null, 10);
		
//		System.out.println(hm);
//		System.out.println(hm.entrySet());
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
		
		
		for(Map.Entry<Integer,String>entry:hm.entrySet()){
			System.out.println("key:" + entry.getKey());
			System.out.println("values:" + entry.getValue());
			
		}
	}

}
