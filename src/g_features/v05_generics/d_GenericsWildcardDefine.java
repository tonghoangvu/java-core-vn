package g_features.v05_generics;

import java.io.Serializable;

// Định nghĩa có thể giới hạn các type mà type param nhận được
// Giới hạn được với class và interface
// Định nghĩa chỉ giới hạn được bằng extends
// Nghĩa là không giới hạn super (lower bound) được

// Các class chung để demo
class X {}
class XX extends X {}
class XXX extends X implements Serializable {}

// Định nghĩa generics class hay method cũng không super được
class X1<T> {}
class X2<T extends X> {}
class X3<T extends X & Serializable> {}

class Test {
	public static <T> void test1() {};

	// Upper bound dùng extends, class này trở xuống lớp con
	public static <T extends X> void test2() {}

	// Multiple upper bounds (phải là upper) một list (phép AND)
	// Class phải đứng đầu, rồi mới tới interface
	public static <T extends X & Serializable> void test3() {}
}
