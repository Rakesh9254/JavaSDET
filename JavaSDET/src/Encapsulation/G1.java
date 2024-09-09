package Encapsulation;

public class G1 {
	private int age;
	private String Name;
	
	public void SetAge(int age) {
		this.age = age;
	}
	public int GetAge() {
		return age;
	}
	
	public void SetName(String Name) {
		this.Name=Name;
	}
	public String GetName() {
		return Name;
	}
	
	public static void main(String[] args) {
		G1 g1 = new G1();
		g1.SetAge(19);
		g1.SetName("Rakesh");
		System.out.println(g1.age);
		System.out.println(g1.Name);
		
	}

}
