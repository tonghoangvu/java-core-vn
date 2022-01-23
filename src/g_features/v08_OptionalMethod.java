package g_features;

import java.util.Optional;

public class v08_OptionalMethod {
	public static void main(String[] args) {
		Optional<String> op = Optional.of("Hello");

		// Check và lấy ra value của Optional object
		// Nếu không check mà lấy thì bị NoSuchElementException
		// Nên hạn chế dùng vì sắp deprecated (thay thế bên dưới)
		if (op.isPresent())
			System.out.println("The string is " + op.get());

		// Hoặc có thể dùng các dạng sau để xử lý các trường hợp cụ thể
		// Sử dụng lambda, hướng về functional programming nhiều hơn

		// Thực hiện lệnh gì đó với value của Optional
		op.ifPresent(str -> System.out.println(str));
		op.ifPresentOrElse(System.out::println,
			() -> System.out.println("Not found"));

		// Lấy value hoặc ném exception nếu rỗng
		op.orElseThrow(); // NoSuchElementException
		op.orElseThrow(() -> new IllegalAccessError());

		// Lấy value hoặc default value
		op.orElse("Default");
		op.orElseGet(() -> "Default"); // Supplier<T>
			// Với các method tính toán phức tạp nên dùng orElseGet()
			// Vì tận dụng lazy evaluation của Supplier<T>
			// Nếu không method của phần else lúc nào cũng bị tính cả
			// Sẽ ảnh hưởng hiệu suất

		// Còn có các method stream nhưng ko cần qua stream
		// Như filter(), map(),...

		// Optional có sẵn equals(), toString(),... khá tiện dụng
	}
}
