package subject;

public class Employee {
	
		 private int eid;
		 private String ename;
		 
		Employee(int i, String string){
		   this.eid=eid;
		    this.ename=ename;
		}
		 
		public static void main(String a[]){
		   Employee eob = new Employee(0, null);
		  Employee eob1 = new Employee(1111,"Swetha");
		  
		   System.out.println(eob.eid);  //0
		   System.out.println(eob.ename); //null
		    System.out.println(eob1.eid);  //1111
		   System.out.println(eob1.ename); //Swetha
		    }
		}

