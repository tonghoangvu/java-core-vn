package g_features;

public class v15_SealedClass {
	public static void main(String[] args) {}
}

// Tăng tính đóng gói
// Giới hạn những class con có thể kế thừa
// Final không cho extends, sealed chỉ giới hạn
// Các class phải same package hoặc module
sealed class Dog permits BigDog, SmallDog {}

// Class con phải có final, sealed hoặc non-sealed
// - final: chặn không cho extends nữa
// - sealed: có giới hạn extends
// - non-sealed: rõ ràng công khai cho phép extends luôn
final class BigDog extends Dog {}
non-sealed class SmallDog extends Dog {}
/* ERR: sealed class RoboDog extends Dog {} */

// Tương tự cho interface
sealed interface Flyable permits AliveFlyable {}
non-sealed interface AliveFlyable extends Flyable {}
