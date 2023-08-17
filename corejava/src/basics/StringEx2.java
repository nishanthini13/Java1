package basics;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Welcome to edubridge    ";
       
        //convert string into character array
        char[] arr = str.toCharArray();   
        String tempStr = "";
        for(char c:arr){
            
            if(c != ' '){
                tempStr += c;
            }
           // System.out.println(c);
            System.out.println("Temp"+tempStr);
        }
         str = tempStr;
        System.out.println(str);
        if(str.length()>0) {
        	
        }
	}

}
