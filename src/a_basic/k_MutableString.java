package a_basic;

// Gồm 2 class StringBuilder và StringBuffer:
// - StringBuilder: dùng cho đơn luồng, nhanh hơn
// - StringBuffer: dùng cho đa luồng, chậm hơn do có synchronized
// Có tính mutable, sửa trực tiếp chuỗi mà không tạo object mới
// Hiệu suất tốt hơn cho xử lý chuỗi

public class k_MutableString {
	public static void main(String[] args) {
		// Phải khởi tạo bằng new
		StringBuilder s = new StringBuilder(10); // Capacity
		s = new StringBuilder("Hello");

		// Các method tương tự String

		// Điều chỉnh capacity
		s.ensureCapacity(100);
		s.trimToSize();
		System.out.println("Capacity: " + s.capacity()); // 102

		// Các method xử lý chuỗi mutable
		// Có thể chain lại với nhau do return this
		s.append(" world").reverse();
		s.reverse();
		s.insert(0, ">> ");
		s.delete(3, 3); // Skip end index
		System.out.println("Result: " + s);

		// StringBuilder không ghi đè equals()
		// Nên cần chuyển về toString() rồi mới equals()
		StringBuilder s1 = new StringBuilder("ABC");
		StringBuilder s2 = new StringBuilder("ABC");
		System.out.println("Wrong: " + s1.equals(s2));
		System.out.println("Right: " + s2.toString().equals(s2.toString()));

		// StringBuffer tương tự StringBuilder
	}
}
