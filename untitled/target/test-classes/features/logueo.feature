# language:es

Característica: Ingreso a la web demo.evershop
  Como usuario necesito acceder en la plataforma para interactuar

  Escenario: Ingreso al portal con exito
    Dado que la web se encuentra disponible
    Cuando ingreso a la opcion de signin
    Y escribo mi correo "prueba1@gmail.com"
    Y escribo mi contrasena "hola1234"
    Y hago click en el boton signin
    Entonces debe dirigirme a la web autenticada