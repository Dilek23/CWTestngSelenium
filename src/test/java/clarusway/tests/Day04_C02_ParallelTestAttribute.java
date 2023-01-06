package clarusway.tests;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute {
    @Test(
            threadPoolSize = 4,// Testiimizin kaç çekirdekte pralel olarak calısacagini belirler
            invocationCount = 10// Testimizin kac defa calisacagini belirler
    )
    public void test() {
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
    }
}
