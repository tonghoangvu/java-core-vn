package b_oop.a_basic;

// Class B có thể kế thừa từ class A
// Lúc này A là super/base/parent, B là sub/derrived class
// Class B sẽ có toàn bộ member của A (cả private, nhưng không access được)
// Class B có thể ghi đè lại hoặc định nghĩa thêm member khác

// Trong Java, mọi class đều kế thừa từ Object (lớp tổ tiên)
// Java là đơn kế thừa, không hỗ trợ đa kế thừa

// Chỉ kế thừa các member sau: field, method, nested class
// Còn các block và constructor không thể kế thừa
// Vì constructor cùng tên lớp, mà tên lớp cha khác lớp con
// Tuy nhiên lớp con vẫn có thể gọi constructor lớp cha bằng super

public class l_Inheritance {
	public static void main(String[] args) {
		// Tạo object dạng thường
		Person3 i = new Person3("Vu"); // Thường
		Person3 me = new Student("Vu", "LHU"); // Đa hình
		System.out.println("I'm " + i.name);
		System.out.println(me.getClass().getName()); // Class với new

		// Dùng instanceof để check thuộc class hoặc class con
		System.out.println(i instanceof Person3);
		System.out.println(me instanceof Student);
	}
}

class Person3 {
	protected String name; // Không được private

	public Person3(String name) {
		this.name = name;
	}
}

// Extends 1 class, nếu không có thì extends Object
class Student extends Person3 {
	// Có thể định nghĩa thêm member khác
	public String school;

	public Student(String name, String school) {
		// Gọi constructor hoặc member lớp cha bằng super
		super(name);
		System.out.println(super.name);
		this.school = school;
	}
}
