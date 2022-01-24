package b_oop.a_basic;

// Có các trường hợp ta muốn kiểm soát nhiều hơn với dữ liệu
// Ví dụ chỉ cho phép đọc/ghi (read/write-only), hoặc validate dữ liệu
// Thì chỉ dùng access modifier không đủ
// Nhờ có getter setter sẽ thực hiện được điều đó
// Thay vì truy cập trực tiếp field, thì nhờ getter setter làm trung gian

public class d_GetterSetter {
	public static void main(String[] args) {
		Person2 p = new Person2();
		System.out.println("I'm " + p.getName());
		p.setMoney(1000);
		System.out.println("I have $" + p.getMoney());
	}
}

// Getter setter chỉ là các method đặc biệt
// Có tên là getField(), setField() với tên field tương ứng
// Mục đích thường là return field về và đặt value cho field tương ứng

// Thường thì sẽ làm như sau:
// - Ẩn field đi bằng private
// - Cung cấp getter, setter phù hợp
class Person2 {
	private String name = "Vu";
	private int money;

	// Chỉ có getter, không có setter -> chỉ đọc
	public String getName() {
		return name;
	}

	public int getMoney() {
		// Điều chỉnh dữ liệu trả về tùy ý
		return money - 10;
	}

	public void setMoney(int money) {
		// Getter setter có thể thêm logic tùy chỉnh để validate
		if (money >= 0)
			this.money = money;
	}
}
