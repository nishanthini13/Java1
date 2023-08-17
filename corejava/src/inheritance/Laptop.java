package inheritance;

class Laptop {
	String item="laptop";
	void displayitem() {
		System.out.println("your item is :"+item);
	}
}
class name extends Laptop{
	String itemname="HP/Dell";
	void displayitemname() {
		System.out.println("your itemname is :"+itemname);
	}}
	class version extends name{
		String model="HP i5";
		void displaymodel() {
			System.out.println("your modelname is :"+model);
		}}
	public class create{
		public static void main(String[]args) {
			version m=new version();
			m.displayitem();
			m.displayitemname();
			m.displaymodel();
		}
	}



