package b_oop.b_advanced;

// Object là class tổ tiên nhất của mọi class trong Java
// Mọi class đều extends từ Object
// Nên sẽ thừa kế những method mà Object class có

public class b_ObjectClass {
	public static void main(String[] args) {
		new Tester().test();
	}
}

class Tester extends Object {
	public void test() {
		// getClass() dùng reflection để trả về Class object
		// Chứa metadata của class của đối tượng được chọn
		// Class trả về là khi dùng new, không phải khai báo
		Object o1 = new String("Hello");
		Class<?> cls = o1.getClass();
		System.out.println("Full name: " + cls.getName()); // Có cả package
		System.out.println("Simple name: " + cls.getSimpleName());

		// toString() trả về String mô tả object hiện tại
		// Nếu không có ghi đè toString() thì mặc định là
		//  package.name.ClassName@hash_code_in_hex
		Object o2 = null;
		System.out.println(o2); // "null"
		System.out.println(new Object().toString());

		// Ngoài ra còn có các method khác:
		// - wait(), notify(), notifyAll(): dùng cho đa luồng
		// - clone(): nhân bản object, tham khảo Object cloning
	}

	// finalize() làm gì đó khi object sắp bị GC dọn
	// Từ Java 9 là bị deprecated, sắp loại bỏ vì ảnh huởng GC
	@Override
	public void finalize() {
		System.out.println("Help, GC is going to delete me");
	}
}
