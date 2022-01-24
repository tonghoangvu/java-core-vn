package b_oop.a_basic;

// Abstraction là hiển thị chức năng, ẩn chi tiết thực hiện
// Hoặc là chỉ quan tâm object làm được gì, không cần biết nó làm thế nào
// Đôi khi là quá trình chỉ giữ lại các info, chức năng cần thiết
// Đạt được bằng 2 cách:
// - Abstract class: trừu tượng từ 0-100%
// - Interface: trừu tượng 100%

// Khác biệt của abstract class và interface:
// - Extends chỉ 1 abstract class, implement được nhiều interface
// - Abstract class member tùy chỉnh nhiều hơn, interface bị giới hạn bớt
//  + Ví dụ: interface phải public hết, chỉ có static final field,...
// - Abstract class khi có quan hệ cha con, interface cho 1 khả năng

public class p_Abstraction {
	public static void main(String[] args) {
		// Không thể new abstract class
		// Do có thể còn abstract method chưa được implement
		/* ERR: writeAPen(new Pen()); */

		writeAPen(new Pencil());
		writeAPen(new Marker());

		// Hoặc dùng anonymous inner class tạm, không cần tạo class
		// Nên hạn chế vì Java tạo thêm 1 class nữa (ảnh hưởng hiệu suất)
		writeAPen(new Pen() {
			@Override
			public void write() {
				System.out.println("-----");
			}
		});

		// Interface tương tự abstract class, không thể new trực tiếp
		// Nhưng new lớp con hoặc anonymous inner class được (như trên)
		runSomethingCanRun(new Bus());
		runSomethingCanRun(new Tank());
	}

	// Nhờ abstraction, method này chỉ cần biết là Pen và sử dụng write()
	// Không cần quan tâm mỗi class Pen thực hiện write() như thế nào
	// Giúp tách biệt chức năng và việc triển khai chức năng đó
	private static void writeAPen(Pen pen) {
		pen.write();
	}

	private static void runSomethingCanRun(Runnable runner) {
		runner.run(100);
	}
}
