package invencionpura14;

import org.junit.jupiter.api.Test;

import invencionpura13.PajaroEnfadado;

class PajaroEnfadadoPresenterTest {

	@Test
	void test() {
		PajaroEnfadado pajaroEnfadado = new PajaroEnfadado();
		PajaroEnfadadoView pajaroEnfadadoView = new PajaroEnfadadoViewConsola();
		PajaroEnfadadoPresenter pajaroEnfadadoPresenter = new PajaroEnfadadoPresenter(pajaroEnfadadoView,
				pajaroEnfadado);
		pajaroEnfadadoView = new PajaraEnfadadoViewMiError();
		pajaroEnfadadoPresenter = new PajaroEnfadadoPresenter(pajaroEnfadadoView, pajaroEnfadado);
	}

}
