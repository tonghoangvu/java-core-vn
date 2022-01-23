package g_features;

public class v14_SwitchExpression {
	public static void main(String[] args) {
		// Dùng switch như một expression
		// Không bị fail-through (chỉ 1 case chạy, không cần break)
		char mathPoint = 'A';
		String think = switch (mathPoint) {
			case 'A' -> "Excellent";
			case 'B', 'C' -> "Good";

			// Dạng expression phải luôn có default
			// Dạng statement thì có thể bỏ qua được
			default -> {
				System.out.println("Thinking");
				yield "Okay"; // Giống return
			}
		};
		System.out.println(think);

		// Cú pháp case cũ vẫn dùng được switch expression
		// Nhưng phải yield về value đúng cách
		char englishPoint = 'D';
		System.out.println(switch (englishPoint) {
			case 'D':
				System.out.println("Thinking");
				yield "But you're good at Math";
			default:
				yield "I don't care";
		});
	}
}
