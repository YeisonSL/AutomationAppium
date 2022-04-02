package interactionloginactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.BOTON_PERFIL;

public class WaitApp implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {

		boolean initialized = false;
		while (!initialized) {

			if (BOTON_PERFIL.resolveFor(actor).isVisible())

			{
				initialized = true;
				actor.attemptsTo(Click.on(BOTON_PERFIL));
			}
		}
	}

	public static WaitApp initialized() {
		return instrumented(WaitApp.class);
	}
}