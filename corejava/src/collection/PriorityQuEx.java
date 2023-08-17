package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

class Attendance implements Comparable  {  
private int rollNo;  
private String name;  
  
public Attendance( int rollNo,String name) {  
this.rollNo= rollNo;  
this.name = name;  
    }  
public String toString(){  
return this.rollNo+" "+this.name;  
    }  
  
@Override  
public int compareTo(Object o) {  
return 0;  
    }  
}  
  
public class PriorityQuEx {
	public static void main(String[] args) {  
        Attendance a1 = new Attendance(1, "Amit");  
        Attendance a2 = new Attendance(2, "Simran");  
        Attendance a3 = new Attendance(5, "Raj");  
        Attendance a4 = new Attendance(4, "Barun");  
  
PriorityQueue<Attendance>Pqueue = new PriorityQueue<Attendance>();  
Pqueue.add(a1);  
Pqueue.add(a2);  
Pqueue.add(a3);  
Pqueue.add(a4);  
        Iterator<Attendance> iterator = Pqueue.iterator();  
while(iterator.hasNext()){  
System.out.println(iterator.next());  
        }  
    }  
}  

