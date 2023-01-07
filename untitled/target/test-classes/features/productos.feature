# language:es

Característica: Elegir productos de la galeria en la web demo.evershop
Como usuario necesito acceder a la plataforma , navegar sobre la pasarela de productos y agregarlos al carrito.

  Escenario: Ingreso al portal con exito
    Dado que la web se encuentra disponible
    Cuando ingreso a la opcion de signin
    Y escribo mi correo "prueba1@gmail.com"
    Y escribo mi contrasena "hola1234"
    Y hago click en el boton signin
    Entonces debe dirigirme a la web autenticada
    Y ingreso a la opcion de compra
    Y elijo el primer producto con cantidad "4" con sus caracteristicas de talla y color
    Y regreso al portal de productos
    Y elijo el segundo producto con cantidad "2" con sus caracteristicas de talla y color
    Y vuelvo al portal de productos
    Y elijo el tercer producto con cantidad "3" con sus caracteristicas de talla y color
    #Entonces debe dirigirme a la web de pago