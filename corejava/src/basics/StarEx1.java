package basics;

public class StarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 3;
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();

}}
	}
