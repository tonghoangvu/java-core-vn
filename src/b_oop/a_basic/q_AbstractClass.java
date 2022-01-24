package b_oop.a_basic;

public class q_AbstractClass {
	public static void main(String[] args) {}
}

// Abstract class không thể được new
abstract class Pen {
	// Abstract method không có body
	// Access modifier không được là private
	// Nên là protected, để lớp con có thể chọn ghi đè protected hoặc public
	// Nếu public abstract, thì lớp con phải là public
	protected abstract void write();

	// Abstract class có thể không chứa abstract method nào
	// Nhưng nếu có abstract method thì phải là abstract class
}

// Lớp con có thể kế thừa abstract class
//  và implement dần dần các abstract method:
// - Lớp con là non-abstract: phải implement hết
// - Lớp con là abstract: có thể implement không hoặc 1 số
class Pencil extends Pen {
	@Override
	public void write() {
		System.out.println("~~~~~");
	}
}

class Marker extends Pen {
	@Override
	public void write() {
		System.out.println("#####");
	}
}
