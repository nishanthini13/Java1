package inheritance;
//super class
class Student{
	String name="Nisha";
	void display() {
	System.out.println(name);	
	}
}
//subclassz
class Developer extends Student{
	String role="Full stack";
			void displayRole() {
		System.out.println(role);
	}
}
public class SingleInheritEx {

	public static void main(String[] args) {
		Developer d1=new Developer();
		d1.display();
		d1.displayRole();
	}

}
