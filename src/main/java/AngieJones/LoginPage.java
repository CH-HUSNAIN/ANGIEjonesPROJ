package AngieJones;

import OrangeHRM.HomePage;
import org.openqa.selenium.By;

public class LoginPage extends HomePage {
    private By username=By.xpath("//input[@id='username']");
    private By psd=By.xpath("//input[@id='password']");
    private By login=By.xpath("//button[@type='submit']");


    public SecureArea loggedIN(String nmae,String psg){
        set(username,nmae);
        set(psd,psg);
        click(login);


        return new SecureArea();
    }



}
