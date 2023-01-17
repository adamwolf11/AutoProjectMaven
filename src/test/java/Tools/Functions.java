package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Functions {
    public static WebDriver driver;
    public static  void callDriver() {
    driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
    return;
    }
    public static void findURL(String url){

        driver.get(url);
    }




}
