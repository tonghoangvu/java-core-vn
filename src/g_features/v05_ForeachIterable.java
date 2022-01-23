package g_features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class v05_ForeachIterable {
	public static void main(String[] args) {
		// Chỉ lặp được với array, không phải String
		for (int e : new int[] { 2, 3, 5, 7 })
			System.out.print(e + "  ");
		System.out.println();

		// Hoặc lặp qua một Iterable<T>
		for (int e : List.of(1, 2, 3, 4))
			System.out.print(e + "  ");
		System.out.println();

		// Có thể định nghĩa class để dùng được với foreach
		Triple<Integer> triple = new Triple<>(2, 4, 6);
		for (int e : triple)
			System.out.print(e + "  ");
		System.out.println();
	}
}

// Implement thì dùng Iterator có sẵn
// Chứ tự implements thì khó lắm
class Triple<T> implements Iterable<T> {
	private final List<T> list = new ArrayList<>();

	public Triple(T a, T b, T c) {
		list.add(a);
		list.add(b);
		list.add(c);
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}
}
