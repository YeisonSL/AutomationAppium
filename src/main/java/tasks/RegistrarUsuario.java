package tasks;

import interaction.Digitar;
import interaction.PresionarTecla;
import io.appium.java_client.android.nativekey.AndroidKey;
import model.RegistrarseInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.RegistrarsePage.BTN_CONTINUAR;
import static userinterfaces.RegistrarsePage.BTN_SIGUIENTE;
import static userinterfaces.RegistrarsePage.BTN_REGISTRARME;
import static userinterfaces.RegistrarsePage.TEXT_APELLIDO;
import static userinterfaces.RegistrarsePage.TXT_CELULAR;
import static userinterfaces.RegistrarsePage.TXT_CODIGO_REFERIDO;
import static userinterfaces.RegistrarsePage.TXT_CONFRIMAR_CONTRASENA;
import static userinterfaces.RegistrarsePage.TXT_CONTRSENA;
import static userinterfaces.RegistrarsePage.TXT_CORREO;
import static userinterfaces.RegistrarsePage.TXT_NOMBRE;
import static userinterfaces.RegistrarsePage.CHECK_TERMINOS_CONDICIONES;

public class RegistrarUsuario implements Task {

	private List<RegistrarseInfo> registrarseInfo;

	public RegistrarUsuario(List<RegistrarseInfo> registrarseInfo) {
		this.registrarseInfo = registrarseInfo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				EsperarPor.segundos(3),
				Click.on(BTN_REGISTRARME),
				EsperarPor.segundos(2),
				Click.on(TXT_NOMBRE),
				Enter.theValue(registrarseInfo.get(0).getNombres()).into(TXT_NOMBRE),
				Click.on(TEXT_APELLIDO),
				Enter.theValue(registrarseInfo.get(0).getApellidos()).into(TEXT_APELLIDO),
				Click.on(TXT_CELULAR),
				Enter.theValue(registrarseInfo.get(0).getCelular()).into(TXT_CELULAR),
				Click.on(TXT_CORREO),
				Enter.theValue(registrarseInfo.get(0).getCorreo()).into(TXT_CORREO),
				PresionarTecla.fisica(AndroidKey.ENTER),
				Click.on(TXT_CODIGO_REFERIDO),
				Enter.theValue(registrarseInfo.get(0).getCodigoReferencia()).into(TXT_CODIGO_REFERIDO),
				PresionarTecla.fisica(AndroidKey.ENTER),
				Click.on(CHECK_TERMINOS_CONDICIONES),
				Click.on(BTN_SIGUIENTE),
				Click.on(TXT_CONTRSENA),
				Enter.theValue(registrarseInfo.get(0).getContrasena()).into(TXT_CONTRSENA),
				Click.on(TXT_CONFRIMAR_CONTRASENA),
				Enter.theValue(registrarseInfo.get(0).getContrasena()).into(TXT_CONFRIMAR_CONTRASENA),
				Click.on(TXT_CONTRSENA),
				Click.on(BTN_CONTINUAR),
				EsperarPor.segundos(2),
				Digitar.otp(registrarseInfo.get(0).getOtpInvalido()),
				Click.on(BTN_CONTINUAR));
	}

	public static RegistrarUsuario conDatos(List<RegistrarseInfo> registrarseInfo) {
		return instrumented(RegistrarUsuario.class, registrarseInfo);
	}

}
