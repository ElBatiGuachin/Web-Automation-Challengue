# language:es

Característica: Que el usuario este logueado , pueda elegir productos de la galeria y efectuar el pago
  Como usuario desea realizar la compra de los productos seleccionados al carrito luego de navegar sobre la pasarela .

  Escenario: Ingreso al portal con exito
    Dado que la web se encuentra disponible
    Cuando ingreso a la opcion de signin
    Y escribo mi correo "prueba2@gmail.com"
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
    Entonces hacer click en el boton checkout
    Y registro el nombre completo con "Abelardo Quinones Quispe"
    Y registro el telefono con "987456321"
    Y registro la direccion con "CM Punk Avenue , Street 15"
    Y registro la ciudad con "Orlando"
    Y selecciono el pais "United States"
    Y selecciono la provincia "Florida"
    Y registro codigo postal con "1859674"
    Y selecciono el Shipping Method
    Y me dirijo a pagar los pedidos
    Y elijo el metodo de pago
    Y completo los valores obtenidos de la tarjeta para procesar la compra
    Y haces clic en place order para finalizar el proceso