package ejercicio17CreadorSolucion;

import java.util.Map;

public class Pedido {
	public String idPedido;
	public String datos_Pedido;
	public Cliente cliente;
	public Map<String, Float> lineas;
	
	private  Float dameTotal() {
		// TODO Auto-generated method stub
		return null;
	}
	//La factura la crea Pedido porque 
	//tiene toda la informacion que neceista para crearla
	public Factura getFactura() {
		Factura factura=new Factura();
		factura.cliente=cliente;
		factura.id_Factura="8";
		factura.Total=dameTotal();
		return factura;
	}
}
