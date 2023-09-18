package cohesionfuncional03.bien;

public class FooBar {
	//Eso esta mal porque entre ellos no se mezclan
	 private SomeObject someObject = new SomeObject();
	 private OtherObject otherObject=new OtherObject();

	  public void firstMethod() {
	    someObject.FirstCall();
	    otherObject.oneCall();
	  }

}
