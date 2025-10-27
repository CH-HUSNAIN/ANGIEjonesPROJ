package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtilty extends Utality{
    private static Actions act(){
        return new Actions(driver);
    }
    public static void draganddrop(WebElement source ,int x,int y){
        act().dragAndDropBy(source,x,y).perform();
    }
    public static void sendkeys(WebElement source,CharSequence keys){
        act().sendKeys().sendKeys(source,keys).perform();
    }
}
