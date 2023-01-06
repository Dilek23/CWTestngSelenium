package clarusway.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilites.BaseTest;

public class SoftAssertHomework_02 extends BaseTest {
    /*
    Test Case2: Negative Username Test
Open page https://practicetestautomation.com/practice-test-login/
Type username incorrectUser into Username field.
Type password Password123 into Password field.
Puch Submit button.
Verify error message is displayed.Hata mesajının görüntülendiğini doğrulayın.
Verify error message text is Your username is invalid!Hata mesajı metninin Kullanıcı adınız geçersiz olduğunu doğrulayın!

     */

    @Test
    public void test02() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        //Type username incorrectUser into Username field.
        WebElement userName= driver.findElement(By.id("username"));
        userName.sendKeys(" incorrectUser"+ Keys.TAB);
        // Type password Password123 into Password field
        WebElement passWord= driver.findElement(By.id("password"));
        passWord.sendKeys(" Password123"+Keys.TAB);
        //Puch Submit button.
        WebElement submitButton= driver.findElement(By.className("btn"));
        submitButton.click();
        //Verify error message is displayed
        WebElement errorMessage= driver.findElement(By.id("error"));
        SoftAssert softassert=new SoftAssert();
        softassert.assertTrue(errorMessage.isDisplayed(),"Hata mesajı görüntelenemedi");
        //Verify error message text is Your username is invalid
       softassert.assertEquals(errorMessage.getText(),"Your username is invalid!");
         softassert.assertAll();
    }
}
