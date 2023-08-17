package basics;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			StringBuffer str = new StringBuffer("Nisha ");
			str.append("Ragavi "); 
			System.out.println(str);
			str.insert(6, "selenophile"); 
			str.insert(7, "selenophile"); 
			System.out.println(str);
			str.replace( 8, 16, "moon"); 
			System.out.println(str);
			str.reverse(); 
			System.out.println(str);
			System.out.println( str.capacity() );
			System.out.println( str.length() );
			System.out.println(str.charAt(5));
			System.out.println(str.hashCode());
			System.out.println(str.isEmpty());
			
			
			
	}

}
