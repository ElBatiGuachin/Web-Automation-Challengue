package definitions;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import pageobjects.productopage;
import pageobjects.comprapage;
import pageobjects.loginpage;

public class productoDefinition {
    loginpage logueo;
    productopage carrito;
    comprapage compra;

    public productoDefinition() {

        logueo = new loginpage();
        carrito = new productopage();
        compra = new comprapage();
    }
    @Y("ingreso a la opcion de compra")
    public void ingresocomprar()
        {
            carrito.click_shop();
        }
    @Y("elijo el primer producto con cantidad {string} con sus caracteristicas de talla y color")
    public void ingresocantidad1ycaracteristicas(String qty1)
    {
        carrito.elegirproducto1();
        carrito.elegirqty1(qty1);
        carrito.caracteristicaszapato1();
    }
    @Y("regreso al portal de productos")
    public void menugaleria()
    {
        carrito.galeriaproductos();
    }
    @Y("elijo el segundo producto con cantidad {string} con sus caracteristicas de talla y color")
    public void ingresocantidad2ycaracteristicas(String qty2)
    {
        carrito.elegirproducto2();
        carrito.elegirqty1(qty2);
        carrito.caracteristicaszapato2();
    }
    @Y("vuelvo al portal de productos")
    public void menugaleria1()
    {
        carrito.galeriaproductos();
    }
    @Y("elijo el tercer producto con cantidad {string} con sus caracteristicas de talla y color")
    public void ingresocantidad3ycaracteristicas(String qty3)
    {
        carrito.elegirproducto3();
        carrito.elegirqty1(qty3);
        carrito.caracteristicaszapato3();
    }
//    @Entonces("debe dirigirme a la web de pago")
//    public void paginacompra()
//    {
//        compra.pagina_checkout();
////        carrito.paginacompra();
    //}
}
