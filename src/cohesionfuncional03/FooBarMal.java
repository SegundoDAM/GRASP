package cohesionfuncional03;

//Cohesion coincidental
public class FooBarMal {
	//Eso esta mal porque entre ellos no se mezclan
	 private SomeObject someObject = new SomeObject();
	 private OtherObject otherObject=new OtherObject();

	  public void firstMethod() {
	    someObject.FirstCall();
	    otherObject.oneCall();
	  }

	  public void secondMethod() {
	    someObject.SecondCall();
	  }
	  
	  public void thirdMethod() {
	    someObject.ThirdCall();
	  }
	  
	  public void oneMethod() {
		otherObject.oneCall();
	}
	  public void twoMethod() {
		otherObject.twoCall();
	}
}
