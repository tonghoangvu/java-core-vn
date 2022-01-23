package g_features;

// Java 8 cho phép interface chứa default, static method
// Dễ dàng mở rộng hơn trong khi vẫn tương thích ngược
// Ví dụ thêm Stream API vào trong Collection API
// Interface gần như thay thế, và không cần abstract class nữa

// Cũng hỗ trợ functional programming tốt hơn
// Vì functional interface sẽ có được các compose function
// Như and(), or(), compose(), andThen(),...

public class v08_InterfaceDefaultStaticMethod {
	public static void main(String[] args) {
		// Thứ tự ưu tiên khi override
		// Class implement ưu tiên nhất
		// Default method từ interface con ngược lên interface cha
	}
}

interface Runnable {
	void run(); // Abstract method

	default int speed() {
		return 0;
	}

	static String name() {
		return "Something can run";
	}
}

class Car implements Runnable {
	@Override
	public void run() {
		System.out.println(Runnable.name() + " runs at " + speed());
	}
}
