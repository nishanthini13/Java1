import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
	public int fact(int n) {
		 int fact=1;
		 for(int i=1;i<=n;i++) {
			 fact=fact*i;
		 }
		 return fact;
	 }
	 @Test
	 public void testFact () {
		 assertEquals(120,fact(5));
	 }
	

}
