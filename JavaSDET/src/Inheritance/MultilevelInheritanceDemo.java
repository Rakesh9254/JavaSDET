package Inheritance;

class Animal {
	public void eat() {
		System.out.println("Eating");
	}
}

class Dog extends Animal {
	public void Bark() {
		System.out.println("barking.....");
	}
}

class Mammal extends Dog {
	public void GiveBarth() {
		System.out.println("BirthDay.......");
	}
}

public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		Mammal mammal = new Mammal();
		mammal.Bark();
		mammal.eat();
		mammal.GiveBarth();

	}

}
