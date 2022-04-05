# language: es
Característica: Realizar la busqueda de un producto en la app de Elenas
  Yo como usuario de Elenas
  Necesito buscar un producto
  Para ver su ganacias

  @BuscarProducto
  Escenario:  Buscar un producto
    Dado el usuario ingresa a la app
    Cuando el usuario busca el producto "Guayos para hombre blanco con negro y rojo"
    Entonces el deberia ver el precio al cliente "$56.700" con ganancias "$8.200"

