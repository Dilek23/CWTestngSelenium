package clarusway.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import utilites.BaseTest;

import java.time.Duration;

public class DenemeDataProvider  {

    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")

    public void setUp(String browserName) {

        switch (browserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
    @DataProvider
    public Object[][]aramaData(){
        Object[][]arama=new Object[2][1];
        arama[0][0]="apple";
        arama[1][0]="xiaomi";
        return arama;

    }


    @Test
    public void testName(String arama){
        driver.get("https://www.amazon.com");
        WebElement aramaButton= driver.findElement(By.id("twotabsearchtextbox"));
        aramaButton.sendKeys(arama+Keys.ENTER);
        WebElement results= driver.findElement(By.xpath("//span[.='1-16 of over 100,000 results for']"));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(results.isDisplayed());





    }

}


