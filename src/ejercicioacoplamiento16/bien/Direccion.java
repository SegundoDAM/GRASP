package ejercicioacoplamiento16.bien;

public class Direccion implements Addressable{
    private String calle;
    private String ciudad;
    private String estado;
    private String codigoPostal;

    public Direccion(String calle, String ciudad, String estado, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    public String getDescription() {
    	return getCalle() + ", " + getCiudad() + ", "
				+ getEstado() + ", " + getCodigoPostal();
    }
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public boolean isInTheSameStreet(String calle) {
		return getCalle().equals(calle);
	}
	

}
