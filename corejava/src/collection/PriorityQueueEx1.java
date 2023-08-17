package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.*;

class Student1 implements Comparable<Student1>{
	int rollno;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student1(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + "]";
	}
}
public class PriorityQueueEx1 {

	public static void main(String[] args) {
		PriorityQueue<Student1> s =new PriorityQueue<>();
		s.add(new Student1(1, "nisha"));
		s.add(new Student1(2, "abi"));
		s.add(new Student1(3, "nish"));
		
		System.out.println("size of the oueue :" +s.size());
		
		Iterator<Student1> it= s.iterator();
		while(it.hasNext()) {
			//Iterator<Student1> iterator = null;
			System.out.println(" elements in a queue:"+s.peek().toString());
			//System.out.println(iterator.next() +" ");
		}
		

	}

}
