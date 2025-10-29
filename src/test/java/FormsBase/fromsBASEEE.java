package FormsBase;

import BaseCLASS.BasePage;
import Forms_Tasks_Developed.FormsPAge;
import OrangeHRM.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import static BaseCLASS.BasePage.delay;
import static Utility.Utality.SetUtilityDriver;

public class fromsBASEEE {
    private String url = "https://formy-project.herokuapp.com/form";
    private WebDriver driver;
    public HomePage homePage1;
    public BasePage basePage;
    public fromsBASEEE formBase;
    public FormsPAge formpage11;


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        formBase = new fromsBASEEE();
        SetUtilityDriver();
        homePage1 = new HomePage();
        formpage11 = new FormsPAge();
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult) {
        String folderPath = System.getProperty("user.dir") + "\\screenshot";
        if (ITestResult.FAILURE == testResult.getStatus()) {

            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File directory = new File(folderPath);
            if (!directory.exists()) {
                directory.mkdirs(); // create all missing folders
            }
            File destination = new File(System.getProperty("user.dir") +
                    "/screenshot/(" +
                    java.time.LocalDate.now() + ") " +
                    testResult.getName() + ".png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located At " + destination);
        }
    }

    @AfterClass
    public void tearDown() {
        //delay(3000);
        driver.quit();
    }

}
