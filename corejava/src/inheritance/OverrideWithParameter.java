package inheritance;
class UserInput {
	public void data(int a,int b) {
		System.out.println(a+" "+b);
	}
}
class UserAdd extends UserInput{
	public void data(int a,int b){
		System.out.println("sum is :"+(a+b));
	}
}
public class OverrideWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserInput u=new UserAdd();
u.data(3, 7);
UserInput u1=new UserInput();
u1.data(5, 8);
	}

}
