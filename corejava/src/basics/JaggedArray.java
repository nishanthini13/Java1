package basics;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][];
		arr[0]=new int[] {45,67,91};
		arr[1]=new int[] {67,101,83};
		arr[2]=new int[] {23,123,91};

			
			System.out.println("elements of jagged array");
			for(int i=0;i<arr.length;i++) {
				for(int j=0; j<arr[i].length;j++)
					System.out.println(arr[i][j] +"");
				System.out.println();
			}

	}

}
