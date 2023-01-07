package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import pageobjects.createaccountpage;
import pageobjects.loginpage;

public class createcuentaDefinition {
    createaccountpage cuenta;
    loginpage logueo;

    public createcuentaDefinition()
    {
        cuenta = new createaccountpage();
        logueo = new loginpage();
    }
    @Dado("que la web se encuentra disponible")
    public void quelawebseencuentredisponbible()
    {
        hooks.driver.get("https://demo.evershop.io/");
    }
    @Cuando ("ingreso a la opcion de signup")
    public void ingresoasignup()
    {
        hooks.driver.get("https://demo.evershop.io/account/register");
    }
    @Y("escribo mi nombre completo {string}")
    public void escribirnombre(String nombrecompleto)
    {
        cuenta.ingresar_nombre(nombrecompleto);
    }
    @Y("escribo mi correo {string}")
    public void escribircorreo(String correo)
    {
        cuenta.ingresar_correo(correo);
    }
    @Y("escribo mi contrasena {string}")
    public void escribircontrasena(String contrasena)
    {
        cuenta.ingresar_contrasena(contrasena);
    }
    @Y ("hago click en el boton")
    public void meregistro()
    {
        cuenta.click_crearusuario();
    }
    @Entonces("debe dirigirme a la web autenticada")
    public void paginaprincipal()
    {
        hooks.driver.get("https://demo.evershop.io/");
    }
}
