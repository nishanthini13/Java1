package inheritance;
class Animal{
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}
class Dog  extends Animal{
	public void animalSound() {
		super.animalSound();
		System.out.println("The dog barks ");
	}
}
public class SuperMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog o=new Dog();
o.animalSound();
	}

}
