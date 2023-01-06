package clarusway.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilites.BaseCrossBrowserTest;

public class Homework01_DataProvider extends BaseCrossBrowserTest {
    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
    Login with negative credentilas by Data Provider.Veri Sağlayıcı tarafından negatif kimlik bilgileriyle oturum açın.
    Then assert that ‘’Invalid credentials’’ is displayed
     */

    @Test(dataProvider = "dataProvider")
    public void testName(String name,String password) {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName= driver.findElement(By.name("username"));
        userName.sendKeys("name");
        WebElement passWord= driver.findElement(By.name("password"));
       passWord.sendKeys("password");
       WebElement button= driver.findElement(By.xpath("//div/button"));
      button.click();
      WebElement resultMessage= driver.findElement(By.xpath("//p[.='Invalid credentials']"));
        Assert.assertTrue(resultMessage.isDisplayed());
    }
    @DataProvider
    public Object[][] dataProvider(){
      return new Object[][]{
              {"dilek","2323"}


      };
    }
}
