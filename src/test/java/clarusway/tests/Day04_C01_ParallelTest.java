package clarusway.tests;

import org.testng.annotations.Test;
import utilites.BaseCrossBrowserTest;

public class Day04_C01_ParallelTest extends BaseCrossBrowserTest {

    @Test
    public void test01() {
        driver.get("https://www.google.com/");
        System.out.println("Test01 is running...");
    }

    @Test
    public void test02() {
        driver.get("https://www.amazon.com/");
        System.out.println("Test02 is running...");
    }
    @Test
    public void test03() {
        driver.get("https://www.trendyol.com/");
        System.out.println("Test03 is running...");
    }
}
