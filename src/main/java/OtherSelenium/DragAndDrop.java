package OtherSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

    @Test
    public void moveMoveDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/MyProg/dragAndDrop.html");

        WebElement source = driver.findElement(By.xpath("//div[text()='India']"));
        WebElement target = driver.findElement(By.xpath("//div[text()='Drop Here']"));

        Thread.sleep(2000);

        Actions action = new Actions(driver);
        action.dragAndDrop(source,target).build().perform();





    }
}
