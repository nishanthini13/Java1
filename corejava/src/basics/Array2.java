package basics;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = {0,1,2,3,4,5,6,7,8,9};
		int cloneArray[] = intArray.clone();
		// Deep copy is created following print statement will print false
		System.out.println(intArray);
		System.out.println(cloneArray);
		System.out.println(intArray == cloneArray);
		
		for (int i = 0; i < cloneArray.length; i++) { 
			System.out.print(cloneArray[i]+" ");
			
		}
		for (int j = 0; j < cloneArray.length; j++) { 
			System.out.print(cloneArray[j]+" ");
			
		}
		
		//shallow
		int intArray1[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		int cloneArray1[][] = intArray1.clone();
		// shallow copy is created following print statement will print true 
		System.out.println(intArray1[0]);
		System.out.println(cloneArray1[0]);
		System.out.println(intArray1[1] == cloneArray1[1]);

	}

}
