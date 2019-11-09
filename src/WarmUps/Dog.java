package WarmUps;

public class Dog {
	protected void bark() {
		System.out.println("bork bork");
	}
	
	public static void main(String[] args) {
		Dog sadie = new Dog();
		sadie.bark();
	}
}
