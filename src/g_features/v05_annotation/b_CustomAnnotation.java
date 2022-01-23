package g_features.v05_annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class b_CustomAnnotation {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// Nếu chỉ có 1 thuộc tính thì default là value
		// Thuộc tính array 1 phần tử có thể bỏ qua {}

		// Reflection không thể lấy được metadata từ local var
		System.out.println(b_CustomAnnotation.class
			.getDeclaredMethod("test")
			.getAnnotation(MyAnnotation.class)
			.value());
	}

	@MyAnnotation(value = "Vu", nums = 2)
	private static void test() {}
}

// Chỉ định annotation áp dụng lên đâu
@Target({ ElementType.TYPE, ElementType.METHOD })

// Phạm vi áp dụng:
// - SOURSE: khi biên dịch
// - CLASS: cho compiler
// - RUNTIME: cho JVM
@Retention(RetentionPolicy.RUNTIME)

@Documented // Thêm docs annotation vào docs của đối tượng
@Inherited // Lớp con cũng auto có
// Ngoài ra còn có @Native, @Repeatable,...

@interface MyAnnotation {
	// Field chỉ được public, static, hoặc final
	static int DEFAULT_AGE = 18;

	// Thuộc tính không có default là bắt buộc
	// Viết dạng method không body, không tham số, không exception
	String value();
	int[] nums();
	int age() default DEFAULT_AGE;
}
