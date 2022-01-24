package b_oop.a_basic;

// Tính đóng gói là việc gom các thuộc tính và hành vi liên quan
// Vào chung cùng một object
// Sử dụng các access modifier để thực hiện data hiding
// Data hiding ẩn dữ liệu và kiểm soát mức độ truy cập vào object

public class c_Encapsulation {
	public static void main(String[] args) {
		Person1 p = new Person1();
		/* ERR: System.out.println("I'm " + p.name); */
		p.hello();
	}
}

// Các modifier là các keyword trước class, hoặc class member
// Để bổ sung ngữ nghĩa thêm cho chúng
// Modifier gồm access modifier và các modifier khác

class Person1 {
	// Access modifier gồm 4 mức:
	// - private: dùng nội bộ trong class
	// - protected: class hiện tại, lớp con hoặc cùng package
	// - public: mọi nơi đều truy cập được
	// - default (no keyword): chỉ cùng package
	private String name = "Vu";

	public void hello() {
		// Access modifier chỉ có tác dụng với bên ngoài class
		// Trong cùng class vẫn truy cập được bình thường
		System.out.println("Hello, I'm " + name);
	}
}
