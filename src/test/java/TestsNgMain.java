import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class TestsNgMain {
public static WebDriver driver;
public static Elements element;





    @BeforeClass (alwaysRun = true)
    public void beforeClass(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver.get("https://www.yad2.co.il/");
        driver.manage().window().maximize();
    }


    @Test(groups = "InsertGroupName", priority = 1)
    public void test1() throws InterruptedException {
        element.nadlan.click();
        driver.wait(2000);
    }


    @AfterClass (alwaysRun = true)
    public void afterClass() {
    driver.quit();
    }
}
