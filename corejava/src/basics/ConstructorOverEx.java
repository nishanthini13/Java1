package basics;

public class ConstructorOverEx {
ConstructorOverEx() {
	// TODO Auto-generated constructor stub
	System.out.println("default");
	System.out.println("Introduction");
	
}
 ConstructorOverEx(String name) {
	System.out.println("Name :" +name);
}
ConstructorOverEx(String scname,int rollno){
	System.out.println("school name :" +scname);
	System.out.println("rollno:" +rollno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorOverEx c1=new ConstructorOverEx();
ConstructorOverEx c2=new ConstructorOverEx("nisha");
	ConstructorOverEx c3=new ConstructorOverEx("nivedha", 1);
	
	}

}
