package c_exception_handling;

public class e_TryFinallyTrap {
	public static void main(String[] args) {
		// Cần tránh lỗi này khi code
		testTrap();
	}

	private static void testTrap() {
		try {
			throw new RuntimeException();
		} finally {
			// Return ở đây sẽ làm exception trên không truyền đi được
			return;
		}
	}
}
