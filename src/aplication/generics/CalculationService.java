package aplication.generics;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("A lista nao pode estar vazia");
		}
		T max = list.get(0);

		for (T t : list) {
			if (t.compareTo(max) > 0) {
				max = t;
			}
		}
		return max;
	}
}
