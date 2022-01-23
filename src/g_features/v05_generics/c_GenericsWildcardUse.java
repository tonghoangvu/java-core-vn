package g_features.v05_generics;

// Chú ý, dùng generics có 2 phần: định nghĩa và sử dụng
// Định nghĩa thì dùng type param, có thể không hoặc có bounds
// Sử dụng thì dùng:
// - Một type cụ thể nào đó thay vào type param
// - Một ? wildcard, có thể có hoặc không có bounds

public class c_GenericsWildcardUse {
	public static void main(String[] args) {
		// Dùng generics class thì:
		// - Lúc khai báo thì dùng ? wildcard được
		// - Còn khởi tạo phải chỉ định type cụ thể
		// - Không khai báo wildcard ? với multiple bound được
		X1<? extends Object> x1 = null;
		/* ERR: new X1<? extends Object>(); */
		/* ERR: X1<? extends Object & Serializable> x2; */

		// Có 2 bounds ở định nghĩa và khai báo sử dụng
		// Thuộc 3 loại sau:
		// - Một type cụ thể
		// - Any type: T, ?, Object
		// - Nửa khoảng: T, ? có bounds
		// Chỉ cần giao nhau là được, còn không thì báo lỗi
		X3<? extends Object> x2 = null; // -> T extends X & Serializable
		X3<? extends X> x3 = null; // -> T extends X & Serializable
		X3<? extends XX> x4 = null; // -> T extends X & Serializable
		System.out.println(x1 + " " + x2 + " " + x3 + " " + x4);

		// Super thì giới hạn hơn, dù có giao nhau (X) nhưng vẫn lỗi
		/* ERR: X3<? super X> x6; */ // -> T extends X & Serializable

		// Dùng generics method tương tự khi khởi tạo generics
		// Không dùng wildcard ? được, mà phải chỉ định type
		// Type không khớp định nghĩa thì sẽ báo lỗi
		/* ERR: Test.<Object>test2(); */
		/* ERR: Test.<XX>test3(); */
		Test.<XXX>test3();
	}
}
