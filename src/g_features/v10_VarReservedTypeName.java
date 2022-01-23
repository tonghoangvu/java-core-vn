package g_features;

import java.util.List;

// Là type name dành riêng, không phải keyword
// Thực hiện type inference (suy luận kiểu)
// Giúp code gọn hơn nhưng vẫn giữ type checking
// Các hạn chế phổ biến:
// - Không suy luận được tính đa hình
// - Không suy luận được khi null, array initializer, compound declaration,...
// - Phải có value khi khai báo
// - Chỉ dùng cho local var
// - ...

public class v10_VarReservedTypeName {
	public static void main(String[] args) {
		// Suy luận kiểu
		var myName = "Vu";
		System.out.println(myName.getClass().getName());

		// Áp dụng trong vòng lặp
		var list = List.of(2, 3, 5, 7);
		for (var element : list)
			System.out.print(element + "  ");
		System.out.println();

		// Dùng khi chỉ định modifier, annotation cho lambda param
		// Không có type hoặc var thì không khai báo được
		List.of("John").stream()
			.filter((final var name) -> !name.isEmpty())
			.count();

		// Nếu suy luận kiểu có chia nhánh
		// Khi runtime thì ra đúng kiểu
		// Nhưng compile-time thì kiểu suy ra phức tạp
		var x = Math.random() < 1 ? 10 : "Hello";
		var y = Math.random() > 1 ? 10 : "Hello";
		System.out.println(x.getClass().getName());
		System.out.println(y.getClass().getName());
	}
}
