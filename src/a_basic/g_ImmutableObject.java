package a_basic;

// Immutable object là state của object không đổi sau khi tạo
// Ví dụ trong Java có String, LocalDate, Integer,...
// Lợi ích:
// - Chia sẻ an toàn trong đa luồng (thread-safe)
// - Không có side effect
// - Ổn định, tránh lỗi khi dùng làm key hash

// Cách tạo:
// - Các field là private và final
// - Không cho ghi đè method (thường là dùng final class)
// - Chỉ đọc, không cho phép set các field
// - Không thay đổi các field object
//  + Thường cho field là immutable
//  + Hoặc clone khi lấy ra

public class g_ImmutableObject {
	public static void main(String[] args) {
		ImmutablePerson me = new ImmutablePerson("Vu", 21);
		ImmutablePerson meNextYear = me.addAge(1);
		System.out.println("Next year my age is " + meNextYear.getAge());
	}
}

final class ImmutablePerson {
	private final String name;
	private final int age;

	public ImmutablePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public ImmutablePerson addAge(int amount) {
		return new ImmutablePerson(name, age + amount);
	}
}
