package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utality {
    private static WebDriver.TargetLocator SwitchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return SwitchTo().alert().getText();

    }

    public static void acceptAlert() {
        SwitchTo().alert().accept();

    }

    public static void dismissAlert() {
        SwitchTo().alert().dismiss();
    }
    public static void setalertText(String txt){
        SwitchTo().alert().sendKeys(txt);
    }
    public static void switchtoframeString(String value){
        SwitchTo().frame(value);
    }
    public static void switchtoDefaultContent(){
        SwitchTo().defaultContent();
    }
    public static void SwitchtoFrameIndex(int index){
        SwitchTo().frame(index);
    }
    public static void switchToFrameElement(WebElement element) {
        SwitchTo().frame(element);
    }

    public static void switchToWindow(String handle) {
        SwitchTo().window(handle);
    }
}
