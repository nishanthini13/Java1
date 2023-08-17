package java8ex;

import collection.override;

interface Interface1{
	void abstractmethod();
	
	default void display() {
		System.out.println("interface1");
	}
	static void display1() {
		System.out.println("static method1");
	}
	void display2();
}
public class DefaultMethodsEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DefaultMethodsEx dm=new DefaultMethodsEx();
 dm.display();
dm.abstractmethod();
Interface1.display1();
	}

	@override
	public void display() {
		System.out.println("interface 1");
	}

	@override
	public void abstractmethod() {
		System.out.println("deafult 1..");
	}
}
