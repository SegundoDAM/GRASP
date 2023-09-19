package ejercicioacoplamiento16.bien;

public class Persona {
	private String nombre;
	private int edad;
	private Addressable address;

	public Persona(String nombre, int edad, Addressable direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.address = direccion;
	}

	public void imprimirInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Direccion: " + address.getDescription());

	}

	public boolean isInSameStreet(String calle) {
		return address.isInTheSameStreet(calle);
	}
}













