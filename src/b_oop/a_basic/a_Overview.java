package b_oop.a_basic;

// Programming paradism là cách phân loại các ngôn ngữ lập trình
// Một ngôn ngữ có thể hỗ trợ nhiều paradism
// Ví dụ procedural, object oriented, functional,...

// OOP - Object Oriented Programming
// Là một paradism phổ biến trong lập trình, nhiều ngôn ngữ hỗ trợ
// Chia chương trình thành các đối tượng
// Mỗi đối tượng gồm dữ liệu và hành vi
// Lợi ích: dễ code, cấu trúc code tốt hơn, an toàn và tái sử dụng

// OOP có 4 tính chất (principles hoặc core concepts):
// - Tính đóng gói (encapsulation):
//  + Kết hợp dữ liệu và hành vi có liên quan vào chung object
//  + Thực hiện data hiding nhờ các access modifier
//  + Data hiding là việc che giấu và kiểm soát mức độ truy cập với dữ liệu
// - Tính kế thừa (inheritance):
//  + Class con có thể thừa hưởng các member từ class cha
//  + Và có thể bổ sung, ghi đè lại phù hợp
//  + Giúp đạt được tính đa hình ở runtime
// - Tính trừu tượng (abstraction):
//  + Hiển thị chức năng, ẩn chi tiết thực hiện
//  + Hay biết object có thể thực hiện những gì, không quan tâm như thế nào
//  + Ngoài ra còn thể hiện ở chỗ chỉ lưu những gì cần thiết
// - Tính đa hình (polymorphism):
//  + Cùng 1 hành động, các object khác nhau có thể thực hiện khác nhau
//  + Đạt được nhờ kế thừa hoặc duck typing ở dynamic languages

// Class là khuôn mẫu, object là đối tượng thực sự
// Từ 1 class có thể tạo ra nhiều object
// Mỗi object chỉ thuộc 1 class
// Thực thể hóa (instantiation) là tạo object từ class
// Nên đôi khi object còn gọi là instance (thực thể)

public class a_Overview {
	public static void main(String[] args) {
		System.out.println("Nothing");
	}
}
