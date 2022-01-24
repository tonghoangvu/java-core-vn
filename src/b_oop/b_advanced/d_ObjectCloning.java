package b_oop.b_advanced;

// Clone là tạo object riêng rẽ, nhưng giống hoàn toàn object gốc
// Có 2 loại clone:
// - Shalow clone:
//  + Chỉ nhân bản các field là primitive
//  + Các object field (kể cả String, wrapper class) vẫn giữ tham chiếu cũ
// - Deep clone: nhân bản tất cả, kể cả các object field
// Nhược điểm của clone:
// - Implement khá phức tạp
// - Constructor không được gọi

public class d_ObjectCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		// Deep clone
		Person1 i = new Person1("Vu", 21);
		Person1 me = (Person1) i.clone();

		// Shallow clone thì String, wrapper class và Object field không copy
		// Mà vẫn giữ lại tham chiếu cũ
		System.out.println("Name copied: " + !(i.name == me.name));
		System.out.println("Value copied: " + !(i.value == me.value));
		System.out.println("Object copied: " + !(i.object == me.object));

		// Các field object không bắt buộc phải Cloneable hoặc có method clone()
		// Ví dụ như String, wrapper class làm gì có, nhưng vẫn clone được
		// Chỉ cần có cách để tạo bản sao cùng nội dung là được
		// Như copy constructor, static method return copy,...
	}
}
