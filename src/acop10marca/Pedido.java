package acop10marca;

public class Pedido {
	public String idCliente,fecha;
	public DatosFiscales datosFiscales;

	public Pedido(String idCliente, String fecha, DatosFiscales datosFiscales) {
		super();
		this.idCliente = idCliente;
		this.fecha = fecha;
		this.datosFiscales=datosFiscales;
	}
	 

}
