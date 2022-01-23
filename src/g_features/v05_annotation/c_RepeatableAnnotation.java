package g_features.v05_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

// Giúp đánh nhiều annotation cùng loại trên 1 đối tượng
// Annotation đó cần có @Repeatable và annotation chứa
// Java cung cấp cú pháp syntax sugar để thực hiện dễ dàng hơn

// Trước đây mỗi annotation chỉ được đánh 1 lần
// Phải dùng 2 annotations lồng vào nhau như này
// @Schedules(value = {
//     @Schedule(dayOfMonth="last"),
//     @Schedule(dayOfWeek="Fri", hour="23")
// })

public class c_RepeatableAnnotation {
	@Naming("PI")
	@Naming("Math.PI")
	private double NUMBER = 3.14;

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		var annotations = Arrays.asList(c_RepeatableAnnotation.class
			.getDeclaredField("NUMBER")
			.getAnnotationsByType(Naming.class)); // Lấy nhiều annotations
		annotations.stream()
			.map(Naming::value)
			.forEach(System.out::println);
	}
}

// Annotation cùng nhau cần 1 số param giống nhau
// Ví dụ @Documented, @Target,... cần, còn @Retention thì không
@Repeatable(List.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Naming {
	String value();
}

// Có thể khai báo trong, ngoài annotation con đều được
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface List {
	Naming[] value();
}
