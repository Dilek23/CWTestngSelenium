package clarusway.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilites.BaseTest;

public class SoftAssertHomework_03 extends BaseTest {
    /*
    Test Case3: Negative Password Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field.
Type password incorrectPassword into Password field.
Puch Submit button.
Verify error message is displayed.
Verify error message text is Your password is invalid!
     */

    @Test
    public void test03() {
        driver.get(" https://practicetestautomation.com/practice-test-login/");
      //Type username student into Username field
        WebElement userName= driver.findElement(By.name("username"));
        userName.sendKeys("student"+ Keys.TAB);
      //Type password incorrectPassword into Password field.
      WebElement passWord= driver.findElement(By.name("password"));
      passWord.sendKeys(" incorrectPassword"+Keys.TAB);
        //Puch Submit button.
        WebElement submitButton= driver.findElement(By.className("btn"));
        submitButton.click();
      //Verify error message is displayed.
        WebElement errorMesage= driver.findElement(By.className("show"));
        SoftAssert sftAssert=new SoftAssert();
        sftAssert.assertFalse(!errorMesage.isDisplayed());
     //Verify error message text is Your password is invalid!
        sftAssert.assertTrue(errorMesage.getText().contains("Your password is invalid!"));
        sftAssert.assertAll();
    }
}
