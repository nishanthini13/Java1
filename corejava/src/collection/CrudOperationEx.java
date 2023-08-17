package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Learner{
	int lno;
	String lname;
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Learner(int lno, String lname) {
		super();
		this.lno = lno;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Learner [lno=" + lno + ", lname=" + lname + "]";
	}
	
}
public class CrudOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Learner> l=new ArrayList<Learner>();
Scanner s=new Scanner(System.in);
int choice;
do {
	System.out.println("1.insert data ");
	System.out.println("2.display data ");
	System.out.println("Enter ur choice :");
	choice=s.nextInt();
	switch(choice) {
	case 1:
		System.out.println(" enter lno");
	int lno=s.nextInt();
	System.out.println(" enter lname");
	String  lname=s.next();
	l.add(new Learner(lno,lname));
	break;
		case 2:
			Iterator<Learner> i=l.iterator();
		while(i.hasNext()) {
			Learner le=i.next();
			System.out.println(le);
			}
			case 3:
				boolean found = false;
                System.out.print("Enter lno to Search : ");
                int lno1 = s.nextInt();
                
		
		Iterator <Learner>i1 = l.iterator();
                while (i1.hasNext()) {
                    Learner e = (Learner) i1.next();
                    if (e.getLno() == lno1) {
                        System.out.println(e);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Record Not Found");
                }
		}
	}
		while(choice!=0);

	

}
}
