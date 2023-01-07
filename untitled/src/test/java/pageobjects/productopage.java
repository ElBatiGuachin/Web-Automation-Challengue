package pageobjects;

import definitions.hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class productopage extends util {

@FindBy(xpath = "//span[text() ='SHOP NOW']") protected WebElement btnshop;
@FindBy (xpath = "//*[@id=\"app\"]/div/main/div[2]/div[2]/div[2]/div/div[1]/div[2]/a") protected WebElement elm1;
@FindBy (xpath = "//*[@id=\"app\"]/div/main/div[2]/div[2]/div[2]/div/div[2]/div[2]/a") protected WebElement elm2;
@FindBy (xpath = "//*[@id=\"app\"]/div/main/div[2]/div[2]/div[2]/div/div[3]/div[2]/a") protected WebElement elm3;
@FindBy (xpath = "//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]/a") protected WebElement talla1zapato1;
@FindBy (xpath = "//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a") protected WebElement colorzapato1;
@FindBy (xpath = "//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]/a") protected WebElement talla2zapato2;
@FindBy (xpath = "//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a") protected WebElement color1zapato2;
@FindBy (xpath = "//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div[2]/div[1]/ul/li[2]/a") protected WebElement talla3zapato3;
@FindBy (xpath = "//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a") protected WebElement color2zapato3;
@FindBy (xpath = "//span[text() ='ADD TO CART']") protected WebElement btnagregarcarrito;
@FindBy (xpath = "//span[text() ='VIEW CART']") protected WebElement btnrevisarproductos;
@FindBy(name = "qty") protected WebElement txtboxcantidad;

    public productopage() {
        PageFactory.initElements(driver, this);
    }

    public void click_shop() {
        wait.until(ExpectedConditions.visibilityOf(btnshop));
                btnshop.click();
    }
    public void elegirproducto1() {
        elm1.click();
    }
    public void elegirqty1(String texto1)
    {
        wait.until(ExpectedConditions.visibilityOf(txtboxcantidad));
        txtboxcantidad.sendKeys(texto1);
    }
    public void caracteristicaszapato1()
    {
        talla1zapato1.click();
        colorzapato1.click();
        btnagregarcarrito.click();
    }
    public void galeriaproductos()
    {
        hooks.driver.get("https://demo.evershop.io/category/women");
    }
    public void elegirproducto2() {
        elm2.click();
    }
    public void elegirqty2(String texto2)
    {
        txtboxcantidad.sendKeys(texto2);
    }
    public void caracteristicaszapato2()
    {
        talla2zapato2.click();
        color1zapato2.click();
        btnagregarcarrito.click();
    }
    public void galeriaproductos1()
    {
        hooks.driver.get("https://demo.evershop.io/category/women");
    }
    public void elegirproducto3() {
        elm3.click();
    }
    public void elegirqty3(String texto3)
    {
        txtboxcantidad.sendKeys(texto3);
    }
    public void caracteristicaszapato3()
    {
        talla3zapato3.click();
        color2zapato3.click();
        btnagregarcarrito.click();
    }

    public void resumencompra()
    {
        btnrevisarproductos.click();
    }
}
