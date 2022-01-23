package a_basic;

// Rẽ nhánh gồm if và switch statement

public class d_Branching {
	public static void main(String[] args) {
		// Else gắn với if gần nhất
		// Nếu không phải dùng ngoặc
		if (true)
			if (Math.random() > 1)
				System.out.println("First case");
			else
				System.out.println("Second case");

		// Có thể bỏ qua else
		// Có thể chain nhiều bằng else if
		int num = 10;
		if (num > 0)
			System.out.println("Positive");
		else if (num < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");

		// Switch so sánh được expression
		// Các case cần có break để tránh bị fall-through
		int month = -1;
		switch (month + 1 - 1) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31 days");
				break;
			case 2: case 4: case 6: case 9: case 11:
				System.out.println("30 days");
				break;
			default:
				// Có thể không cần ngoặc
				System.out.println("Others");
				break;
		}
	}
}
