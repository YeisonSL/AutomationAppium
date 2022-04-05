package interaction;

import io.appium.java_client.android.nativekey.AndroidKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Digitar implements Interaction {
    private String strClaveOtp;
    public Digitar(String strCalveOtp) {
        this.strClaveOtp = strCalveOtp;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        char[] otp = strClaveOtp.toCharArray();
        for (char c : otp) {
            switch (c) {
                case '0':
                    actor.attemptsTo(PresionarTecla.fisica(AndroidKey.DIGIT_0));
                    break;
                case '1':
                    actor.attemptsTo(PresionarTecla.fisica(AndroidKey.DIGIT_1));
                    break;
                case '2':
                    actor.attemptsTo(PresionarTecla.fisica(AndroidKey.DIGIT_2));
                    break;
                case '3':
                    actor.attemptsTo(PresionarTecla.fisica(AndroidKey.DIGIT_3));
                    break;
                case '4':
                    actor.attemptsTo(PresionarTecla.fisica(AndroidKey.DIGIT_4));
                    break;
                case '5':
                    actor.attemptsTo(PresionarTecla.fisica(AndroidKey.DIGIT_5));
                    break;
                case '6':
                    actor.attemptsTo(PresionarTecla.fisica(AndroidKey.DIGIT_6));
                    break;
                case '7':
                    actor.attemptsTo(PresionarTecla.fisica(AndroidKey.DIGIT_7));
                    break;
                case '8':
                    actor.attemptsTo(PresionarTecla.fisica(AndroidKey.DIGIT_8));
                    break;
                case '9':
                    actor.attemptsTo(PresionarTecla.fisica(AndroidKey.DIGIT_9));
                    break;
            }
        }
    }
    public static Digitar otp(String strClaveOtp) {
        return Tasks.instrumented(Digitar.class, strClaveOtp);
    }
}