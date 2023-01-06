package clarusway.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilites.BaseCrossBrowserTest;
import utilites.JSUtils;

public class Day06_C02_JSUtil extends BaseCrossBrowserTest {
/*
Go to URL: https://www.amazon.com/
Scroll in to view Amazon Ignite WebElement.
Scroll up search area WebElement.
Then flashing the background color.
 */
@Test
public void test() throws InterruptedException {
    JSUtils.driver = driver;

    driver.get("https://www.amazon.com/");

    JSUtils.scrollIntoViewJS( driver.findElement(By.partialLinkText("Amazon Ignite")));

    // Debug amacli
    Thread.sleep(4000);

    JSUtils.scrollAllUpByJS();

    Thread.sleep(4000);

    JSUtils.flash( driver.findElement(By.id("twotabsearchtextbox")));

    Thread.sleep(4000);

}


    }

