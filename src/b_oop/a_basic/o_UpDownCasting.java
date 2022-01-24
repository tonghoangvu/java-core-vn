package b_oop.a_basic;

// Đa hình có khái niệm upcasting và donwcasting
// Cả 2 đều là 1 dạng của object type casting
// Được chuyển đổi kiểu qua lại tương tự type casting

public class o_UpDownCasting {
	public static void main(String[] args) {
		// Upcasting là object lớp con được ép về class cha
		// Dùng khi khai báo có tính đa hình
		Bird bird = new BigBird(); // Upcasting
		bird.fly();

		// Downcasting là object lớp cha ép về lớp con cụ thể
		// Phải được ép kiểu tường minh
		// Nên có instanceof để check trước khi downcasting
		if (bird instanceof BigBird) {
			BigBird bigBird = (BigBird) bird; // Downcasting
			bigBird.fly();
		}

		// Nếu downcasting mà không cast được, sẽ ném ClassCastException
		BigBird bigBird = (BigBird) new Object(); // Here
		bigBird.fly();
	}
}
