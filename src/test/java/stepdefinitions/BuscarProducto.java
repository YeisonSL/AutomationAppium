package stepdefinitions;


import exceptions.ResultNotWaitedException;
import interaction.IniciarApp;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import questions.ValidarProducto;
import tasks.Buscar;
import utils.MobileFactory;

import java.net.MalformedURLException;

import static exceptions.OtpExeption.OTP_FALLIDO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static userinterfaces.HomePage.TEXT_BUSCAR;
import static utils.PreCondiciones.DRIVER;
import static utils.PreCondiciones.USUARIO_ELENA;


public class BuscarProducto {

    @Dado("el usuario ingresa a la app")
    public void elEsuarioIngresaApp() throws MalformedURLException {
        USUARIO_ELENA.whoCan(BrowseTheWeb.with(MobileFactory.sistemaOperativo(DRIVER).enLaAppElenas()));
        USUARIO_ELENA.attemptsTo(IniciarApp.ok(TEXT_BUSCAR));
    }

    @Cuando("el usuario busca el producto {string}")
    public void elRealizaBusquedaProducto(String producto) {
        USUARIO_ELENA.attemptsTo(Buscar.producto(producto));
    }

    @Entonces("el deberia ver el precio al cliente {string} con ganancias {string}")
    public void elDeberiaVerValores(String ganacia, String totalCobrar){
        USUARIO_ELENA.should(seeThat(ValidarProducto.buscado(ganacia, totalCobrar), equalTo(true))
             .orComplainWith(ResultNotWaitedException.class, OTP_FALLIDO));
    }

}