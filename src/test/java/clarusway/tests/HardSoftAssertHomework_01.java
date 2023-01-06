package clarusway.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilites.BaseTest;

public class HardSoftAssertHomework_01 extends BaseTest{
       /*
        Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Puch Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.
         */

        @Test
        public void test01() {
            driver.get(" https://practicetestautomation.com/practice-test-login/");
            // Type username student into Username field

            WebElement userName= driver.findElement(By.id("username"));
            userName.sendKeys("student"+ Keys.TAB);
            // Type password Password123 into Password field
            WebElement passWord= driver.findElement(By.id("password"));
            passWord.sendKeys(" Password123"+Keys.TAB);
            //Puch Submit button.
            WebElement submitButton= driver.findElement(By.className("btn"));
            submitButton.click();
            //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
            String urlControl= driver.getCurrentUrl();
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(urlControl.contains(" practicetestautomation.com/logged-in-successfully/"));
            //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
            WebElement neWpage=driver.findElement(By.className("wp-block-separator"));
            softAssert.assertTrue(neWpage.getText().contains("Congratulations") ||neWpage.getText().contains("successfully logged in"));
            //Verify button Log out is displayed on the new page.
            WebElement button= driver.findElement(By.xpath("//a[.='Log out']"));
            softAssert.assertTrue(button.isDisplayed(),"expectedButton don't displayed");
        }
}
