package a_basic;

// Package dùng gom các class, interface,... liên quan lại với nhau
// Có các package có sẵn của Java và các thư viện
// Cũng có thể tạo package cho riêng mình
// Nếu không có package thì thuộc về default package

// Import các class, interface,... của package để sử dụng
// Package java.lang được import tự động
// Các class, interface,... cùng package không cần import
import java.util.*; // Import hết
import java.util.List; // Import 1 class, interface,...
import static java.lang.Math.PI; // Import static

public class m_Package {
	public static void main(String[] args) {
		// Tên package dạng ngược với domain
		// Chữ thường toàn bộ, viết liền không phân tách
		// Các phần được tách bằng dấu chấm
		// Trong thư mục lồng nhau tương ứng từng phần của package
		List<Double> primes = new ArrayList<>();
		primes.add(PI);
		System.out.println("Primes: " + primes);

		// Không cần import nhưng phải viết rõ tên package ra
		java.util.Scanner sc = new java.util.Scanner(System.in);
		sc.close();
	}
}
