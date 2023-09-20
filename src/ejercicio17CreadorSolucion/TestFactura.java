package ejercicio17CreadorSolucion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactura {

	@Test
	void test() {
		Cliente cliente=new Cliente();
		cliente.nombre="Fermin";
		Pedido pedido=new Pedido();
		pedido.cliente=cliente;
		Factura factura=pedido.getFactura();
	}

}
