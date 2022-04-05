package questions;

import exceptions.ResultNotWaitedException;
import interaction.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.logging.Level;
import java.util.logging.Logger;

import static userinterfaces.BuscarProducto.LBL_GANACIA;
import static userinterfaces.BuscarProducto.LBL_TOTAL_COBRAR;

public class ValidarProducto implements Question<Boolean> {
    private static final Logger LOGGER = Logger.getAnonymousLogger();
    String mensjeGanacia;
    String mensajeTotalCobrar;

    public ValidarProducto(String mensjeGanacia, String mensajeTotalCobrar) {
        this.mensjeGanacia = mensjeGanacia;
        this.mensajeTotalCobrar = mensajeTotalCobrar;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(EsperarElemento.seaVisible(LBL_GANACIA, 10));
        try {
            LBL_GANACIA.resolveFor(actor).getText().equals(mensjeGanacia);
            LBL_TOTAL_COBRAR.resolveFor(actor).getText().equals(mensajeTotalCobrar);
            return true;
        } catch (ResultNotWaitedException ex) {
            LOGGER.log(Level.SEVERE, "No se pudo comparar mensaje de los algun valor: "  , ex);
            return false;
        }

    }

    public static ValidarProducto buscado(String mensjeGanacia, String mensajeTotalCobrar) {
        return new ValidarProducto(mensjeGanacia,mensajeTotalCobrar);
    }

}
