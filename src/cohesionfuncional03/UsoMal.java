package cohesionfuncional03;

public class UsoMal {
public static void main(String[] args) {
	FooBarMal oBarMal=new FooBarMal();
	oBarMal.secondMethod();
	oBarMal.secondMethod();
	oBarMal.oneMethod();
	oBarMal.twoMethod();
	//no accede al metodo firstMethod
	
}
}
