package interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import interactionloginactions.*;


public class IniciarApp implements Task {

    @Override
    @Step("{0} attemps iniciar app e iniciar session")
    public <T extends Actor> void performAs(T actor) {
       // actor.attemptsTo(WaitApp.initialized());
    }


    public static IniciarApp ok() {
        return instrumented(IniciarApp.class);
    }
}
