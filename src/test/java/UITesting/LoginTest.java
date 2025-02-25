package UITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenURL;

import static util.UITestingUtil.*;

public class LoginTest extends OpenURL {

   Login login;

   @BeforeClass
   public void initLogin()
   {
       login = new Login(driver);
   }

 /*  @Test
   public void txtUsernameVisibilityCheck()
   {

       boolean expected = true;
       boolean actual = false;
       try {
            actual = login.txtUsername.isDisplayed();
       }
       catch (Exception e)
       {

       }

       Assert.assertEquals(actual,expected,"element not visible");

   }*/

    @Test
    public void txtUsernameVisibilityCheck()
    {
        boolean expected = true;
        boolean actual = checkVisibility(login.txtUsername);
        Assert.assertEquals(actual,expected,"element not visible");
    }


    @Test
    public void txtPasswordVisibilityCheck()
    {
        boolean expected = true;
        boolean actual = checkVisibility(login.txtPassword);
        Assert.assertEquals(actual,expected,"element not visible");
    }

    @Test
    public void txtUsernameEnabilityCheck()
    {
        boolean expected = true;
        boolean actual = checkEnability(login.txtUsername);
        Assert.assertEquals(actual,expected,"element not enabled");
    }


    @Test
    public void txtPasswordEnabilityCheck()
    {
        boolean expected = true;
        boolean actual = checkEnability(login.txtPassword);
        Assert.assertEquals(actual,expected,"element not enabled");
    }


    @Test
    public void lblEmailSpellCheck()
    {
        String expected = "Email";
        String actual = checkSpelling(login.lblEmail);
        Assert.assertEquals(actual,expected,"Spelling is incorrect");
    }

    @Test
    public void lblPasswordSpellCheck()
    {
        String expected = "Password";
        String actual = checkSpelling(login.lblPassword);
        Assert.assertEquals(actual,expected,"Spelling is incorrect");
    }
    @Test
    public void txtUsernameWatermark()
    {
        String expected = "Email";
        String actual = checkWatermark(login.txtUsername);
        Assert.assertEquals(actual,expected,"Watermark is incorrect");
    }

    @Test
    public void txtPasswordWatermark()
    {
        String expected = "Password";
        String actual = checkWatermark(login.txtPassword);
        Assert.assertEquals(actual,expected,"Watermark is incorrect");
    }

    @Test
    public void lblEmailFontSizeCheck()
    {
        String expected = "14px";
        String actual = checkCssProperty(login.lblEmail,"font-size");
        Assert.assertEquals(actual,expected,"Watermark is incorrect");
    }

    @Test
    public void lblEmailFontCheck()
    {
        String expected = "-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual = checkCssProperty(login.lblEmail,"font-family");
        Assert.assertEquals(actual,expected,"Watermark is incorrect");
    }

    @Test
    public void btnLoginColorCheck()
    {
        String expected = "#2C8EDD";
        String actual = checkColor(login.btnLogin,"background-color");
        Assert.assertEquals(actual,expected,"Watermark is incorrect");
    }



}
