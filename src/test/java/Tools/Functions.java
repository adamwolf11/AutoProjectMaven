package Tools;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Functions {
    public static WebDriver driver;{
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver.manage().window().maximize();
    }
    public static void srch(String x){
        driver.findElement(By.id("query")).sendKeys(x);
    }
    public static void goUrl(String URL){driver.get(URL);}
}

