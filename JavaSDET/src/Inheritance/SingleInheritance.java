package Inheritance;

public class SingleInheritance {
	void makeOfSound() {
		System.out.println("Animal Sound");
	}

	static class Dog extends SingleInheritance {
		@Override
		void makeOfSound() {
			System.out.println("woof!");
		}
	}

	public static void main(String[] args) {
		SingleInheritance sc = new Dog();
		sc.makeOfSound();
	}

}
