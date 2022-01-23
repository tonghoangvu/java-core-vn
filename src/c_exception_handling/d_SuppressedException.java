package c_exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// https://www.baeldung.com/java-suppressed-exceptions
// Suppressed exception Là exception được ném ra
// Nhưng không biết vì sao lại bị bỏ qua
// Ví dụ ném exception trong finally, thi exception này
// Làm cho exception của try phía trên bị bỏ qua

public class d_SuppressedException {
	public static void main(String[] args) throws IOException {
		testSuppressedException();
	}

	// Ví dụ về luồng chạy:
	// - Ném ra FileNotFoundException
	// - Tới finally, lại bị ném thêm NPE
	// - Và FileNotFoundException bị bỏ rơi
	// Do đó, NPE đã suppress exception gốc là FileNotFoundException
	private static void testSuppressedException() throws IOException {
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("1.txt"); // Not found
		} catch (FileNotFoundException e) {
			throw e;
		} finally {
			fi.close();
		}
	}

	// Có thể fix lại như sau:
	// - Tạo biến lưu exception ban đầu
	// - Trong finally, thêm khối try nữa bắt exception sau
	// - Exception sau gọi addSuppressed() thêm exception trước vào
	// - Sau đó throw tiếp exception sau

	// Lúc này, exception đưa ra có kèm theo exception gốc
	// Có thể lấy được bằng getSuppressed()

	// Với try with resource hơi khác
	// Java gọi AutoCloseable.close() thì exception của close() bị suppressed
	// Exception gốc được ném ra, không phải của AutoCloseable.close()
}
