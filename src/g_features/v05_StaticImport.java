package g_features;

// Import thường là all hoặc 1 đối tượng
// Import static chỉ import các static member
// Giúp code gọn hơn, nhưng tránh lạm dụng, tránh bị trùng
import static java.lang.Math.sqrt;
import static java.lang.Math.PI;

public class v05_StaticImport {
	public static void main(String[] args) {
		System.out.println("Sqrt of PI: " + sqrt(PI));
	}
}
