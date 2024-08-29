package Encapsulation;

public class GSMethod {
	private int age;

	public void SetAge(int age) {
		if (age >= 0 && age <= 100) {
			this.age = age;
		} else {
			System.out.println("Invalid Age");
		}
	}
	public int GetAge() {
		return age;
	}

	public static void main(String[] args) {
		GSMethod s1 = new GSMethod();
		s1.SetAge(16);
		System.out.println(s1.GetAge());
		s1.SetAge(78);
		System.out.println(s1.GetAge());
	}

}
