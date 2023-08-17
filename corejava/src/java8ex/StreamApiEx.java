package java8ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp{
		int eid;
		String ename;
		double salary;
		String designation;
		public Emp(int eid, String ename, double salary, String designation) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
			this.designation = designation;
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		@Override
		public String toString() {
			return "Emp [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation + "]";
		}
	}
public class StreamApiEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Emp> al=new ArrayList<>();
al.add(new Emp(12,"nisha",30000,"Developer"));
al.add(new Emp(13,"usha",20000,"Tester"));
al.add(new Emp(14,"nivi",40000,"Hr"));
al.add(new Emp(15,"abi",50000,"Businessman"));
System.out.println(al);
//al.sort(Comparator.naturalOrder());
//System.out.println(" sorting Element in my Arraylist :"+al);
	long count=al.stream().count();
	System.out.println(" no of employee :"+count);
	long start_with_n=al.stream().filter(a->a.getEname().startsWith("n")).count();
	System.out.println("starts with n:"+start_with_n);
	Object max_sal=al.stream().collect(Collectors.maxBy(Comparator.comparingDouble(a->a.salary)));
	System.out.println("maximun salry: "+max_sal);
	Object min_sal=al.stream().collect(Collectors.minBy(Comparator.comparingDouble(a->a.salary)));
	System.out.println("minimun salry: "+min_sal);
	double avg_sal=al.stream().collect(Collectors.averagingDouble(a->a.salary));
	
	System.out.println("Average salry: "+avg_sal);

	//Stream<Emp> s = al.stream().filter(a ->a.getEname().startsWith("C"));

    //System.out.println(s.collect(Collectors.toList()));
    Stream<Emp> namesStartsWith = al.stream().filter(a -> a.getEname().startsWith("A"));
	 System.out.println("Name start with A:"+namesStartsWith.collect(Collectors.toList()));

	}

}
