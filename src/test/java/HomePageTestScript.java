import org.junit.Test;

/**
 * Created by saadabdullah on 11/8/17.
 */
public class HomePageTestScript extends ScriptBase {

    @Test
    public void test1(){
        app.homePage().navigateToPage("file://" + System.getProperty("user.dir") + "/src/main/resources/index.html");
        app.homePage().verifyHomepage();
        app.homePage().displayItems();
        app.homePage().foodAndServings();

    }
}
