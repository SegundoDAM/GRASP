package invencionpura14;
import invencionpura13.PajaroEnfadado;

public class PajaroEnfadadoViewConsola implements PajaroEnfadadoView {

	@Override
	public void Mostrar(PajaroEnfadado pajaroEnfadado) {
		System.out.println(pajaroEnfadado.nombre);
	}

}
