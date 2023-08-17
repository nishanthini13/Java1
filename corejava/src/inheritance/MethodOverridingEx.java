package inheritance;
class Learner{
	public void lname() {
		System.out.println("My name is Nisha ");
	}
	void courseName() {
		System.out.println("java full stack");
	}
	void courseDuration() {
		System.out.println("4mons");
	}
}
class Lcourse extends Learner{
	void courseName() {
		super.courseName();
		System.out.println("Frontend developer");
	}
	@Override
	void courseDuration() {
		System.out.println("4mons");
	}
}
public class MethodOverridingEx {

	public static void main(String[] args) {
		
Lcourse l=new Lcourse();
l.courseName();
l.lname();
l.courseDuration();
//Learner l1=new Learner();
//l1.courseName();
//l1.lname();
	}

}
