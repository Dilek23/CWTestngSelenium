package clarusway.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.BaseCrossBrowserTest;
import utilites.ExcelUtils;
/*
Framework’ümüzde utilities package altında sürekli kullanılabilecek methodları özel bir class olan
ReusableMethods class’ında toparlayabiliriz
 */

/*
Go to URL: http://crossbrowsertesting.github.io/login-form.html
Login with credentials by using ExcelUtils
Username: tester@crossbrowsertesting.com
Password: test123
 */
public class Day06_C01_ExcelUtil extends BaseCrossBrowserTest {
    @Test
    public void test() {
    String path="C:\\Users\\seyda-pc\\IdeaProjects\\CWTestNGSelenium\\src\\test\\java\\clarusway\\tests\\recources\\testdata.xlsx";
        ExcelUtils eu=new ExcelUtils(path,2);
 driver.get(" http://crossbrowsertesting.github.io/login-form.html");
String email= eu.getCellData(1,0);
String passWord=eu.getCellData(1,1);
driver.findElement(By.id("username")).sendKeys(email);
driver.findElement(By.id("password")).sendKeys(passWord);

driver.findElement(By.id("submit")).click();

WebElement welcome=driver.findElement(By.className("ng-binding"));

        Assert.assertTrue(welcome.getText().contains(email));

    }
}
