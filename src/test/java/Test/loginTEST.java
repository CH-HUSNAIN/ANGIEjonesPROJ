package Test;

import AngieJones.AngieBase.BasetestANJIE;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTEST extends BasetestANJIE {
    @Test
    public void test(){
      var a=  homePage.GOTOlogin().loggedIN("tomsmith","SuperSecretPassword!");
      a.gettext();
        Assert.assertEquals("Secure Area","Secure Area");
    }
}
