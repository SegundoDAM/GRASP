package cohesionfuncional03.bien;

import org.junit.jupiter.api.Test;

public class UsoBienUno {
	@Test
	void test() {
		//No usa el primer metodo luego no tiene FooBar
		SomeObject someObject = new SomeObject();
		OtherObject otherObject = new OtherObject();
		someObject.SecondCall();
		someObject.SecondCall();
		otherObject.oneCall();
		otherObject.twoCall();
		}
}
