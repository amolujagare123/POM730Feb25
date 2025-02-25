package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class UITestingUtil {

    public static boolean checkVisibility(WebElement element)
    {

        boolean result = false;
        try {
            result = element.isDisplayed();
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static boolean checkEnability(WebElement element)
    {

        boolean result = false;
        try {
            result = element.isEnabled();
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static String checkSpelling(WebElement element)
    {

        String result = "";
        try {
            result = element.getText();
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static String checkWatermark(WebElement element)
    {

        String result = "";
        try {
            result = element.getDomAttribute("placeholder");
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static String checkCssProperty(WebElement element,String cssProperty)
    {

        String result = "";
        try {
            result = element.getCssValue(cssProperty);
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static String checkColor(WebElement element,String cssProperty)
    {

        String color = "";
        try {
            String result = element.getCssValue(cssProperty);
            color = Color.fromString(result).asHex().toUpperCase();
        }
        catch (Exception e)
        {

        }
        return color;
    }
}
