package g_features.v05_generics;

import java.util.ArrayList;
import java.util.List;

// Giúp code 1 lần, nhưng chạy được nhiều type khác nhau
// Bằng cách tham số hóa (parameterized) type ra ngoài thành type param
// Khi sử dụng mới chỉ định type cần dùng
// Lúc này code sẽ có tính trừu tượng, chung chung (generics)

// Trước đây, nếu muốn code (class, method,...) hoạt động với nhiều type
// Thì phải dùng kiểu chung là Object và ép kiểu khi lấy ra
// Như vậy có hạn chế: phải cast, giảm type safety, rắc rối

// Nhờ có generics giải quyết được vấn đề trên
// Generics còn có thể tăng, giảm mức giới hạn cho các lớp
// Generics không dùng được primitive, do quá trình type erasure

// Generics chỉ check type ở compile-time
// Khi biên dịch các type param bị đổi thành Object (hoặc class ràng buộc)
// Đó là cơ chế type erasure
// Tương lai Valhalla project có thể cho phép primitive

public class a_Overview {
	public static void main(String[] args) {
		// Ví dụ không dùng generics (raw type, dùng Object)
		// Sẽ bị lẫn lộn, do có thể chứa các element không cùng loại
		List l1 = new ArrayList<>();
		l1.add(10);
		l1.add("20");
		System.out.println("Raw list: " + l1);

		// Ví dụ có dùng generics
		// Đảm bảo được type safety, các element luôn cùng loại
		// Mà vẫn có thể mở rộng, sử dụng được trên nhiều loại khác
		List<Integer> l2 = new ArrayList<>();
		l2.add(10);
		l2.add(20);
		System.out.println("Generics list: " + l2);
	}
}
