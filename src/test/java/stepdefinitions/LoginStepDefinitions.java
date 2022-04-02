package stepdefinitions;


import interaction.IniciarApp;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import model.RegistrarseInfo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.RegistrarUsuario;

import java.util.List;
import java.util.Map;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStepDefinitions {

    @DataTableType
    public RegistrarseInfo registrarseInfoEntry(Map<String, String> entry){
        return new RegistrarseInfo(
                entry.get("nombres"),
                entry.get("apellidos"),
                entry.get("celular"),
                entry.get("correo"),
                entry.get("codigoReferencia"),
                entry.get("contrasena")
        );

    }

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario nuevo ingresa a la app")
    public void iLogin(){
    theActorCalled("User").attemptsTo(IniciarApp.ok());
    }

    @Cuando("el realice el proceso de registro con sus datos")
    public void youShouldSeeTheHome(List<RegistrarseInfo> registrarseInfo) {
       theActorInTheSpotlight().attemptsTo(RegistrarUsuario.conDatos(registrarseInfo));
    }


    @Entonces("el deberia ver mensaje de inicio")
    public void youShouldSeeTheHo(){
        //  theActorInTheSpotlight().should(seeThat(TheResult.is(), equalTo(true))
        //        .orComplainWith(ResultNotWaitedException.class, FAILED_LOGIN));
    }

}