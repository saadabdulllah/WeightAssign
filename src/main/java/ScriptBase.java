import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by saadabdullah on 11/8/17.
 */
public class ScriptBase {

    WebDriver driver = null;
    ApplicationController app;

    @Before
    public void setUp(){
        ChromeDriverManager.getInstance().arch32().setup();
        driver = new ChromeDriver();
        app = new ApplicationController(driver);

    }


    @After
    public void tearDown(){
       /* if(driver != null){
            driver.close();
            driver.quit();
        }*/
    }
}
