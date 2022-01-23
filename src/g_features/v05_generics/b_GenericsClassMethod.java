package g_features.v05_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Có thể tạo class với generics
// Bằng cách khai báo class sử dụng một hoặc nhiều type param
// Các type param này khi sử dụng thì chỉ định sau
// Mỗi type param thường là 1 kí tự đại diện
// T (type), E (element), K (key), V (value), R (return), X (exception)

public class b_GenericsClassMethod {
	public static void main(String[] args) {
		// Khi dùng generics class cần chỉ định đầy đủ các type param
		MyStack<Double, String> s = new MyStack<>();
		s.push(2.0);

		// Dùng generics method viết rõ ra hoặc để jaba suy luận type cũng được
		MyStack.<Integer>printArray(2, 3, 5, 7);
		MyStack.printArray(2, 3, 5, 7);
			// Static method không cần chỉ định type param cho class
	}
}

// Các type param xem như type trong phạm vi generics class
// Type param làm kiểu cho param hoặc return type đều được
class MyStack<T, U> {
	private List<T> elements = new ArrayList<>();

	public void push(T t) {
		elements.add(t);
	}

	public T get(Class<T> cls) throws Exception {
		// Type param không thể new được, muốn new phải dùng reflection
		T t = cls.getDeclaredConstructor().newInstance();
		return t;
	}

	// Method cũng có thể generics, mà không cần class là generics
	// Đặt khai báo type param trước return type là được
	@SafeVarargs
	public static <E> void printArray(E... elements) {
		System.out.println(Arrays.toString(elements));
	}
}
