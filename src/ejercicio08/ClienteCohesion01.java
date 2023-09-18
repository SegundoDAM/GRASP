package ejercicio08;

import org.junit.jupiter.api.Test;

public class ClienteCohesion01 {
	int[] numbers={ 1, 2, 3, 4, 5 };
	
	@Test
	public void test01() {
		String name = "John";
		CohesionExample01 example = new CohesionExample01(numbers, name);

		example.printNumbers();
		example.printName();
		example.calculateSum();
	}
	@Test
	public void test02() {
		CohesionExample01 example02 = new CohesionExample01(numbers, "");
		example02.calculateSum();
	}
}
