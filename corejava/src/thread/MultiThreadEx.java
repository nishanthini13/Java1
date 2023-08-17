package thread;
 class MultiThread extends Thread{
	 public void run() {
		 System.out.println("running thread name:"+this.currentThread().getName());
		 System.out.println("running thread priority :"+this.currentThread().getPriority());
	 }
 }

public class MultiThreadEx {

	public static void main(String[] args) {
		MultiThread mt1=new MultiThread();
		mt1.setName("First Thread");
		mt1.setPriority(Thread.MIN_PRIORITY);
		MultiThread mt2=new MultiThread();
		mt2.setName("second thread");
		mt2.setPriority(Thread.MAX_PRIORITY);
		MultiThread mt3=new MultiThread();
		mt3.setName(" third thread");
		mt1.start();
		mt2.start();
		mt3.start();
		

	}

}
