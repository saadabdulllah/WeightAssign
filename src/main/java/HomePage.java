import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by saadabdullah on 11/8/17.
 */
public class HomePage {


    WebDriver driver;
    Map<String , String> map;

    @FindBy(xpath = "//span[text()='Apple butter']")
    WebElement homepageActualResultText;

    @FindAll(@FindBy(xpath = "//div[@class='itemContent']/span[text()='Applesauce, unsweetened ' or text()='Juice, Cranberry-apple drink']"))
    List<WebElement> itemList;

    @FindAll(@FindBy(xpath = "//div[@class='itemContent']/span[@class='description ng-binding']"))
    List<WebElement> foodandServingList;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToPage(String url){
        driver.navigate().to(url);
    }

    public void verifyHomepage(){

        String actual = homepageActualResultText.getText();
        String expected = "Apple butter";
        Assert.assertEquals(expected, actual);
    }

    public void displayItems(){
        for(WebElement element : itemList){
            System.out.println(element.getText());
        }
    }

    public void processData(String[] strings){
        String key = strings[0];
        String value = strings[1];
        Map<String, String> map = new HashMap<String, String>();
        map.put(key, value);

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void foodAndServings(){

        String[] keyValue = null;

       for(int i = 0; i < foodandServingList.size(); i++){
           processData(foodandServingList.get(i).getText().split(" "));
       }
    }


}
