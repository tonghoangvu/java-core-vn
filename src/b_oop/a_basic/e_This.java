package b_oop.a_basic;

// This là keyword để chỉ tới object của class hiện tại
// Sử dụng trong khai báo class nào đó:
// - Access các instance member (non-static) cùng class
// - Gọi một constructor nào đó trong cùng class
// - Return this để đạt method chaining

public class e_This {
	public static void main(String[] args) {
		// Trong static member không dùng this

		// Sử dụng thử method chaining
		// Là cơ chế tạo các method có thể nối lại với nhau
		// Thường dùng cho Builder pattern và Stream API
		new Software()
			.next(false)
			.next(true)
			.finish();
	}
}

class Software {
	public boolean isEulaAccepted;

	public Software next(boolean isEulaAccepted) {
		// Nên hạn chế dùng this:
		// - Bình thường cùng class cứ ghi trực tiếp
		// - Trừ vài trường hợp phải có this để phân biệt
		// - Ví dụ tên field trùng tham số method
		this.isEulaAccepted = isEulaAccepted;
		return this;
	}

	public Software finish() {
		// Return this như sau để đạt method chaining
		// Method trả về class hiện tại, bên trong retunr this
		System.out.println("Done");
		return this;
	}
}
