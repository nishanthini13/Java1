package basics;

public class AmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m = Math.pow(3, 3);
		int num = 153;
		int rem = 0, temp =num;
		double sum = 0;
		while (temp != 0) {
			rem = temp % 10;
			sum = sum + Math.pow(rem, 3);
			temp = temp / 10;
		}
		System.out.println("sum" + sum);
		if (sum== num) {
			System.out.println("is amstrong");
		} else {
			System.out.println("not amstrong");
		}
	}

}
