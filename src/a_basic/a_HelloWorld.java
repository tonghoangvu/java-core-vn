package a_basic;

import java.util.Scanner;

// Line comment
/// Hoặc dạng này cũng có
/*
	Block comment
	có nhiều dòng
*/
/**
 * Documentation comment
 * @author Tong Hoang Vu
 */

// Duy nhất một public (class, interface,...), trùng tên file
public class a_HelloWorld {
	// Hàm main với signature này chạy đầu tiên
	public static void main(String[] args) {
		// Khai báo biến, hằng, biểu thức
		String name = "Tong Hoang " + "Vu";
		int age = 20;
		final double SALARY = 1e-8 + .19 + 1_000_123L;

		// Nhập dữ liệu console
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		sc.nextLine(); // Chống trôi lệnh
		name = sc.nextLine();
		sc.close(); // Close cả System.in, nên chỉ dùng 1 lần

		// Xuất ra console
		System.out.println(name + ", " + age);
		System.out.printf("%.2f\n", SALARY);
	}
}
