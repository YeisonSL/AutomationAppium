package exceptions;

public class OtpExeption extends AssertionError {

    public static final String OTP_FALLIDO = "No se completo el escenario porque no se visualizo el mensaje";

    public OtpExeption(String message) {
        super(message);
    }

    public OtpExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
