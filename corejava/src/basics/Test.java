package basics;
import java.lang.reflect.*;
 class Test {
	 private String name;
	  private void display() {
	    System.out.println("The name is " + name);
	  }

	}
	class Main {
	  public static void main(String[] args) {
	    try {
	      
	      Test test = new Test();

	     
	      Class obj = test.getClass();

	      Field field = obj.getDeclaredField("name");
	      
	      field.setAccessible(true);
	     
	      field.set(test, "Programiz");

	      String value = (String)field.get(test);
	      System.out.println("Name: " + value);

	   
	      Method[] methods = obj.getDeclaredMethods();
	      System.out.println("Method Name: " + methods[0].getName());
	      int modifier = methods[0].getModifiers();
	      System.out.println("Access Modifier: " + Modifier.toString(modifier));

	    }
	    catch(Exception e) {
	      e.printStackTrace();
	    }
	  }
}
