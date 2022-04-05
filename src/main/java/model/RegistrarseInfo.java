package model;

public class RegistrarseInfo {

    private String nombres ;
    private String apellidos;
    private String celular;
    private String correo;
    private String codigoReferencia;
    private String contrasena;
    private String otpInvalido;


    public RegistrarseInfo(String nombres, String apellidos, String celular, String correo, String codigoReferencia, String contrasena, String otpInvalido) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correo = correo;
        this.codigoReferencia = codigoReferencia;
        this.contrasena = contrasena;
        this.otpInvalido = otpInvalido;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCodigoReferencia() {
        return codigoReferencia;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getOtpInvalido() {
        return otpInvalido;
    }
}
