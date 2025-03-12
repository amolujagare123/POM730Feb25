package OtherSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertsDemo {

    @Test
    public void moveMoveDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        WebElement tryItBtn = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
        tryItBtn.click();
        Thread.sleep(4000);

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
       // alert.dismiss();
        alert.accept();






    }
}
