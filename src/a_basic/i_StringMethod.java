package a_basic;

import java.util.Arrays;

public class i_StringMethod {
	public static void main(String[] args) {
		String s = "tỐng HoàNG vŨ";

		// Cơ bản
		System.out.println("Length: " + s.length()); // Method, not field
		System.out.println("First char: " + s.charAt(0)); // Not s[0]
		System.out.println("First code: " + s.codePointAt(0));
		System.out.println("Is empty: " + s.isEmpty());
		System.out.println("Is blank: " + s.isBlank()); // Java 11
		System.out.println("Contains: " + s.contains("Vũ"));
		System.out.println("Index: " + s.indexOf("Vũ")); // lastIndexOf()

		// Biến đổi thì trả ra instance mới
		System.out.println("Uppercase: " + s.toUpperCase());
		System.out.println("Lowercase: " + s.toLowerCase());
		System.out.println("Concat: " + s.concat("."));
		System.out.println("Sub: " + s.substring(5));
			// End index nếu bỏ qua thì là cuối chuỗi
			// Không bao gồm kí tự tại end index

		// So sánh 2 String
		System.out.println("ABC".equals("ABC")); // equalsIgnoreCase()
		System.out.println("ABC".compareTo("BCD")); // compareToIgnoreCase()
			// Trả về int, với ba trạng thái so sánh với 0

		// Split thành các chuỗi con
		String s1 = "A B  C    D  ";
		System.out.println(Arrays.toString(s1.split("\s+"))); // Regex

		// String static methods
		System.out.println(String.join("-", new String[] { "A", "B" }));
		System.out.println(String.format("I'm %d", 21)); // Format string
		System.out.println("I'm %d".formatted(21)); // Cũng được

		// Các method khác
		// repeat(), startsWith(), endsWith(), lines(), intern()
		// replace(), trim(), trip(), toArray(),...
	}
}
