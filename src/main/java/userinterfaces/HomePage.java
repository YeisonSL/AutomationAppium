package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target TEXT_BUSCAR = Target.the("Buscardor de la app").locatedBy("//*[@text='Buscar productos...']");
    public static final Target TEXT_BUSCAR_PRODUCTO = Target.the("Campo para escribir producto buscar").locatedBy("//*[@class='android.widget.EditText']");
    public static final Target BOTON_PERFIL = Target.the("Boton para entrar a perfil").locatedBy("//*[@text='Mi perfil']");

}
