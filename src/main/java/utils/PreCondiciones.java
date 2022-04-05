package utils;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class PreCondiciones {

    public static final String DRIVER = "Emulator";

    @Managed(driver = "Appium")
    public static final Actor USUARIO_ELENA = Actor.named("Elenas");

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());

    }

}
