package basics;

public abstract sealed class StringtoChar {

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

	}

}
