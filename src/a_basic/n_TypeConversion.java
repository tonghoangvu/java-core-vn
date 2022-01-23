package a_basic;

public class n_TypeConversion {
	public static void main(String[] args) {
		// Parse string thành primitive
		System.out.println(Double.parseDouble(" 200.01 ")); // Ok
		System.out.println(Boolean.parseBoolean("trUE")); // Ok

		// Từ primitve thành String:
		// - Dùng static String.valueOf() hoặc static toString()
		// - Dùng new wrapper và toString()
		String.valueOf(10);
		Integer.toString(10);
		new Integer(10).toString();

		// Đổi cơ số:
		// - Hệ X sang hệ 10: Integer.parseInt()
		// - Từ hệ 10 sang hệ X: Integer.toXXXString()
		// - Còn lại thì dùng hệ 10 làm trung gian
		String binary = "10100010";
		System.out.println(Integer.parseInt(binary, 2));
		System.out.println(Integer.toBinaryString(162));
	}
}
