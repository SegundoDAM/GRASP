package cohes06temporal;

public class Bussines {
	private PrinterPool printerPool=new PrinterPool();
	private SesssionPool sesssionPool=new SesssionPool();
	private SGBD sgbd=new SGBD();
	
	public boolean startSystem() {
		//no importa el orden pero esta mejor cohesionada que la procedimental
		return printerPool.begin()&&sesssionPool.init()&&sgbd.start();
	}
}
