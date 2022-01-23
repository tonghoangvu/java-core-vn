package a_basic;

// Toán tử (operator) và toán hạng (operand)
// Phân chia toán tử theo số lượng toán hạng

public class c_Operator {
	public static void main(String[] args) {
		// Unary operator
		int a = 10;
		a = +(-a);
		++a; a++; // Pre/post increment
		--a; a--; // Pre/post decrement
		boolean b = true; // Not
		b = !b;

		// Binary operator
		// Arithmetic operators
		System.out.println(5 / 3); // Div
		System.out.println(5 % 3); // Mod

		// Phép logic (and, or, not, xor)
		// Có short-circuit evaluation
		b = !b;
		b = true ^ true; // Xor

		// Phép so sánh trả về boolean
		System.out.println(5 == 10); // ==, !=, >, >=, <, <=

		// Ternary operator có thể chained
		int num = 0;
		String msg = num == 0 ? "Zero" : num < 0 ? "Negative" : "Positive";
		System.out.println(msg);

		// Assignment operator
		num = num + 1; // +=, -=,...
		int x1, x2;
		x1 = x2 = 10; // Assign multiple variables at once
		num += x1 + x2;

		// Các phép bitwise
		// Gồm & (and), | (or), ^ (xor), ~ (complement)

		// Bit shifting: << (shift left), >> (shift right)
		// Và >>> (zero fill shift right)
		// Số dương giống nhau (do bên trái là 0)
		// Số âm thì >> giữ dấu, >>> điền 0 vào

		// Độ ưu tiên như ngôn ngữ khác
		// Không chắc chắn thì dùng () bao lại
	}
}
