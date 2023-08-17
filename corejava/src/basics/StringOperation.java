package basics;

public class StringOperation {
	public static void main(String[] args) {
		String str="Black";
		String str1="black";
		System.out.println("length of string is :" +str.length());
		System.out.println("uppercase :" +str.toUpperCase());
		System.out.println("lcase :" +str.toLowerCase());
			//System.out.println("is both are eual :"+ str.equals);
		System.out.println("concate :" +str.concat("cloud"));
		System.out.println("replace :" +str.replace("black","pink"));
		String str4 = "How are you?";
		String arrStr[] = str4.split(" ", 3);
		System.out.println("Splited Elements:");
		for(int i=0;i<arrStr.length;i++) {
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();
		System.out.println("Splited Elements using for each loop:");
			for (String str5 : arrStr) {
				System.out.print(str5 + " ");
			}
			String str6="";
			System.out.println("empty string :" +str.isEmpty());
			System.out.println();
			System.out.println("blank :" +str.isBlank());
	}

}
