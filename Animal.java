public class Animal {
	protected String a="Animal";
	
	public Animal(){
		System.out.println("A new "+ a + " has been created!");
	}
	void eat() {
		System.out.println("A "+ a + " eats...");
	}
	void sleep() {
		System.out.println("A "+ a + " sleeps...");
	}
}

class Dog extends Animal {
	public Dog() {
		Animal a = new Animal();
		a.a = "dog";
		a.eat();
		a.sleep();
	}
}

class Bird extends Animal {
	public Bird() {
		Animal a = new Animal();
		a.a = "bird";
		a.eat();
		a.sleep();
	}
}