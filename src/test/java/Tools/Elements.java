package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

    public static WebDriver driver;{
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver.manage().window().maximize();
}
    public static WebElement srch = driver.findElement(By.id("query"));

}
