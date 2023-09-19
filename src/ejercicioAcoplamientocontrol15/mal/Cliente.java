package ejercicioAcoplamientocontrol15.mal;

public class Cliente {
    private Servicio servicio;

    public Cliente() {
        this.servicio = new Servicio();
    }

    public void realizarOperacion() {
        // Realizar operaciones específicas del cliente
        // ...
        
        // Llamar al método de la clase Servicio
        servicio.realizarOperacionServicio();
    }
}



