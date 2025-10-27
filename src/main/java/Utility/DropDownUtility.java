package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;


public class DropDownUtility extends Utality{
    private static Select findDropDown(By locator){
        return new Select(driver.findElement(locator));
    }
    public static void selectByVisibleText(By locator,String Text){
        findDropDown(locator).selectByVisibleText(Text);
    }
    public static void selectByVisibleIndex(By locator,int index){
        findDropDown(locator).selectByIndex(index);
    }
    public static void selectByVisibleValue(By locator,String value){
        findDropDown(locator).selectByValue(value);}

// here list function is added
    public static List<String> getALLSelectedOptions(By Locator){
        List<WebElement> allselectedOptons=findDropDown(Locator).getAllSelectedOptions();
        return allselectedOptons.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    public static void deselectByValue(By locator, String value) {
        findDropDown(locator).deselectByValue(value);
    }
}
