package b_oop.a_basic;

// Member trong class chia 2 loại: static và non-static
// Static là thuộc về class, non-static thuộc về từng object (của class đó)
// Vài ngôn ngữ không có static, thì dùng companion object như Kotlin
// Static thường dùng:
// - Hằng số, data chia sẻ của các object cùng 1 class
// - Làm util method, gọi mà không cần tạo object (như Math class)

public class g_Static {
	public static int wheelCount = 4;
	public String brand = "BMW";

	public static void main(String[] args) {
		// Gọi static member qua tên class (bỏ qua nếu cùng class)
		// Gọi non-static member qua tên object (bỏ qua nếu cùng class)
		testStatic();
		g_Static.testStatic();
		new g_Static().testStatic();
			// Cũng gọi được static từ object, nhưng không nên
		new g_Static().testNonStatic();

		// Static member ở lớp cha trừ khi là private
		// Thì lớp con cũng có thể gọi trực tiếp như của mình
	}

	// Trong cùng class:
	// - Static method chỉ access được static member (cả ở các lớp cha)
	// - Non-static method access được cả static và non-static member

	public static void testStatic() {
		// Static member không dùng với this
		/* ERR: System.out.println(this.brand); */
		System.out.println(wheelCount);
		testOtherStatic();
	}

	public static void testOtherStatic() {}

	public void testNonStatic() {
		// Instance method access được cả static và non-static member
		System.out.println(this.brand);
		System.out.println(wheelCount);
	}

	// Static member còn có thể là: nested class/interface, block
	static class X {}
	static interface Y {}
	static {}
}
