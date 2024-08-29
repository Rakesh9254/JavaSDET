package Constructor;

public class Overloading {
	Overloading() {
		System.out.println("Ram Ram Ram");
	}

	Overloading(int x) {
		System.out.println("Ram Mandir");
	}

	Overloading(int a, String name) {
		System.out.println("Adhoya");
	}

	public static void main(String[] args) {
		Overloading sc = new Overloading(23,"rakesh");

	}

}
