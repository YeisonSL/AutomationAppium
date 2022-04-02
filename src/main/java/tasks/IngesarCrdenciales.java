package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.LoginPage.*;
import interaction.WaitForElement;
import interactionloginactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import tasksgeneric.WaitFor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngesarCrdenciales implements Task {
	private String user;
	private String pass;

	public IngesarCrdenciales(String user, String pass) {
		this.user = user;
		this.pass = pass;

	}

	@Override
	@Step("{0} attemps to login in CT ")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(WaitForElement.visibility(TEXT_USER, 2));
		actor.attemptsTo(Enter.theValue(user).into(TEXT_USER));
		actor.attemptsTo(Click.on(TEXT_PASS));
		actor.attemptsTo(Enter.theValue(pass).into(TEXT_PASS));
		actor.attemptsTo(WaitFor.seconds(2));
		actor.attemptsTo(ClickEntry.button());

	}

	public static IngesarCrdenciales login(String user, String pass) {
		return instrumented(IngesarCrdenciales.class, user, pass);
	}

}
