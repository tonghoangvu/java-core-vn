package b_oop.a_basic;

public class b_ClassObject {
	public static void main(String[] args) {
		// Tạo object từ class bằng new
		// Hoặc một số cách khác như reflection, clone(), deserialization
		Person me = new Person("Vu", 21);

		// Object gồm biến tham chiếu và đối tượng thực trên heap
		// Ở đây tạo tham chiếu mới, nhưng vẫn chỉ có một đối tượng
		Person myself = me;

		// So sánh cùng trỏ vào 1 đối tượng
		System.out.println(me == myself);

		// Bên ngoài có thể lấy field, gọi method của object
		// Cũng tùy vào sự cho phép của access modifier
		me.hello();
		me.name = "John";
		System.out.println("Name: " + me.name);
		/* ERR: System.out.println("Age: " + me.age); */
	}
}

// Class gồm các thành phần, gọi là member, ví dụ:
// - Field: biến trong class
// - Method: phương thức, hàm trong class
// - Getter, setter, constructor
// - Nested class, inner class
// - Các block
class Person {
	// Field đại diện phần dữ liệu, có default value
	public String name;
	private int age = 18; // Có thể init ngay ở đây

	public Person(String name, int age) {
		// Trong cùng class thì các member dễ dàng truy cập lẫn nhau
		// Vài trường hợp dùng this để tránh nhầm lẫn
		this.name = name;
		this.age = age;
		hello();
	}

	// Method đại diện cho hành vi
	public void hello() {
		System.out.println(name + " " + age);
	}
}
