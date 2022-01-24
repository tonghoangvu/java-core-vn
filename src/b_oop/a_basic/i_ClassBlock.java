package b_oop.a_basic;

// Trong khai báo class có thể có các init block
// Được chạy mỗi khi class/object tạo ra
// Lợi ích chưa rõ ràng, ví dụ như chạy không cần main() (trước Java 7)

public class i_ClassBlock {
	public static void main(String[] args) {
		// Static block chỉ một lần, nếu class không new thì không chạy
		// Static block chạy đầu tiên

		// Constructor luôn chạy trước, nhưng constructor gồm nhiều phần
		// Thứ tự là super(), init block, phần code còn lại
		new B();
		System.out.println();
		new B();

		// Trong method cũng có thể có code block nữa
		{
			System.out.println("Méo thể tin được");
		}
	}
}

class A {
	public A() {
		System.out.println("Super constructor");
	}
}

class B extends A {
	public B() {
		System.out.println("Constructor");
	}

	// Nếu có nhiều init block sẽ được gom lại theo thứ tự
	{
		System.out.println("Init object...");
	}

	// Nếu có nhiều static block sẽ được gom lại theo thứ tự
	static {
		System.out.println("Init class...");
	}
}
