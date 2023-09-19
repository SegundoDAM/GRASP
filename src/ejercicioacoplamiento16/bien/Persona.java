package ejercicioacoplamiento16.bien;

public class Persona {
	private String nombre;
	private int edad;
	private Direccion direccion;

	public Persona(String nombre, int edad, Direccion direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public void imprimirInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Direccion: " + direccion.getCalle() + ", " + direccion.getCiudad() + ", "
				+ direccion.getEstado() + ", " + direccion.getCodigoPostal());

	}

	public boolean isInSameStreet(Direccion direccion) {
		return direccion.getCalle().equals(this.direccion.getCalle());
	}
}
