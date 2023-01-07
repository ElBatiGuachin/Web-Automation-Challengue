package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import pageobjects.createaccountpage;
import pageobjects.loginpage;

public class LoginDefinition {
    loginpage logueo;
    createaccountpage cuenta;

    public LoginDefinition() {
       logueo = new loginpage();
       cuenta = new createaccountpage();
    }

    @Cuando("ingreso a la opcion de signin")
    public void ingresarportal()
    {
        hooks.driver.get("https://demo.evershop.io/account/login");
    }
    @Y("hago click en el boton signin")
    public void accederalatienda()
    {
        logueo.click_login();
    }
}
