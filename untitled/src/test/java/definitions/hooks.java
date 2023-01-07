package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {
    public static WebDriver driver;

    @Before
    public static void setUp() //permite ejecutar codigo java de un programa o aplicacion
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver(); //se almacena el navegador en esa variable
        driver.manage().window().maximize();
    }

    @After
    public static void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
