package basics;

public enum EnumEx1 {
	winter(0),summer(1),monsoon(2);
private int index;

	private EnumEx1(int index) {
	// TODO Auto-generated constructor stub
		this.index=index;
}
	public static void main(String[] args) {
		System.out.println(EnumEx1.monsoon.index);
	}
}
