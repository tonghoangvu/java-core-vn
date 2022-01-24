package b_oop.a_basic;

// Biến trong Java có 2 loại primitive và reference type:
// - Primitive là chính nó, không share state
// - Reference type có 2 phần: biến tham chiếu và object thực

// Trong Java có 2 loại vùng nhớ tương ứng:
// - Stack:
//  + Kích thước nhỏ
//  + Chứa primitive và biến tham chiếu
//  + Có cấu trúc và ổn định, nên nhanh hơn
// - Heap:
//  + Dung lượng lớn hơn stack nhiều
//  + Chứa các object data thực sự (cấp phát bằng new)
//  + Dữ liệu phân bổ khá phân mảnh, nên tốc độ chậm hơn

// Mỗi thread có một stack riêng và độc lập với nhau
// Nhưng cả JVM thì chỉ có 1 heap, dùng chung
// Nên lập trình đa luồng cần chú ý kĩ

// Trong một file có thể định nghĩa nhiều class
// Nhưng chỉ có 1 public class (có thể không có luôn)
// Và class đó phải trùng với tên file (không có phần .java)
// Java sẽ tìm class trùng tên đó và tìm main() trong đó
class Other {}

public class k_Misc {
	// Main method, entry point
	// Cấu trúc public static void (vì sao?)
	// Nhận 1 param String[] hoặc String... (như nhau)
	public static void main(String[] args) {
		// NullPointerException - The billion dollar mistake
		// Object khi chưa cấp phát thì có null value
		// Nghĩa là chưa trỏ vào đâu cả
		// Nếu mà access vào (đọc, sửa field, gọi method) thì bị NPE
		// Từ Java 14 thì JVM nó show rõ ràng biến nào null luôn
		Object o = null;
		o.toString(); // NPE here
	}
}
