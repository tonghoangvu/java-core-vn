package b_oop.a_basic;

import java.io.Serializable;

// Interface đại diện cho 1 nhóm hành vi, khả năng của loại đối tượng nào đó
// Interface cũng dùng đạt abstraction như abstract class

// Có vài loại interface:
// - Marker interface: rỗng, chỉ dùng đánh dấu gì đó
// - SMI hoặc SAM: functional interface (tham khảo thêm)
// - Các interface khác

// Với class là extends, còn interface là implement
// Interface cũng có thể kế thừa interface khác, lồng nhau tương tự class
// Java có một số built-in interface: Comparable, Serializable,...
// Java 8 cho phép interface chứa cả static, default method (tham khảo thêm)

public class r_Interface {
	public static void main(String[] args) {}
}

// Tên interface nên là tính từ, đuôi là Able
// Cấu trúc interface và sự biến đổi:
// - Các field auto là public static final
// - Method sẽ auto là public abstract
interface Runnable {
	int MIN_SPEED = 0; // final nên phải init
	void run(int speed);
}

// Class có thể implement nhiều interface (để sau extends)
class Bus extends Object implements Runnable, Serializable {
	// Non-abstract class thì phải implement hết
	// Còn abstract class có thể không hoặc implement 1 phần hoặc hết
	@Override
	public void run(int speed) { // Phải là public
		System.out.println("Bus is running at " + Math.max(MIN_SPEED, speed));
	}
}

// Implement 2 interface, nhưng bị trùng abstract method
// - Nếu 2 method giống hoàn toàn, chỉ implement một lần
// - Nếu chỉ giống tên nhưng khác biệt, thì lỗi và không làm gì được cả
class Tank implements Runnable {
	@Override
	public void run(int speed) {
		System.out.println("Tank is running at " + Math.max(MIN_SPEED, speed));
	}
}
