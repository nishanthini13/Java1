package inheritance;
class A{
int age=40;
int rollno=1;}
class B extends A{
int age=20;
void display() {
	System.out.println(age);
	System.out.println("super class age :" +age);
}}
public class SuperEx1 {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B();
b.display();
	}
}

