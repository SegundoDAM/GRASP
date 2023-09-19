package invencionpura14;

import invencionpura13.PajaroEnfadado;

public class PajaraEnfadadoViewMiError implements PajaroEnfadadoView {

	@Override
	public void Mostrar(PajaroEnfadado pajaroEnfadado) {
		System.err.println(pajaroEnfadado.nombre);

	}

}
