package b_oop.a_basic;

// Lớp con có thể ghi đè, tùy chỉnh lại các method ở lớp cha
// Để thực hiện thêm, hoặc thực hiện method đó theo cách riêng
// Gọi là method overriding
// Là cơ sở để thực hiện tính đa hình runtime

public class m_OverrideFinal {
	public static void main(String[] args) {
		new Whale().swim();
	}
}

class Fish {
	public int SPEED = 3;

	// Mọi method mặc định có virtual, vì luôn có thể bị ghi đè
	// Khi bị lớp con override, thì ta nói method ở lớp cha bị ẩn hiding
	public void swim() {
		System.out.println("Swimming at " + SPEED);
	}

	// Không cho override method này bằng final
	// Private method cũng không ghi đè được
	public final void die() {}
}

// Final class thì không cho class khác extends nó
final class Whale extends Fish {
	// Field chỉ cho class hiện tại, không ghi đè
	public int SPEED = 5;

	// Có thể bỏ qua @Override khi ghi đè
	// Nhưng nên có để bắt lỗi viết sai override method ở compile
	// Nếu không có, và lỡ viết override không khớp
	// Thì không báo lỗi, nhưng là overload chứ không phải override
	@Override

	// Override method cần 3 quy tắc:
	// - Khớp cấu trúc chính xác method ở lớp cha
	// - Access modifier ở lớp con phải bằng hoặc lớn hơn lớp cha
	// - Return type có thể rộng hơn lớp cha
	public void swim() {
		super.swim(); // 3, nên field không override

		// Phân biệt field của class cha nhờ super
		System.out.println("I swim faster " + (SPEED - super.SPEED));
	}
}
