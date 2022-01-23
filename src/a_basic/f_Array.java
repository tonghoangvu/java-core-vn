package a_basic;

import java.util.Arrays;

// Array là object (reference), được lưu trên heap
// Gồm tập hợp các element cùng kiểu, nằm kề nhau, có index từ 0
// Số lượng là cố định sau khi cấp phát, không thể thay đổi

public class f_Array {
	public static void main(String[] args) {
		// Khởi tạo array & cấp phát
		int[] a; // Hoặc int a[] giống C-like cũng được
		a = new int[5]; // Cấp phát N element, có default value

		// Hoặc khai báo, tự đếm và cấp phát luôn với array initializer
		int[] b = { 2, 3, 5, 7 };

		// Chỉ dùng được trong khai báo
		// Còn khi gán phải new (dạng mảng ẩn danh)
		/* ERR: b = { 1, 2, 3 }; */
		b = new int[] { 1, 2, 3 };

		// Mảng ẩn danh để tạo nhanh array (thường pass nhanh vào method)
		System.out.println(Arrays.toString(new int[] { 1, 2, 3 }));

		// Vài thao tác array
		// Cần thận vượt ra ngoài array là ăn ArrayIndexOutOfBoundsException
		System.out.println("Length: " + a.length); // Field, not method
		System.out.println("First: " + b[0]);
		b[b.length - 1] = 10;

		// Duyệt mảng có thể dùng for thường hoặc foreach

		// Mảng nhiều chiều, thường thấy là ma trận (2 chiều)
		// Các hàng có độ dài như nhau, hoặc khác nhau (ragged array)
		int[][] c1 = new int[2][3]; // 2 dòng 3 cột
		int[][] c2 = {
			{ 1, 2, 3 },
			{ 4, 5, 6 }
		};
		System.out.println("Số dòng: " + c1.length);
		System.out.println("Số cột: " + c2[0].length);

		// Các util static method của class Arrays
		// Như search, chuyển thành List, compare, copy, equals,...
	}
}
