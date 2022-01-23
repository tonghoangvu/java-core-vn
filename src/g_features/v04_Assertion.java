package g_features;

public class v04_Assertion {
	public static void main(String[] args) {
		// Giả định điều kiện đúng là true
		// Nếu false, suy ra code sai và ném AssertionError
		// Cần dùng JVM flag --enable-assertion (-ea) để bật
		String name = "John";
		assert name != null;
		assert name.isEmpty() : "Name is required";
	}
}
