package c_exception_handling;

import java.io.IOException;

// Cách truyền exception trong callstack
// Ném ra exception ở top, dừng method và truyền xuống dưới
// Nếu trôi xuống main thì chương trình bị stop
// Nếu có khối try catch bắt lại thì sẽ dừng

// Unchecked exception được auto forward xuống
// Checked exception thì bị giới hạn trong method ném ra
// Do đó, cần throws để exception đi ra khỏi method
// Sau đó có ném nữa không thì tùy method kia

public class c_ExceptionPropagation {
	public static void main(String[] args) {}
}

// Ghi đè method với exception, cần nhớ:
// - Ở lớp cha no exception, lớp con không thể có checked exception
// - Ở lớp cha có exception, lớp con không thể có exception tổ tiên hơn cha
// Còn lại lớp con có thể không có, giống hoặc có exception con cháu hơn cha

class A {
	public void test1() {}
	public void test2() throws IOException {}
	public void test3() throws IOException {}
	public void test4() throws IOException {}
}

class B extends A {
	@Override
	public void test1() throws RuntimeException {}

	/* @Override
	public void test1() throws Exception {} */
}

class C extends A {
	@Override
	public void test2() {}

	@Override
	public void test3() throws IOException, RuntimeException {}

	/* @Override
	public void test4() throws Exception {} */
}
