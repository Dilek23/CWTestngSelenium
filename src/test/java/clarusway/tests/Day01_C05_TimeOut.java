package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C05_TimeOut {
    /*
       timeOut
   - Test için bir timeOut - zaman aşımı değeri belirlemeye
   yardımcı olur (genellikle milisaniye olarak kullanılır).
   Test belirtilen zaman aşımı değerinden daha fazlasını alırsa,
   test başarısız olarak işaretlenir.
   - Yöntemin makul bir süre içinde geri döndüğünden emin
   olmak için bu zaman aşımını bir performans testi yapmak için
   kullanabiliriz
        */


    @Test(timeOut = 1000)
    public void passedTest() {
        System.out.println("1 saniyeden önce calisti...");
    }

    @Test(timeOut = 1000)
    public void timeOuttest() throws InterruptedException {
        System.out.println("1 saniyeden sonra calisti...");
        Thread.sleep(1100);

    }
    @Test(
            timeOut = 1000
    )
    public void timedOutTest2() throws InterruptedException {
        // Sout ifademiz calismayacaktir timeout exceptiondan dolayi
        Thread.sleep(1100);
        System.out.println("1 saniyeden sonra calisti");

    }
}
