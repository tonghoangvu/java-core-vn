package a_basic;

public class e_Loop {
	public static void main(String[] args) {
		// For gồm init, condition, increment và statements (đều có thể bỏ qua)
		// Init chạy đầu tiên và chỉ 1 lần
		// Sau đó mỗi lần lặp thì check condition, thực hiện lệnh và increment
		int i = 0;
		for (; i < 4; i += 2)
			System.out.println(i);

		// Có foreach cho iterable object (array, collection,...)
		// Chỉ lấy value, không lấy được index
		// Không dùng được với String
		String name = "Vu";
		for (char ch : name.toCharArray()) // Phải chuyển thành char[]
			System.out.println(ch);

		// Khác nhau giữa do while và while do
		// Thứ tự hoạt động, số câu lệnh ít nhất
		while (i < 3) i--;
		do { i++; } while (i <= 5);

		// Vừa gán vừa so sánh luôn
		double j;
		while ((j = Math.random()) > 0.1)
			System.out.println(j);

		// Break và continue
	}
}
