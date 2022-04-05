package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrarsePage {

    public static final Target BTN_REGISTRARME = Target.the("Boton para iniciar el registro").locatedBy("//*[@text='Registrarme']");
    public static final Target TXT_NOMBRE = Target.the("Campo para ingresar nombres").locatedBy("//*[@text='Nombre(s)']");
    public static final Target TEXT_APELLIDO = Target.the("Campo para ingresar apellidos").locatedBy("//*[@text='Apellido(s)']");
    public static final Target TXT_CELULAR = Target.the("Campo para ingresar celular").locatedBy("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='+57']]");
    public static final Target TXT_CORREO = Target.the("Campo para ingresar email").locatedBy("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*/*[@class='android.widget.EditText'])[3]");
    public static final Target TXT_CODIGO_REFERIDO = Target.the("Campo para ingresar referido").locatedBy("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*/*[@class='android.widget.EditText'])[4]");
    public static final Target CHECK_TERMINOS_CONDICIONES =Target.the("Check para aceptar los terminos y condiciones").locatedBy("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*/*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup'] and ./*[@class='android.view.ViewGroup']])[2]");
    public static final Target BTN_SIGUIENTE = Target.the("Boton para dar siguiente").locatedBy("//*[@class='android.view.ViewGroup' and ./*[@text='Siguiente']]");
    public static final Target TXT_CONTRSENA = Target.the("Campo para crear contraseña ").locatedBy("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*/*[@class='android.widget.EditText'])[1]");
    public static final Target TXT_CONFRIMAR_CONTRASENA = Target.the("Campo para confrirmar contraseña").locatedBy("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*/*[@class='android.widget.EditText'])[2]");
    public static final Target BTN_CONTINUAR = Target.the("Boton para continuar luego de crear contraseña").locatedBy("//*[@text='Continuar']");

    public static final Target TEXT_OTP1 = Target.the("Campo 1 otp").locatedBy("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@contentDescription='InputOTP'])[1]");

    public static final Target MSJ_COMPARAR = Target.the("Mensaje que pide ingresar OTP").locatedBy("//*[contains(text(),'Ingresa')]");
}
