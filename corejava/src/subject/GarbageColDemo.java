package subject;

public class GarbageColDemo {
	public void finalize() {
		System.out.println("garbage collection performed by jvm");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageColDemo s1 = new GarbageColDemo();
    	GarbageColDemo s2 = new GarbageColDemo();
    	s1 = null;
    	s2 = null;
        System.gc();
	}

}
