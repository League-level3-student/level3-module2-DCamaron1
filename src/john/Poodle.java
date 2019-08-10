package john;

import WarmUps.Dog;

public class Poodle extends Dog{
	
	public void play(){
		bark();
	}
	
	public static void main(String[] args) {
		Dog sadie = new Dog();
		sadie.play();
	}
}
