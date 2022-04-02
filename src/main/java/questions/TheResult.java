package questions;

import exceptions.ResultNotWaitedException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TheResult implements Question<Boolean> {
    private static final Logger LOGGER = Logger.getAnonymousLogger();

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            actor.attemptsTo();
            return true;
        } catch (ResultNotWaitedException ex) {
            LOGGER.log(Level.SEVERE, "no se pudo iniciar la app: "  , ex);
            return false;
        }

    }

    public static TheResult is() {
        return new TheResult();
    }

}
