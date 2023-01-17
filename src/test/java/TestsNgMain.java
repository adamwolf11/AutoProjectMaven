import Tools.Elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class TestsNgMain extends Elements {
public static WebDriver driver;






    @BeforeClass (alwaysRun = true)
    public void beforeClass(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver.get("https://www.seret.co.il//");
        driver.manage().window().maximize();
    }


    @Test(groups = "InsertGroupName", priority = 1)
    public void test1() throws InterruptedException {
    srchBtn.sendKeys("Test " + Keys.ENTER);
    }


    @AfterClass (alwaysRun = true)
    public void afterClass() {
    driver.quit();
    }
}
