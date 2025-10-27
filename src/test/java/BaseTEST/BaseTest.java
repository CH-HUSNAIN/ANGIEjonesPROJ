package BaseTEST;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {


    WebDriver driver;
    @BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
