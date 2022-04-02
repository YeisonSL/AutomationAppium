package exceptions;

public class ResultNotWaitedException extends AssertionError {


    public static final String COULD_NOT_SEND_FOR_MATTRESS = "No se pudo realizar el envio de dinero  de manera correcta";
    private static final long serialVersionUID = 2791624441172943184L;
    public static final String COULD_NOT_BE_RECHARGED = "No se pudo realizar la recarga celular de manera correcta";
    public static final String COULD_NOT_BE_RECHARGED_DIRECTV = "No se pudo realizar la recarga de directv de manera correcta";
    public static final String RECHARGE_BUTTON_MUST_NOT_BE_ENABLED = "Deberia estar bloqueado el boton de recargar";
    public static final String INCONSISTENCE_BETWEEN_FINACLE_BD_WITH_FRONT_NEQUI = "El saldo total que aparece en Nequi no corresponde al almacenado en la base de datos";
    public static final String A_RECHARGE_WAS_PERFORMED_WITHOUT_ENOUGH_BALANCE = "Se realizó una recarga sin saldo disponible suficiente";
    public static final String POCKET_NOT_FOUND = "El pocket de donde se iba a retirar el dinero no fue encontrado";
    public static final String DOESNT_DECREASE_BALANCE = "El saldo total no disminuyo de forma correcta con respecto al monto de la transaccion";
    public static final String DOESNT_DECREASE_BALANCE_IN_MATTRESS = "El boton de enviar esta bloqueado y no se debe enviar dinero";
    public static final String FAILURE_DATABASE_QUERY = "la consulta en la base de datos fallo";
    public static final String ELEMENT_NO_VISIBLE = "Se espera la visibilidad del  elemento %s ";
    public static final String COULD_NOT_DO_SWIPE = "No se pudo realizar el Hard Swipe mediante ADB ";
    public static final String UTILITY_NOT_FOUND = "No se pudo realizar el Hard Swipe mediante ADB ";
    public static final String SEND_MONEY_WITH_ERROR = "No se pudo realizar el envio de dinero";
    public static final String GOAL_NOT_COMPLETED = "La meta no se ha completado aun";
    public static final String NOT_CHOOSE_THIS_ELEMENT_FROM_LIST = "No se pudo encontrar el elemento en la lista";
    public static final String NOT_ENOUGH_YOUR_MONEY = "No es suficiente el dinero , para realizar la transaccion";
    public static final String COULD_NOT_PAY_LOAN_LIFE_SAVING = "No se puede hacer el pago del prestamo salvavidas";
    public static final String COULD_NOT_SENT_MONEY = "No se puedo hacer el envio del dinero al no nequi";
    public static final String GOAL_DATE_NOT_MODIFIED = "The target date was not modified";
    public static final String NOT_NULLIFIED_SENT_MONEY = "the shipment could not be cancelled";
    public static final String POCKET_NOT_CREATED = "the pocket was not created";
    public static final String ECARD_EXIST = "this account already has an assigned ecard";
    public static final String INCONSISTENCE_IN_NEW_ECARD = "the new ecard have inconsitences please verify this";
    public static final String DOESNT_INCREASE_BALANCE = "The total balance does not increase";


    public ResultNotWaitedException(String message) {
        super(message);
    }

    public ResultNotWaitedException(String message, Throwable cause) {
        super(message, cause);
    }

}
