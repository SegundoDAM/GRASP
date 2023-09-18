package CohesionFuncional02.mal;

public class UsoMal {
	//ahora usoBien
public static void main(String[] args) {
	FooBarMal oBarMal=new FooBarMal();
	
	
	someMethos(oBarMal);
	
	
	otherMethos(oBarMal);
}

private static void otherMethos(FooBarMal oBarMal) {
	oBarMal.oneMethod();
	oBarMal.twoMethod();
}

private static void someMethos(FooBarMal oBarMal) {
	oBarMal.FirstMethod();
	oBarMal.SecondMethod();
	oBarMal.ThirdMethod();
}
}
