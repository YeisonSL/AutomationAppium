package interaction;

import io.appium.java_client.android.nativekey.AndroidKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Interaction {

    private String producto;
    Target elemento;

    public BuscarProducto(String producto, Target elemento){
        this.producto = producto;
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(elemento));
        actor.attemptsTo(Enter.theValue(producto).into(elemento));
        actor.attemptsTo(PresionarTecla.fisica(AndroidKey.ENTER));
    }

    public static BuscarProducto enLaApp(String producto, Target elemento) {
        return instrumented(BuscarProducto.class, producto, elemento);
    }

}
