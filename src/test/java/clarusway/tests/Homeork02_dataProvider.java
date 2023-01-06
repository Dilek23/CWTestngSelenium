package clarusway.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilites.BaseCrossBrowserTest;

public class Homeork02_dataProvider extends BaseCrossBrowserTest {

    /*
    Open the site: http://opencart.abstracta.us/index.php?route=account/login
   Login with that credentials
   Email: clarusway@gmail.com
   Password: 123456789
   Using the Search function do it with Data Provider for Mac, iPad and Samsung
     */

    @Test(dataProvider = "data")
    public void test02(String key) {
        driver.get("http://opencart.abstracta.us/index.php?route=account/login ");
        WebElement search= driver.findElement(By.name("search"));
        search.sendKeys(key+ Keys.ENTER);


    }
    @DataProvider
    public Object[][]data(){
        return new Object[][]{
                {"Mac"},
                {"iPad"},
                {"Samsung"}
        };
    }
}
