package g_features;

public class v14_PatternMatchingForInstanceof {
	public static void main(String[] args) {
		// Tự động check và cast thành biến mới
		Object obj = "Hello";
		if (obj instanceof String str)
			System.out.println("String: " + str);

		// Biến tạo ra chỉ thuộc scope của if block
		/* ERR: System.out.println("Length: " + str.length()); */

		// Instanceof có thể cast thành biến final
		if (obj instanceof final Boolean boo) {
			/* ERR: boo = true; */
		}

		// Không đảo ngược điều kiện được (chỉ hoạt động trường hợp true)
		// Null sẽ cho instanceof là false
	}
}
