package clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.BaseCrossBrowserTest;

public class Day03_C06_CrossBrowser extends BaseCrossBrowserTest {
/*
Cross Browser Testing; web uygulamanızın farklı tarayıcılarda beklendiği gibi çalışıp çalışmadığını kontrol etmeye yönelik
bir tür işlevsel testtir.
Web tabanlı uygulamalar Windows uygulamalarından tamamen farklıdır. Bir web uygulaması, son kullanıcı tarafından
herhangi bir tarayıcıda açılabilir. Örneğin, bazı insanlar herhangi bir siteye girmek için browser olarak;
Firefox tarayıcısında açmayı tercih ederken, diğerleri Chrome tarayıcı veya IE kullanıyor olabilir .
Selenium WebDriver kullanıyorsak, Internet Explorer, FireFox, Chrome, Safari tarayıcıları kullanarak test durumlarını
otomatikleştirebiliriz.
 */

    @Test
    public void crossBrowserTest(){
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");


    }

}
