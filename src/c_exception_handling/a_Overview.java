package c_exception_handling;

// Cơ chế xử lý lỗi runtime, duy trì luồng chạy bình thường
// Exception là object đại diện cho lỗi bất thường ở runtime
// Exception không xử lý sẽ phá vỡ luồng bình thường, dừng app

// Tất cả kế thừa từ Throwable class:
// - Error class
//  + ... (StackOverflowError, OutOfMemoryError, VirtualMachineError,...)
// - Exception class:
//  + ... (IOException, SQLException,...)
//  + RuntimeException:
//   - ... (NullPointerException, IndexOfOfBoundsException,...)

// Chia làm 3 loại:
// - Error:
//  + Error class và các lớp con
//  + Lỗi nghiêm trọng, không thể khôi phục, nên dừng app
// - Checked exception:
//  + Exception class và các lớp con không kế thừa RuntimeException
//  + Check tại compile time (có thể ném ở runtime), có thể khôi phục dược
// - Unchecked exception:
//  + RuntimeException class và các lớp con
//  + Check tại runtime, không thể khôi phục được

public class a_Overview {
	public static void main(String[] args) {
		// Dùng bắt exception
		// Số lượng mỗi khối, khối nào được gọi khi nào
		// Mỗi catch là 1 hoặc nhóm exception class
		// Không cần thứ tự trong nhóm exception class
		try {
			int result = 5 / 0;
			System.out.println("5 / 0 = " + result);
		} catch (ArithmeticException e) {
			// Cách xử lý exception
			e.printStackTrace(); // Default in ra System.err
			e.getMessage();
			return;
		} finally {
			System.out.println("Done");
		}
	}
}
