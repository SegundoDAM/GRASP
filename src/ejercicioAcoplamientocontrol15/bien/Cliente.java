package ejercicioAcoplamientocontrol15.bien;

public class Cliente {
    private Operable operable;

    public Cliente(Operable operable) {
        this.operable = operable;
    }

    public void realizarOperacion() {
        // Realizar operaciones específicas del cliente
        // ...
        
        // Llamar al método de la clase Servicio
        operable.realizarOperacionServicio();
    }
}



