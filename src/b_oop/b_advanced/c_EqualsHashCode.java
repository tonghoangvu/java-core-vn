package b_oop.b_advanced;

import java.util.Objects;

public class c_EqualsHashCode {
	public static void main(String[] args) {
		Person me = new Person("Vu", 21);
		Person you = new Person("Vu", 21);
		System.out.println(me.equals(you));
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override // Nên có để bắt lỗi override sai
	public boolean equals(Object obj) {
		// Cùng một đối tượng
		if (obj == this) return true;

		// Khác đối tượng và tránh null
		if (obj == null) return false;

		// Tránh khác loại, nên dùng getClass() hơn instanceof
		// Vì instanceof vẫn chấp nhận cả object của subclass
		if (!(obj instanceof Person)) return false;
		if (obj.getClass() != this.getClass()) return false;

		// Cast và so sánh các field
		// Với float, double thì dùng static compare method
		// Primitive khác thì dùng ==
		// Object thì dùng Objects.equals() để tránh null (java 7)
		Person person = (Person) obj;
		return Integer.compare(person.age, age) == 0 &&
			Objects.equals(person.name, name);
	}

	// hashcode() để tính hash code của object, thường ghi đè cùng equals()
	@Override
	public int hashCode() {
		// Hash mặc định các identity fields
		return Objects.hash(name, age);
	}
}
