package definitions;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import pageobjects.productopage;
import pageobjects.comprapage;
import pageobjects.createaccountpage;
import pageobjects.loginpage;
import io.cucumber.java.PendingException;

import java.io.IOException;

public class compraDefinition {
    createaccountpage cuenta;
    loginpage logueo;
    productopage carrito;
    comprapage compra;

    public compraDefinition() {

        logueo = new loginpage();
        carrito = new productopage();
        compra = new comprapage();
        cuenta = new createaccountpage();
    }
    @Entonces("hacer click en el boton checkout")
    public void hacer_click_boton_checkout() throws IOException
    {
        compra.pagina_checkout();
    }
    @Y("registro el nombre completo con {string}")
    public void escribirnombre(String nombre)
    {
        compra.digitarnombrecompleto(nombre);
    }
    @Y("registro el telefono con {string}")
    public void escribirtelefono(String telefono)
    {
        compra.digitartelefono(telefono);
    }
    @Y("registro la direccion con {string}")
    public void escribirdireccion(String direccion)
    {
        compra.digitardireccion(direccion);
    }
    @Y("registro la ciudad con {string}")
    public void escribirciudad(String ciudad)
    {
        compra.digitarciudad(ciudad);
    }
    @Y("selecciono el pais {string}")
    public void seleccionarpais(String pais)
    {
        compra.seleccionar_pais(pais);
    }
     @Y("selecciono la provincia {string}")
    public void seleccionprovincia(String province)
     {
         compra.seleccionar_provincia(province);
     }
    @Y("registro codigo postal con {string}")
    public void escribirpostal(String postal)
    {
        compra.digitarcodigopostal(postal);
    }
    @Y("selecciono el Shipping Method")
    public void seleccionarenvio()
    {
        compra.click_radio();
    }
    @Y("me dirijo a pagar los pedidos")
    public void pagar()
    {
        compra.click_pagar();
    }
    @Y("elijo el metodo de pago")
    public void metodopago()
    {
        compra.click_metodopago();
    }
    @Y("completo los valores obtenidos de la tarjeta para procesar la compra")
    public void ingresodatostarjeta()
    {
        compra.obtenertarjeta(comprapage.numtarjeta);
        compra.obtenerfecha(comprapage.mes);
        compra.obtenerfecha(comprapage.anio);
        compra.obtenercvv(comprapage.numcvv);
    }
    @Y("haces clic en place order para finalizar el proceso")
    public void ordenarpedido()
    {
        compra.ordenarcompra();
    }
}
