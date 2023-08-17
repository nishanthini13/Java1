package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondSmallest {
	 
     
		 public static int getSecondSmallest(Integer[] a, int total){
			 List<Integer> list=Arrays.asList(a);
			 list.add(23);
			 list.add(45);
			 list.add(32);
			 list.add(22);
			 list.add(20);
			 list.add(96);
			 System.out.println("Elements in My LinkedList :"+list);
			 Collections.sort(list);
			 int element=list.get(1);
			 return element;
    }
}
