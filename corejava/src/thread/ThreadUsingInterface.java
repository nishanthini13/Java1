package thread;
class Thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println(" Thread1");
		for(int i=0;i<5;i++) {
		System.out.println(i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
	
}
class Thread2 extends Thread{

	@Override
	public void run() {
		System.out.println(" Thread2");
		for(int i=5;i<=10;i++) {
		System.out.println(i);
	}}
	
}
class Thread3 extends Thread{

	@Override
	public void run() {
		int num=9;
		System.out.println(" Thread3");
		for(int i=1;i<=10;i++) {
System.out.println(num + " * " + i + " = "+ num * i);
	}}
}


public class ThreadUsingInterface {

	public static void main(String[] args) {
		
Thread1 t1=new Thread1();
Thread t=new Thread(t1);
t.start();
Thread2 t2= new Thread2();
// Thread t3= new Thread(t2);
 t2.start();
 Thread3 t3= new Thread3();
 //Thread t0= new Thread(t4);
 t3.start();
 
	}

}
