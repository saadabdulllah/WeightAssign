import org.openqa.selenium.WebDriver;
import sun.security.ssl.HandshakeOutStream;

/**
 * Created by saadabdullah on 11/8/17.
 */
public class ApplicationController {

    private WebDriver driver;
    private HomePage homePage;

    public ApplicationController(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage(){
        if(homePage==null){
            homePage = new HomePage(driver);
        }
        return homePage;
    }
}
