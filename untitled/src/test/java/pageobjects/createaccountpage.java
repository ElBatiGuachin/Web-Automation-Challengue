package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class createaccountpage extends util {
    @FindBy(name = "full_name") protected WebElement nombrecompleto;
    @FindBy(name = "email") protected WebElement correo;
    @FindBy(name = "password") protected WebElement contrasena;
    @FindBy(xpath = "//*[@class='button primary']") protected WebElement btnsignup;

    public createaccountpage() {
        PageFactory.initElements(driver, this);
    }

    public void ingresar_nombre(String texto1)
    {
        wait.until(ExpectedConditions.visibilityOf(nombrecompleto));
        nombrecompleto.sendKeys(texto1);
    }

    public void ingresar_correo(String texto2)
    {
        correo.sendKeys(texto2);
    }
    public void ingresar_contrasena(String texto3)
    {
        contrasena.sendKeys(texto3);
    }

    public void click_crearusuario() {
        btnsignup.click();
    }
}
