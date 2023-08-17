package collection;

import java.util.HashMap;

public class HashMapEx {
	
		public static void main(String[] args) {
			HashMap<Integer,String> hm = new HashMap<>();
			hm.put(1,"abc");
			hm.put(2,"abc");
			hm.put(2,"PQR");
			
            
			System.out.println("Hash map :"+hm);
			System.out.println("contains value:"+hm.containsValue("abc"));
		System.out.println("contain key:"+hm.containsKey(2));
		}
}

