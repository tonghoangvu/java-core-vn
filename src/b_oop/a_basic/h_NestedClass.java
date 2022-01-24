package b_oop.a_basic;

// Có thể khai báo class lồng bên trong class, method
// Gọi là nested class, vì trong Java class là first-class citizen

public class h_NestedClass {
	public static void main(String[] args) {
		// Khai báo kiểu chỉ cần Outer.Inner là được
		// Còn khi new mới phân biệt loại nested nào:
		// - Static nested thì đơn giản
		// - Inner class cần outer object
		new Outer.StaticInner().test();
		new Outer().new Inner().test(); // Syntax hơi lạ

		// Trong method cũng định nghĩa được class nữa
		class InsideMethod {}
		new InsideMethod();
	}
}

class Outer {
	private int value = 10;
	private static int staticValue = 20;

	// Nested class non-static gọi là inner class
	// Khi biên dịch thì thành class name là Outer$Inner
	class Inner {
		public void test() {
			// Truy cập được member của outer (cả private)
			System.out.println("Nested class (inner class)");
			System.out.println("Outer value: " + value);
			System.out.println("Outer static value: " + staticValue);
		}
	}

	static class StaticInner {
		public void test() {
			// Chỉ truy cập được static member của outer
			System.out.println("Static nested class");
			/* ERR: System.out.println("Outer value: " + value); */
			System.out.println("Outer static value: " + staticValue);
		}
	}
}

// Tương tự class, interface cũng có thể lồng nhau
interface X {
	interface Y {}
	static interface Z {}
}
