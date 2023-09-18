package cohes05dedatos;

import java.util.LinkedList;
import java.util.Random;

public class RandomGenerator {
	//Propiedades
	private LinkedList<Integer> numbers;

	public RandomGenerator() {
		super();
		numbers = new LinkedList<>();
		int cantidad = 10;
		int max = 100;
		Random random = new Random();
		for (int i = 0; i < cantidad; i++) {
			numbers.add(random.nextInt(max));
		}
	}

	public LinkedList<Integer> getNumbers() {
		return numbers;
	}

	public boolean isMaxReached() {
		final int max=99;
		return max<=getTotalNumbers();
	}
	
	public int getTotalNumbers() {
		int total=0;
		for (Integer valor : numbers) {
			total+=valor;
		}
		return total;
	}

	public float getAVerageNumbers() {
		return (float) getTotalNumbers() / numbers.stream().count();
	}

	public void show() {
		numbers.stream().forEach(System.out::println);
	}
}
