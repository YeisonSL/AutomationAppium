package interaction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import utils.MobileFactory;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PresionarTecla implements Interaction {

    private AndroidKey tecla;

    public PresionarTecla(AndroidKey tecla){
        this.tecla = tecla;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ((AndroidDriver) MobileFactory.driver()).pressKey(new KeyEvent(tecla));
    }

    public static PresionarTecla fisica(AndroidKey tecla) {
        return instrumented(PresionarTecla.class, tecla);
    }

}
