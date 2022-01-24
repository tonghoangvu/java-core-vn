package b_oop.a_basic;

// Constructor, destructor là các method đặc biệt
// Constructor luôn được gọi mỗi khi tạo object, destructor là khi hủy
// Java không có destructor
// Có thể tùy chỉnh constructor để làm một số thứ khi tạo object

// Nếu class không có constructor nào, Java tạo 1 default constructor
// Nếu có constructor bất kì, Java không tự tạo default constructor

public class f_ConstructorDestructor {
	public static void main(String[] args) {
		// Tùy đối số mà gọi 1 constructor phù hợp
		new f_ConstructorDestructor();
	}

	// Syntax của constructor:
	// - Không có return type
	// - Có tên trùng tên class

	// Constructor có 3 loại:
	// - Default (empty) constructor: không có param
	// - Parameterized constructor: có param
	// - Copy constructor: có 1 param thuộc class hiện tại

	private String message;

	public f_ConstructorDestructor() {
		// Constructor gọi constructor khác bằng this()
		// super() sẽ tìm hiểu ở bài Inheritance
		this("Hello world");
	}

	public f_ConstructorDestructor(String message) {
		this.message = message; // Phân biệt với message param
		System.out.println(message);
	}

	public f_ConstructorDestructor(f_ConstructorDestructor other) {
		// Trong ngữ cảnh này thì truy cập được private của nhau
		if (other != null)
			message = other.message;
		System.out.println(message);
	}
}
