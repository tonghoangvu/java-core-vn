package g_features;

public class v16_Record {
	public static void main(String[] args) {
		Person me = new Person("Vu", 20);
		System.out.println(me);

		// Get field bằng method cùng tên field
		System.out.println("Hello " + me.name());
	}
}

// Compact syntax cho immutable data
// Có constructor, accessors, equals(), hashCode(), toString()
// Không extends class, có thể implement interface
// Là final, các field cũng final, không thể là abstract
record Person(String name, int age) {
	// Có thể có compact constructor
	// Chạy sau default constructor
	public Person {
		if (age < 0)
			throw new IllegalArgumentException("Wrong age");
	}

	// Có thể có static field (field instance thì không)
	public static int SALARY = 100;

	// Có thể có instance method và static method
	public void introduce() {
		System.out.println(name + " " + age);
	}

	public static void hello() {
		System.out.println("Hello");
	}
}
