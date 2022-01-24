package b_oop.b_advanced;

import java.util.Objects;

// Class Objects cung cấp nhiều util method để xử lý object
// Như xử lý null, tính hash code, so sánh object,...

public class f_ObjectsClass {
	public static void main(String[] args) {
		nullSafeMethods();
		compareObjectMethods();

		// Tạo hash code cho all input, thường dùng khi ghi đè hashCode()
		// Tốt khi hash nhiều field của object
		// Kết quả hash tương tự Arrays.hashCode(...)
		System.out.println(Objects.hash(1, 2, true));

		// Chú ý, hash code tính ra sẽ khác với hashCode() tính của object
		Object o = "Vu";
		System.out.println(Objects.hash(o) == o.hashCode());

		// Còn có các method khác, như compare(), checkIndex(),...
	}

	private static void nullSafeMethods() {
		// Check null thôi
		System.out.println(Objects.isNull(null));

		// requireNonNull() đảm bảo object không phải null
		// Ném NPE, tùy chỉnh message, default value hoặc Supplier<T> đều có
		Object o = "Vu";
		System.out.println(Objects.requireNonNull(o, "Cannot be null"));

		// toString() để chuyển thành String an toàn null
		System.out.println(Objects.toString(null)); // "null"
		System.out.println(Objects.toString(null, "")); // Default value

		// Nếu null thì 0, còn lại trả về method hashCode()
		System.out.println(Objects.hashCode(null));
	}

	private static void compareObjectMethods() {
		// Trả về true nếu bằng nhau (đều là null hoặc equals() là true)
		System.out.println(Objects.equals(null, null));

		// Deep compare, nếu 2 input là mảng thì dùng Arrays.deepEquals()
		// Còn không thì dùng equals() của input đầu
		System.out.println(Objects.deepEquals("A", 10));
	}
}
