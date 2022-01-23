package a_basic;

// Có 3 loại: biến thực thể, tĩnh và local
// Quy tắc đặt tên như các ngôn ngữ khác
// Tên biến tránh đặt là _ từ java 9 vì dùng empty lambda param
// Nhưng đặt là _x vẫn được

public class b_DataType {
	// Biến instance, static có default value
	int _instanceVar;
	static int $staticVar = 100;

	public static void main(String[] args) {
		// Local var cần phải có value trước khi sử dụng
		// Không cần init ngay khi khai báo
		int localVar = 0;
		final float PI = localVar + 3 + .14f; // final, not const
		System.out.println("PI: " + PI);

		// Kiểu số luôn có số âm
		// Kích thước kiểu cố định, không phụ thuộc env
		// Literal default là int, double, nên cần thêm hậu tố F, L,...

		// Các kiểu primitive, kích cỡ cùng tùy máy ảo
		// Số nguyên: byte (1), short (2), int (4), long (8)
		// Số thực: float (4), double (8)
		// Khác: char (2 - UTF16), boolean (1)
		byte a1 = 0;
		float a2 = a1;
		char a3 = 'A';
		char a4 = '\u0034';
		boolean a5 = a3 == a4 && a2 > a1;
		System.out.println("Final: " + a5);

		// Ép kiểu A sang B có 2 loại: mở rộng và thu gọn
		// Java ép kiểu mở rộng ngầm định
		// Ép thu gọn thực hiện thủ công (do có thể mất data)
		long a6 = 100;
		float a7 = a6; // Implicit
		a6 = (byte) a7; // Explicit
	}
}
