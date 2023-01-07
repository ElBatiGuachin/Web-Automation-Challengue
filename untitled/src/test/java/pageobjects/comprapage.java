package pageobjects;

import definitions.hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class comprapage extends util {

    public static String numtarjeta;
    public static String numcvv;
    public static String mes;
    public static String anio;

    @FindBy(xpath = "//a[@class='button primary']") protected WebElement btncheckout;
    @FindBy(name = "address[full_name]") protected WebElement txtboxname;
    @FindBy(name = "address[telephone]") protected WebElement txttelefono;
    @FindBy(name=" address[address_1]") protected WebElement txtdireccion;
    @FindBy(name = "address[city]") protected WebElement txtciudad;
    @FindBy(id = "address[country]") protected WebElement cmbpais;
    @FindBy (id ="address[province]") protected WebElement cmbprovincia;
    @FindBy (id ="address[postcode]") protected WebElement txtcodigopostal;
    @FindBy(xpath = "//*[@id=\"checkoutShippingAddressForm\"]/div[1]/div[6]/div/div/div/div/label/span[1]/span") protected WebElement rdbtn;
    @FindBy(xpath = "//span[text() ='Continue to payment']") protected WebElement btnpayment;
    //@FindBy(xpath = "//*[@id=\"checkoutPaymentForm\"]/div[2]/div[3]/div/div/div/div[1]/a/svg") protected WebElement rdbtnvisa;
    @FindBy(name = "cardnumber") protected WebElement tarjeta;
    @FindBy(name ="exp-date") protected WebElement fecexp;
    @FindBy (name = "cvc") protected WebElement cvc;
    @FindBy(xpath = "//span[text() ='Place Order']") protected WebElement orden;
    @FindBy(xpath = "//*[@id=\"checkoutPaymentForm\"]/div[2]/div[3]/div/div/div/div[1]/a/svg") protected WebElement metpago;
    @FindBy(xpath = "//*[contains(text(),'Test card number:')]") protected WebElement lbltarjeta;
    @FindBy(xpath = "//*[contains(text(),'Test card expiry:')]") protected WebElement lblexp;
    @FindBy(xpath = "//*[contains(text(),'Test card CVC:')]") protected WebElement lblcvc;
    @FindBy(xpath = "//span[text() ='Place Order']") protected WebElement btnpagofinal;

    public comprapage() {
        PageFactory.initElements(driver, this);
    }

    public void pagina_checkout() {
//       wait.until(ExpectedConditions.visibilityOf(btncheckout));
//       btncheckout.click();
        hooks.driver.get("https://demo.evershop.io/checkout");
    }
    public void digitarnombrecompleto(String texto)
    {
        txtboxname.sendKeys(texto);
    }
    public void digitartelefono(String texto1)
    {
        txttelefono.sendKeys(texto1);
    }
    public void digitardireccion(String texto2)
    {
        txtdireccion.sendKeys(texto2);
    }
    public void digitarciudad(String texto3)
    {
        txtciudad.sendKeys(texto3);
    }
    public void seleccionar_pais(String texto4) {
        new Select(cmbpais).selectByVisibleText(texto4);
    }
    public void seleccionar_provincia(String texto5) {
        new Select(cmbprovincia).selectByVisibleText(texto5);
    }
    public void digitarcodigopostal(String texto6)
    {
        txtcodigopostal.sendKeys(texto6);
    }
    public void click_radio()
    {
        rdbtn.click();
    }
    public void click_pagar()
    {
        btnpayment.click();
    }

    public void click_metodopago()
    {
        metpago.click();
    }
    public void obtenertarjeta(String numtarjeta)
    {
        wait.until(ExpectedConditions.visibilityOf(lbltarjeta));
        comprapage.numtarjeta = lbltarjeta.getText().replace("Test card number: ","");
        System.out.println(comprapage.numtarjeta);
    }
    public void obtenerfecha(String mes)
    {
        String texto[] = lblexp.getText().replace("Test card expiry: ","").split("/");
        comprapage.mes = texto[0];
        anio = texto[1];
        System.out.println(comprapage.mes);
        System.out.println(anio);
    }
    public void  obtenercvv(String numcvv)
    {
        comprapage.numcvv = lblcvc.getText().replace("Test card CVC: ","");
        System.out.println(comprapage.numcvv);
    }
    public void ordenarcompra()
    {
        btnpagofinal.click();
    }

}
