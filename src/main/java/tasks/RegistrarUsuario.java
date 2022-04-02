package tasks;

import model.RegistrarseInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import tasksgeneric.WaitFor;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.RegistrarsePage.BOTON_SIGUIENTE;
import static userinterfaces.RegistrarsePage.BOTON_REGISTRARME;
import static userinterfaces.RegistrarsePage.CAMPO_APELLIDO;
import static userinterfaces.RegistrarsePage.CAMPO_CELULAR;
import static userinterfaces.RegistrarsePage.CAMPO_CODIGO_REFERIDO;
import static userinterfaces.RegistrarsePage.CAMPO_CORREO;
import static userinterfaces.RegistrarsePage.CAMPO_NOMBRE;
import static userinterfaces.RegistrarsePage.CHECK_TERMINOS_CONDICIONES;

public class RegistrarUsuario implements Task {

	private List<RegistrarseInfo> registrarseInfo;

	public RegistrarUsuario(List<RegistrarseInfo> registrarseInfo) {
		this.registrarseInfo = registrarseInfo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				//Click.on(BOTON_REGISTRARME),
				//SendKeys.of(registrarseInfo.get(0).getNombres()).into(CAMPO_NOMBRE),
				//SendKeys.of(registrarseInfo.get(0).getApellidos()).into(CAMPO_APELLIDO),
				//Click.on(CAMPO_CELULAR),
				//SendKeys.of(registrarseInfo.get(0).getCelular()).into(CAMPO_CELULAR),
				//SendKeys.of(registrarseInfo.get(0).getCelular()).into(CAMPO_CELULAR),
				WaitFor.seconds(25),
				SendKeys.of(registrarseInfo.get(0).getCorreo()).into(CAMPO_CORREO),
				SendKeys.of(registrarseInfo.get(0).getCodigoReferencia()).into(CAMPO_CODIGO_REFERIDO),
				Click.on(CHECK_TERMINOS_CONDICIONES),
				Click.on(BOTON_SIGUIENTE),
				WaitFor.seconds(2));
	}

	public static RegistrarUsuario conDatos(List<RegistrarseInfo> registrarseInfo) {
		return instrumented(RegistrarUsuario.class, registrarseInfo);
	}

}
