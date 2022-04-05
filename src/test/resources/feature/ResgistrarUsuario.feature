# language: es
Característica: Realizar un registro de un usuario en la app de Elenas, que ya escogio el pais y vio tuturial
  Yo como usuario de Elenas
  Necesito registrarme en la app
  Para poder realizar mis ventas

  @RegistrarUsuarioOtpInvalido
  Escenario:  Registrar usuario en app de Elenas con OTP invalido
    Dado el usuario nuevo ingresa a la app
    Cuando el realice el proceso de registro con sus datos
      | nombres | apellidos | celular    | correo         | codigoReferencia | contrasena | otpInvalido |
      | user    | last      | 3206671245 | user@gmail.com | 366              | 23102008   | 2-3-4-6     |
    Entonces el deberia ver mensaje de "Ingresa el código que hemos enviado a tú número telefónico"

