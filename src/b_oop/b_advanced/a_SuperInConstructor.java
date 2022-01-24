package b_oop.b_advanced;

// Vài trường hợp đặc biệt liên quan tới constructor
// Khi nào thì phỉa chỉ định constructor, khi nào thì không
// Và cách Java tự động thêm super() vào đầu constructor

public class a_SuperInConstructor {
	public static void main(String[] args) {
		// Lớp cha không có empty constructor
		// Java không tự thêm super() vào được (vì có đâu)
		// Lớp con phải viết constructor và tự gọi super(...) phù hợp
		new B1();

		// Lớp cha có empty constructor
		// Constructor ngầm định Java tạo cũng tự động super()
		// Constructor lớp con được tự động thêm super() ở đầu
		// Nếu lớp con có dòng super(...) khác thì Java không thêm super()
		new B2();
		new B2(0);
	}
}

// Không có empty constructor
class A1 {
	public A1(int value) {
		System.out.println("A1 constructor with 1 param");
	}
}

class B1 extends A1 {
	public B1() {
		// Phải call super(...) rõ ràng (đứng đầu tiên)
		super(123);
		System.out.println("B1 constructor");
	}
}

// Có empty constructor và 1 constructor tùy chỉnh
class A2 {
	public A2() {
		System.out.println("A2 constructor");
	}

	public A2(int value) {
		System.out.println("A2 constructor with 1 param");
	}
}

class B2 extends A2 {
	public B2() {
		// Tự động có super() ở đầu
		System.out.println("B2 constructor");
	}

	public B2(int value) {
		// Nếu gọi super khác rồi thì không auto thêm super()
		super(value);
		System.out.println("B2 constructor with 1 param");
	}
}
