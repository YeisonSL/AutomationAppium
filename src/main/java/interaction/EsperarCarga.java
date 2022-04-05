package interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.BOTON_PERFIL;


public class EsperarCarga implements Interaction {

	Target elemento;

	public EsperarCarga(Target elemento) {
		this.elemento = elemento;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		boolean initialized = false;
		while (!initialized) {

			if (elemento.resolveFor(actor).isVisible())

			{
				initialized = true;
				actor.attemptsTo(Click.on(elemento));
			}
		}
	}

	public static EsperarCarga elemento(Target elemento) {
		return instrumented(EsperarCarga.class, elemento);
	}
}