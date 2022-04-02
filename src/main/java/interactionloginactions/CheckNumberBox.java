package interactionloginactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.LoginPage.TEXT_USER;

public class CheckNumberBox implements Interaction {

	@Override
	@Step("{0} attemps to enter credentials for the first time")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Check.whether(!TEXT_USER.resolveFor(actor).isVisible() && !TEXT_USER.resolveFor(actor).isPresent()));
	}

	public static CheckNumberBox isVisible() {
		return instrumented(CheckNumberBox.class);
	}
}
