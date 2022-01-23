package g_features;

import java.util.List;

// Extend Enum class ngầm định, không thể new
// Là final class, có thể implement interface
// Có thể có constructor, accessors, methods, field,... như class

public class v05_Enum {
	public static void main(String[] args) {
		// Enum khai báo đâu cũng được
		enum Fruit { APPLE, KIWI,; } // Trailing comma, semicolon
		System.out.println("Values: " + List.of(Fruit.values()));

		// Một enum value có thể null
		Fruit fruit = null;
		fruit = Fruit.APPLE;
		fruit = Fruit.valueOf("KIWI"); // Có ném exception, có hoa thường

		// Thông tin enum value
		System.out.println("Str: " + fruit.toString()); // Có thể ghi đè
		System.out.println("Name: " + fruit.name()); // Tên gốc
		System.out.println("Index: " + fruit.ordinal()); // Index

		// Trong switch không cần chỉ định name
		switch (fruit) {
			case APPLE:
				System.out.println("Same as me");
				break;
			default:;
		}

		// Enum có thể kèm thêm data dạng field như class
		enum Vehicle {
			BICYCLE("Bicycle", 10),
			CAR("Car", 100); // Phải có chấm phẩy để tách ra

			public final String name; // Các modifier vẫn bình thường
			public int speed;

			// Enum constructor phải private, hoặc default là private
			Vehicle(String name, int speed) {
				this.name = name;
				this.speed = speed;
			}
		}
		Vehicle vehicle = Vehicle.BICYCLE;
		System.out.println(vehicle.name + " " + vehicle.speed);
	}
}
