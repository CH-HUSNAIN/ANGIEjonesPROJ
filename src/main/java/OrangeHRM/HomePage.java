package OrangeHRM;

import AngieJones.LoginPage;
import BaseCLASS.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By login=By.xpath("//a[normalize-space()='Form Authentication']");
    private By text=By.xpath("//h2[normalize-space()='Secure Area']");
     public LoginPage GOTOlogin(){
         click(login);

         return new LoginPage();
     }
     public String gettext(){
         return find(text).getText();
     }
}
