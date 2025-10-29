package Forms_Tasks_Developed;

import OrangeHRM.HomePage;
import org.openqa.selenium.By;

import static Utility.DropDownUtility.selectByVisibleText;
import static Utility.JavaScriptUtility.clickJS;
import static Utility.JavaScriptUtility.scrollToElementJS;

public class FormsPAge extends HomePage {
    private By name = By.xpath("//input[@id='first-name']");
    private By lname = By.xpath("//input[@id='last-name']");
    private By job = By.xpath("//input[@id='job-title']");
    private By rdioBTN = By.xpath("//input[@id='radio-button-3']");
    private By chkbox = By.xpath("//input[@id='checkbox-1']");
    private By drpdpown = By.xpath("//select[@id='select-menu']");
    private By datetime = By.xpath("//input[@id='datepicker']");
    private By submitBTN = By.xpath("//a[normalize-space()='Submit']");
    private By txt=By.xpath("//h1[normalize-space()='Thanks for submitting your form']");

    public void enterDeatails(String nmae, String Lnmae, String JOB) {
        set(name, nmae);
        set(lname, Lnmae);
        set(job, JOB);
    }

    public void selectRdio(String txt) {
        selectByVisibleText(drpdpown, txt);
    }

    public void selectCheckboc() {
        if (!find(chkbox).isSelected()) {
            scrollToElementJS(chkbox);
            clickJS(chkbox);
        }


    }

    public void selectdate() {


    }

    public void SumitButon() {
        click(submitBTN);
    }
public String getText1(){
        delay(3000);
        return find(txt).getText();
}
}
