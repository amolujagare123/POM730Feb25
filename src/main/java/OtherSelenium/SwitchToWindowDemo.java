package OtherSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SwitchToWindowDemo {

    @Test
    public void myTest()
    {
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://facebook.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://gmail.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://google.com/");

        System.out.println(driver.getTitle());


        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());

        System.out.println(windows.size());

        driver.switchTo().window(windows.get(1));
        System.out.println(driver.getTitle());

        driver.switchTo().window(windows.get(2));
        System.out.println(driver.getTitle());
    }
}
