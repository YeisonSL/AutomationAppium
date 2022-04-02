package exceptions;

public class LoginException extends AssertionError {

    public static final String FAILED_LOGIN = "There was an error while user attemps to login, please verify the credentials or the service availability";
    

    public LoginException(String message) {
        super(message);
    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
