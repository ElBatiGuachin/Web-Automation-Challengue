package support;

import definitions.hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class util extends hooks {

    public static WebDriverWait wait;
    public static JavascriptExecutor js;
    public util()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
    }

    public void ventanactiva() {
        Set<String> identificadores = driver.getWindowHandles();
        for (String identificador : identificadores) {
            driver.switchTo().window(identificador);
        }
    }

    public void cerrarventana() {
        driver.close();
    }
    public void ventanainicial() {
        driver.switchTo().window("");
    }
}
