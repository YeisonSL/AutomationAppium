package interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import tasks.EsperarPor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperarElemento implements Interaction {

    private int tryTimes;
    private Target element;


    public EsperarElemento(Target element, int tryTimes) {
        this.tryTimes = tryTimes;
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!(element.resolveFor(actor).isVisible())
                && tryTimes > 0) {
            actor.attemptsTo(EsperarPor.segundos(1));
            tryTimes = tryTimes - 1;
        }
    }

    public static EsperarElemento seaVisible(Target element, int tryTimes) {
        return instrumented(EsperarElemento.class, element, tryTimes);
    }

}
