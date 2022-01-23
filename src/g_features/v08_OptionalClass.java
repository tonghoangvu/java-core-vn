package g_features;

import java.util.Optional;

// Là wrapper class gói 1 value để tránh lỗi NPE
// Phân định rõ T (not null) và Optional<T> (nullable)
// Nhờ đó buộc code xử lý phải check null
// Ngoài Optional<T> còn có primitive OptionalInt,...

// Optional không được là null
// Optional hoặc không chứa value, hoặc chứa value not null

public class v08_OptionalClass {
	public static void main(String[] args) {
		// Tạo 1 Optional object bằng static method
		Optional<String> op = Optional.empty();
		op = Optional.ofNullable(null);
		op = Optional.ofNullable("Hi");
		op = Optional.of("Hi"); // Cần chắc chắn not null, vì sẽ bị NPE

		// Vài method cơ bản
		System.out.println("Has value: " + op.isPresent());
		System.out.println("Is empty: " + op.isEmpty());
	}

	// So sánh check null trực tiếp và thông qua Optional
	public static void test() {
		String s = "Hello";
		if (s != null) {
			System.out.println("String: " + s);
			s = null; // Có nguy cơ set null lại
			/* System.out.println("Length: " + s.length()); */
		}

		Optional<String> os = Optional.of("Hello");
		if (os.isPresent()) {
			System.out.println("String: " + os.get());
			// Khó set null vào cho os
			// Nếu set thì rõ ràng hơn nhờ of() hoặc ofNullable()
			System.out.println("Length: " + os.get().length());
		}
	}
}
