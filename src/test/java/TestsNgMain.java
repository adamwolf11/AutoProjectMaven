import Tools.Functions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class TestsNgMain extends Functions {

    @BeforeClass (alwaysRun = true)
    public void beforeClass(){
        Functions.goUrl("https://www.seret.co.il//");
    }

    @Test(groups = "InsertGroupName", priority = 1)
    public void test1() throws InterruptedException {
        Functions.srch("Batman");
        Thread.sleep(2000);
        Functions.srchClear();
        Functions.srch("Superman");
        Thread.sleep(2000);
    }


    @AfterClass (alwaysRun = true)
    public void afterClass() { driver.quit();}
}
