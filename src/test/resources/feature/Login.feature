# language: es
Característica: Realizar un registro de un usuario en la app de Elenas
  Yo como nuevo usuario de Elenas
  Necesito registrarme en la app
  Para poder realizar mis ventas

  @Login
  Escenario:  Registrar usuario nuevo en app de Elenas
    Dado el usuario nuevo ingresa a la app
    Cuando el realice el proceso de registro con sus datos
      | nombres | apellidos | celular | correo         | codigoReferencia |contrasena|
      | user    | last      | 3206671245  | user@gmail.com | 366              | 451234   |
    Entonces el deberia ver mensaje de inicio

