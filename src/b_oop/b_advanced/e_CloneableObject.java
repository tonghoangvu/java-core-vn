package b_oop.b_advanced;

// Cloneable là marker interface, để triển khai object cloning

public class e_CloneableObject {
	public static void main(String[] args) {}
}

// Gọi clone() mà class không implement Cloneable
// Thì bị ném CloneNotSupportedException
class Person1 implements Cloneable {
	public String name;
	public int age;
	public Integer value;
	public CloneableClass object;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
		value = 100000; // Tránh wrapper pool
		object = new CloneableClass();
	}

	// Default clone() là protected, cần mở rộng thêm ra public để dùng
	// Phải return về Object mới đúng override (nếu không chả sao cả)
	@Override
	public Object clone() throws CloneNotSupportedException {
		// Default clone() là cho ra bản shallow clone
		// Với class có all fields là primitive thì shallow clone là được
		Person1 copy = (Person1) super.clone();

		// Để thành deep clone thì cần thực hiện clone thêm các field
		// Bằng new object mới hoặc dùng clone() và cast nếu field có
		copy.name = new String(name);
		copy.value = Integer.valueOf(value);
		copy.object = (CloneableClass) object.clone();
		return copy;
	}
}

class CloneableClass implements Cloneable {
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
