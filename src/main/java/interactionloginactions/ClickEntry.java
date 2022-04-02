package interactionloginactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.LoginPage.ENTRY_BUTTON;

public class ClickEntry implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTRY_BUTTON));
        ;

    }

    public static ClickEntry button() {
        return instrumented(ClickEntry.class);
    }
}
