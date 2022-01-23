package g_features;

import java.io.FileOutputStream;
import java.util.Scanner;

// Trước đây khởi tạo, check lỗi và đóng resource quá phức tạp
// Phải dùng try catch finally, check null, close,...
// Đặc biệt khi có nhiều resource cùng lúc

// Try with resource giúp tự động close resource
// Khi hết try hoặc có lỗi thì resource được auto đóng
// Resource class phải implements AutoCloseable > Closeable interface

public class v07_TryWithResource {
	public static void main(String[] args) {
		// Resource có scope trong toàn bộ try {}
		// Java 7 phải khai báo và khởi tạo ngay trong try ()
		// Java 9 về sau cho phép ở ngoài và dẫn reference vào
		Scanner scanner = new Scanner(System.in);
		try (
			scanner; // Dẫn vào
			var file = new FileOutputStream("1.txt");
		) {
			file.write("Hello".getBytes());

			// Biến resource phải là final hoặc effectively final
			// Nghĩa là code không được đổi reference của biến resource
			/* ERR: scanner = null; */
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Done");
		}

		// Java gọi AutoCloseable.close() thì exception của close() bị suppressed
		// Exception gốc được ném ra, không phải của AutoCloseable.close()
		// Xem thêm bài SuppressedException
	}
}
