package inheritance;
class Student1{
	String name;
	Student1(String nm){
		name=nm;
	System.out.println(name);	
	}
}
//subclassz
class Developer1 extends Student1{
	String role;
	String name;
			public Developer1(String role,String name){
				//super as constructor
				super(name);
				this.role=role;
		System.out.println(role);
	}
}
public class SingleconsEx1 {
	

		public static void main(String[] args) {
			//Scanner sc=new Scanner(System.in) {
			Developer1 d1=new Developer1("java fullstack","nisha");
			//d1.display();
			//d1.displayRole();
		}


	}
	


