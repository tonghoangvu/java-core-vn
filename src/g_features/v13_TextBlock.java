package g_features;

public class v13_TextBlock {
	public static void main(String[] args) {
		// Chuỗi đa dòng, có escape sequence, chưa có nội suy biến
		// Phải xuống dòng khi mở chuỗi
		// Khi end phải nằm ở cuối dòng trên
		// Lề trái bị trim cho tới cột ít nhất
		String message = """
			There's a \t "tab" key
				And this line has one indent""";
		System.out.println(message);
	}
}
