package cohesionfuncional03.bien;

import org.junit.jupiter.api.Test;

import CohesionFuncional02.mal.FooBarMal;

public class UsoBienDos {
	@Test
	void test() {
		SomeObject someObject = new SomeObject();
		OtherObject otherObject = new OtherObject();
		FooBar oBarMal = new FooBar();
		someObject.SecondCall();
		someObject.SecondCall();
		otherObject.oneCall();
		otherObject.twoCall();
		oBarMal.firstMethod();
		}
}
