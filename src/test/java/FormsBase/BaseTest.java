package FormsBase;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class BaseTest extends fromsBASEEE {

    public void test() {
        formpage11.enterDeatails("ch", "husnain", "bussniessman");
        formpage11.selectRdio("5-9");
        formpage11.selectCheckboc();
        formpage11.SumitButon();

        String b = formpage11.getText1();
        String a = "Thanks for submitting your forms";
        Assert.assertEquals(a, b);
    }

    public void Test2() {

    }
}
