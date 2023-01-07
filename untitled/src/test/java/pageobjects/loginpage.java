package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.util;

public class loginpage extends util {
    @FindBy(name = "email") protected WebElement email;
    @FindBy(name = "password") protected WebElement contra;
    @FindBy(xpath = "//*[@class='button primary']") protected WebElement btnsignin;

    public loginpage() {
        PageFactory.initElements(driver, this);
    }

    public void ingresar_email(String texto)
    {
        email.sendKeys(texto);
    }
    public void ingresar_contrasena(String texto1)
    {
        contra.sendKeys(texto1);
    }

    public void click_login() {
        btnsignin.click();
    }

}
