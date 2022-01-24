package b_oop.a_basic;

// Tính đa hình là cùng một hành động, các object khác nhau sẽ thực hiện
//  nó theo cách khác nhau
// Có hai dạng:
// - Static polymorphism: overloading methods hoặc operators
// - Dynamic polymorphism: overriding methods
// Các dynamic language có thể dùng duck typing để có đa hình

// Method binding là gắn lời gọi method với body cần thực thi
// Cũng có 2 dạng, tương ứng 2 loại đa hình:
// - Static binding:
//  + Biết được chính xác method nào sẽ được gọi ở compile-time
//  + Nên lời gọi private, final, static method luôn là static binding
// - Dynamic binding:
//  + Method được gọi chỉ biết được ở runtime
//  + Khi compile thì compiler không (hoặc khó) xác định
//  + Khi có lời gọi, JVM tìm ở lớp hiện tại ngược lên
//  + Cho tới khi tìm thấy method phù hợp
//  + Dùng cho các virtual method

public class n_Polymorphism {
	public static void main(String[] args) {
		// Đa hình tĩnh chỉ là method overloading, không nói tới

		// Đa hình động như sau:
		// - Khai báo type cùng class (được xem là cùng loại)
		// - Nhưng new với class hiện tại hoặc class con cụ thể
		// Thì khi gọi method (ở base chung)
		// Tùy vào lớp nào được new mà sẽ thực hiện method khác nhau
		Bird smallBig = new Bird();
		Bird bird = new BigBird();
		smallBig.fly();
		bird.fly();
	}
}

class Bird {
	public void fly() {
		System.out.println("Bird is flying");
	}
}

class BigBird extends Bird {
	@Override
	public void fly() {
		System.out.println("Big bird is flying");
	}
}
