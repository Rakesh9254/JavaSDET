package Encapsulation;
public class GetSetMethod {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		GetSetMethod getSetMethod = new GetSetMethod();
		getSetMethod.setAge(19);
		System.out.println(getSetMethod.age);
	}
}
