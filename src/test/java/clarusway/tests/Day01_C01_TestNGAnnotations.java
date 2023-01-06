package clarusway.tests;

import org.testng.annotations.*;

public class Day01_C01_TestNGAnnotations {
// Before/After suite
// Before/After Test
// Before/After Class
// Before/After Method
/*
Daha basit bir araç olan JUnit'in daha yeni sürümüdür. TestNG Framework, JUnit'ten sonra gelmiştir ve
TestNG Framework, daha güçlü işlevsellik ve kullanım sağlar.
TestNG, otomasyon test paketinde kullanılan en yaygın kullanılan açık kaynak test frameworklerinden biridir.
TestNG yalnızca JAVA ile çalışır ve JDK 7 veya üstünü gerektirir.
TestNG Framework, kolay açıklama, gruplama, sıralama ve parametrelendirme, bağımlı test, paralel testler vs.
yardımıyla daha güçlü ve esnek test senaryoları sağlayarak eski frameworkün sınırlamalarını ortadan kaldırır.
          TestNG'nin JUnit’e Göre Avantajları Nelerdir?
✓ Uygulama için HTML raporları üretir.
✓ TestNG'de, JUnit'te bulunan @beforeclass ve @afterclass gibi bir kısıtlama yoktur.
✓ TestNG, JUnit'te mümkün olmayan test senaryolarını kolayca gruplamanızı sağlar.
✓ TestNG, @Before/After suite, @Before/AfterTest ve Before/AfterGroup gibi üç ek düzeyi destekler.
✓ TestNG herhangi bir sınıfı genişletmez. TestNG Framework, her bir test senaryosunun diğer test
senaryolarından bağımsız olduğu test senaryolarını tanımlamanıza olanak tanır.
✓ Belirli bir grubun test senaryolarını çalıştırmanıza izin verir. 'Smoke' and 'Regression’ iki grup testlerin
olduğunu düşünülürse; yalnızca ‘Regression’ çalıştırılmak istenirse bu sadece TestNG Framework’de
mümkündür.
✓ Test senaryolarının paralel yürütülmesi, yani birden fazla test senaryosunun çalıştırılması yalnızca TestNG
Framework’de mümkündür, yine Cross Browser Test’e imkan tanır
 */

    @Test
    public void test01() {
        System.out.println("\t\t\t\tTest 01 calisiyor");
    }

    @Test
    public void test02() {

        System.out.println("\t\t\t\tTest 02 calisiyor");

    }
    @BeforeSuite
    public void beforeSuite(){//Bu paketteki tüm testlerden önce çalışır.

                System.out.println("Before suite calisti");

    }
    @AfterSuite
    public void afterSuite(){// Bu paketteki tüm testlerden sonra çalışır.
        System.out.println("\tBefore test calisti");

    }
    @BeforeTest
    public void beforeTest(){//Tüm test methodlarından  önce çalışır.
                System.out.println("\t\tBefore class calisti");
    }
    @AfterTest
    public void afterTest(){//Tüm test metodlarından sonra çalisir
        System.out.println("\tAfter test calisti");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("\t\tBefore class calisti");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("\t\tAfter class calisti");

    }
    @BeforeMethod
    public void beforeMethod(){//Her test methodundan önce/sonra çalışır
        System.out.println("\t\t\tBefore method calisti");
    }
    @AfterMethod//Her test methodundan önce/sonra çalışır

    public void afterMethod(){
        System.out.println("\t\t\tAfter method calisti");
    }

}
