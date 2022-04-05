package interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IniciarApp implements Task {

    Target elemento;

    public IniciarApp(Target elemento) {
        this.elemento = elemento;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               EsperarCarga.elemento(elemento)
               );
    }


    public static IniciarApp ok(Target elemento) {
        return instrumented(IniciarApp.class, elemento);
    }
}
