package questions;

import exceptions.ResultNotWaitedException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.logging.Level;
import java.util.logging.Logger;

import static userinterfaces.RegistrarsePage.MSJ_COMPARAR;

public class ValidarTextoOtp implements Question<Boolean> {
    private static final Logger LOGGER = Logger.getAnonymousLogger();
    String mensjeComparar;

    public ValidarTextoOtp(String mensjeComparar) {
        this.mensjeComparar = mensjeComparar;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            MSJ_COMPARAR.resolveFor(actor).getText().equals(mensjeComparar);
            return true;
        } catch (ResultNotWaitedException ex) {
            LOGGER.log(Level.SEVERE, "No se pudo comparar mensaje: "  , ex);
            return false;
        }

    }

    public static ValidarTextoOtp esVisible(String mensajeComparar) {
        return new ValidarTextoOtp(mensajeComparar);
    }

}
