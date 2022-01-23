package g_features.v05_annotation;

import java.util.ArrayList;

// Dùng thêm metadata cho class, interface, method, field
// Metadata được dùng bởi compiler hoặc JVM
// Thay thế cho XML và marker interface
// Có các built-in annotation và cũng có thể tạo riêng cho mình

public class a_Annotation {
	public static void main(String[] args) {
		test();
	}

	// Built-in annotation có 2 loại
	// Dành cho code và để tạo annotation khác
	// Gồm @Override, @FunctionalInterfaces, @SafeVarargs,...
	@Deprecated(since = "9", forRemoval = true)
	@SuppressWarnings({ "unchecked" })
	private static int test() {
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add(10);
		return list.size();
	}
}
