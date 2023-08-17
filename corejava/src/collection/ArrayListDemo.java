package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Nisha");
		a1.add(1,"Abi");
		
		System.out.println("Element in my Arraylist :"+a1);
		a1.sort(Comparator.naturalOrder());
		System.out.println(" sorting Element in my Arraylist :"+a1);
		
		System.out.println("size in my Arraylist :"+a1.size());
		System.out.println("GetElement in my Arraylist :"+a1.get(0));
		ArrayList<String> a2=new ArrayList<>();
		a2.add("abirami");
		System.out.println("set in my Arraylist :"+a2);
	
		ArrayList<Integer> a3=new ArrayList<>();
		a3.add(10);
		a3.add(24);
		a3.add(34);
		//a3.remove(0);
		System.out.println("Element in my Arraylist :"+a3);
		a3.remove(0);
		System.out.println(" Remove Element in my Arraylist :"+a3);
		List<Integer> list=new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 5);
		System.out.println("collection in my arraylist:" +list);
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Dharshu", "Ragavi"));
		System.out.println("Arraylist :"+arrayList);
	}

}
