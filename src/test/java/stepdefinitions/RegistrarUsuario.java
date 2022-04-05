package stepdefinitions;


import exceptions.ResultNotWaitedException;
import interaction.IniciarApp;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import model.RegistrarseInfo;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarTextoOtp;
import utils.MobileFactory;

import java.net.MalformedURLException;
import java.util.List;


import static exceptions.OtpExeption.OTP_FALLIDO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static userinterfaces.HomePage.BOTON_PERFIL;
import static utils.PreCondiciones.DRIVER;
import static utils.PreCondiciones.USUARIO_ELENA;


public class RegistrarUsuario {

     @Dado("el usuario nuevo ingresa a la app")
    public void elEsuarioIngresaApp() throws MalformedURLException {
        USUARIO_ELENA.whoCan(BrowseTheWeb.with(MobileFactory.sistemaOperativo(DRIVER).enLaAppElenas()));
        USUARIO_ELENA.attemptsTo(IniciarApp.ok(BOTON_PERFIL));
    }

    @Cuando("el realice el proceso de registro con sus datos")
    public void elRealiczaProcesoRegistroDatos(List<RegistrarseInfo> registrarseInfo) {
       USUARIO_ELENA.attemptsTo(tasks.RegistrarUsuario.conDatos(registrarseInfo));
    }

    @Entonces("el deberia ver mensaje de {string}")
    public void elDeberiaVerDensaje(String mensjeComparar){
        USUARIO_ELENA.should(seeThat(ValidarTextoOtp.esVisible(mensjeComparar), equalTo(true))
             .orComplainWith(ResultNotWaitedException.class, OTP_FALLIDO));
    }

}