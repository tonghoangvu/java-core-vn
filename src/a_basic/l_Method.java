package a_basic;

// Mọi method trong Java phải nằm trong class nào đó
// Gồm: modifiers, return type, name, params, body

public class l_Method {
	public static void main(String[] args) {
		// Params khi khai báo trên method
		// Arguments là value truyền vào khi gọi method
		// Có overload thì dựa vào đối số để gọi đúng
		System.out.println(sum(10, 0.5));

		// Argument passing
		// - Java chỉ có pass by value
		// - Primitive thì truyền bản copy vào method
		// - Reference type thì truyền bản copy của tham chiếu

		// Cách gọi method
		// - Gọi từ bên ngoài:
		//  + Static method gọi được từ class và object (không nên)
		//  + Instance method chỉ gọi được từ object
		// - Gọi trong cùng class:
		//  + Static method chỉ gọi được static method
		//  + Instance method gọi được cả instance và static method
		l_Method.sum(10, 5);
		new l_Method().sum(10, 5);
		/* ERR: l_Method.hello(); */
		new l_Method().hello();
	}

	public void hello() {
		System.out.println("Hello world");
	}

	// Method overloading là các method cùng tên
	// Các param của chúng phải khác biệt (số lượng, thứ tự,...)
	// Chỉ khác return type bị coi là giống nhau (không overload)
	public static int sum(int a, int b) {
		return a + b;
	}

	public static double sum(double a, double b) {
		return a + b;
	}
}
