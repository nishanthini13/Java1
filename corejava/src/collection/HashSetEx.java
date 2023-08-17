package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> name=new HashSet();
name.add("nisha");
name.add("Abirami");
name.add("dharsh");
System.out.println(name);
System.out.println(" Retired iterator");
Iterator<String> itr=name.iterator();
while(itr.hasNext()) {
	String s= itr.next();
	System.out.println(s);
}


	}

	
	}

	

