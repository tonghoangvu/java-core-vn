package c_exception_handling;

public class b_CustomException {
	public static void main(String[] args) {
		try {
			// Chỉ bắt ở một try, có thể ném tiếp
			try {
				chia(2, 0);
			} catch (DivideException e) {
				System.err.println("Cannot divide");
				throw e; // Rethrow
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Khai báo method sẽ ném ra các checked exception này
	// Unchecked exception thì khỏi, xem thêm exception propagation
	private static double chia(double a, double b) throws DivideException, Exception {
		if (b == 0)
			// Phân biệt throw với throws
			throw new DivideException("Chia cho 0", a);
		return a / b;
	}
}

// Kế thừa phù hợp loại exception
class DivideException extends Exception {
	// Exception nên có implement Serializable
	// Vì nó có thể truyền đi mọi nơi trong app
	private static final long serialVersionUID = 1L;

	// Exception có message và cause (để link vào exception gây ra)
	// Và có thể thêm các info khác
	public double num;
	public DivideException(String message, double num) {
		super(message);
		this.num = num;
	}
}
