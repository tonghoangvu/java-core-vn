package g_features;

import java.util.ArrayList;
import java.util.List;

public class v07_Misc {
	public static void main(String[] args) {
		// Java 7 - Switch case với string
		switch ("OK") {
			case "OK":
				System.out.println("OK");
		}

		// Java 7 - Multi-catch block
		try {
			int x = 5 / 0;
			System.out.println("5 / 0 = " + x);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// e trong multi-catch block không gán lại được
			/* ERR: e = null; */
			e.printStackTrace();
		}

		// Java 7 - Diamond operator cho suy luận kiểu generics
		List<Byte> l1 = new ArrayList<Byte>();
		List<Byte> l2 = new ArrayList<>(); // Diamond operator

		// Java 7 - Cú pháp hằng số mới
		byte b1 = -0b0101 + 0B001; // 0b hoặc 0B prefix
		long x = 100_000_000L;
		System.out.println(b1 + x + l1.size() + l2.size());
	}
}
