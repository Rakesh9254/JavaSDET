package SDET;

public class reverseString {

	public static String reversedString(String str) {
		String Reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			Reversed += str.charAt(i);
		}
		return Reversed;
	}

	public static void main(String[] args) {
		String str = "Hello World!";
		String reverseString = reversedString(str);
		System.out.println(reverseString);

	}
}
