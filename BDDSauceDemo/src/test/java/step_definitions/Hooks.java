package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void openBrowser(){

        //buka browser chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");

        //inisialisasi library selenium
        driver = new ChromeDriver(co);

        String appUrl = "https://www.saucedemo.com/";
        driver.get(appUrl); //fungsi buat buka link html
        driver.manage().window().maximize(); //fungsi maxWindow browser

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
