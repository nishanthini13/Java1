package basics;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Break stmt");
int i=0;
while(i<5) {
	if(i==2) {
		break;
	}
	System.out.println(i++);
}
System.out.println("continue stmt");
	}

}
