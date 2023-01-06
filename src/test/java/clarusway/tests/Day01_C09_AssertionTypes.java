package clarusway.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day01_C09_AssertionTypes {
    /*
    TestNG assertionları, TestNG’de en sık kullanılan yöntemlerdir ve o kadar yaygındır ki, bu assertionlar olmadan bir
    TestNG kodu tam sayılmaz.
    TestNG assertionlar sayesinde bir testin başarılı olup olmadığına karar verir.
    Her bir test case için bir Assertion veya Verification kullanmalıyız.

     Assertionlar otomasyon kullanmamızın ana
    nedenlerinden biridir. TestNG de expected result
    ile actual result’ın eşleşip eşleşmediği
    doğrulanır.
        Soft Assertions in TestNG
     Hard assertion’ın tam tersidir. Bir assertion failed olursa test execution durmaz, sonraki adımlar çalışmaya devam
     eder, o anda AssertionError görülmez.
     Sonrasında konsolda görünür.
     Ayrıca Soft assert default olarak TestNG'yi içermez. Bunun için org.testng.asserts.Softassert paketini eklemek
     gerekir.
     Belirli doğrulamaların başarısızlığını umursamadığımızda ve test yürütmesinin devam etmesini istediğimizde ve ayrıca
     istisna hatalarını görmek istediğimizde kullanılır
            Soft Assert & Hard Assert
     - İkisi de TestNG’den gelir.
     - Kullanım amaçları farklıdır.
     - Yöntemleri aynıdır, Assert’lerin iki ana kategorisidir.
     - Assert → Assertion fail olursa diğer stepler için execution durur ve test failed olarak işaretlenir.
     - Verification → Assertion fail olursa diğer stepler için execution durmaz devam eder.
     - Testin sonunda, sonuçları görüntülemek için assertAll() yönteminin çağrılması gerekir
     */


    @Test
    public void hardAssertion() {

        System.out.println("Assertion oncesi calisiyor");
        Assert.assertEquals(1, 2);
        System.out.println("Assertion sonrasi calisiyor");


    }

    @Test
    public void softAssertion() {
        System.out.println("Soft Assertion oncesi calisiyor");
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(1, 1); // Fail
        softAssert.assertTrue(true); // Pass


        System.out.println("Soft Assertion sonrasi calisiyor");


        softAssert.assertAll(); // Method sonunda kesinlikle cagirilmali

    }
}