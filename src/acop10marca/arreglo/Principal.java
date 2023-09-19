package acop10marca.arreglo;

public class Principal {
	public static void main(String[] args) {
		DatosFiscales datosFiscales = new DatosFiscales("22", "manan");
		// Hay una estructura de datos comun
		Cliente cliente = new Cliente("1", "Dimitri", datosFiscales);
		Pedido pedido = new Pedido(cliente.id, "hoy");
		Cliente clienteById = new ClienteRepositorio().getClienteById(pedido.idCliente);
		DatosFiscales datosFiscales2 = cliente.datosFiscales;
	}
}
