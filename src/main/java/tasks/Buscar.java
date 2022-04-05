package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.BuscarProducto.PRODUCTO;
import static userinterfaces.HomePage.TEXT_BUSCAR_PRODUCTO;

import interaction.BuscarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Buscar implements Task {
	private String producto;

	public Buscar(String producto) {
		this.producto = producto;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				BuscarProducto.enLaApp(producto, TEXT_BUSCAR_PRODUCTO),
				EsperarPor.segundos(10),
				Click.on(PRODUCTO));
	}

	public static Buscar producto(String producto) {
		return instrumented(Buscar.class, producto);
	}

}
