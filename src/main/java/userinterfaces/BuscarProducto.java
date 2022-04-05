package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarProducto {

    public static final Target PRODUCTO= Target.the("Producto buscado").locatedBy("//*[contains(text(),'GUAYOS')]");
    public static final Target LBL_GANACIA = Target.the("Texto que indica las ganacias").locatedBy("//*[@text='$8.200']");
    public static final Target LBL_TOTAL_COBRAR = Target.the("Texto de valor a cobrar").locatedBy("//*[@class='android.widget.EditText']");
}
