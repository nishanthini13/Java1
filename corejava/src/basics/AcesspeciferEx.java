package basics;
class PrivateDemo{
	private int b=8;
	 void display() {
		System.out.println(b);
	}
}
public class AcesspeciferEx {
private int i=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateDemo d=new PrivateDemo();
		d.display();
AcesspeciferEx a=new AcesspeciferEx();
a.i=10;

System.out.println(a.i);
	}

}
