package a_basic;

// Là reference type mô tả chuỗi kí tự
// Có tính immutable, thay đổi sẽ tạo ra object String mới
// Gồm 3 class: String (immutable), StringBuilder và StringBuffer (mutable)

public class h_String {
	public static void main(String[] args) {
		// Khởi tạo String: 2 cách
		// - Gán chuỗi (nên dùng):
		//  + Cho vào String pool nếu chưa có
		//  + Trả tham chiếu của nó trong pool
		// - Dùng new:
		//  + Tạo vùng nhớ riêng trên heap
		//  + Cũng được thêm vào string pool
		//  + Trả tham chiếu ở vị trí trên heap
		String s1 = "ABC\t"; // Escape sequence
		String s2 = new String("ABC\t");
		System.out.println(s1 == s2); // Khác vị trí (pool và heap)
		System.out.println(s1.equals(s2)); // Cùng nội dung
		System.out.println(s1.equalsIgnoreCase(s2)); // Case insensitive
		System.out.println(s1.contentEquals(s2)); // CharSequence interface
		System.out.println(s1 == s2.intern()); // Cùng trong pool

		// String pool là vùng nhớ trên heap ở runtime
		// Chứa tất cả các string literal trong chương trình
		// Giúp tiết kiệm bộ nhớ, nhờ hạn chế trùng lặp (chuỗi dùng phổ biến)
		// Khi chạy, các string literal trong class sẽ được auto add vào pool
		String s3 = "Tong Hoang " + "Vu";
		System.out.println(s3);

		// Mỗi object đều có toString() để mô tả, có thể override lại
		// Các method toString() này không tự add vào string pool
		// Phải add thủ công bằng String.intern()

		// Default trước Java 9, String luôn dùng char[] UTF-16
		// Java 9 có Compact string, chỉ dùng UTF-16 khi cần
		// Chuyển đổi dùng giữa byte[] UTF-8 và char[] UTF-16
		// Giúp tiết kiệm bộ nhớ hơn và giảm tải cho GC
	}
}
