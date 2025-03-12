package OtherSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SwitchToTabDemo {

    @Test
    public void myTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://facebook.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://gmail.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com/");

        System.out.println(driver.getTitle());


        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        System.out.println(tabs.size());

        Thread.sleep(2000);
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getTitle());

        Thread.sleep(2000);
        driver.switchTo().window(tabs.get(2));
        System.out.println(driver.getTitle());
    }
}
